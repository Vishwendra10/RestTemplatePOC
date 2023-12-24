package com.yash.productcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yash.productcart.model.ProductCart;
import com.yash.productcart.model.ProductDetail;
import com.yash.productcart.model.ProductRating;
import com.yash.productcart.service.ProductCartService;

@RestController
@RequestMapping("/productCart")
public class ProductCartController {
	
	@Autowired
	ProductCartService productCartService;
	
	@Autowired
    RestTemplate restTemplate;

	@GetMapping(value="/getAllCartProducts")
	public ResponseEntity<List<ProductCart>> getAllCartProducts() {
		
		List<ProductCart> cartList = productCartService.getAllCartProducts();
		for(ProductCart productCart: cartList) {
			int productId=productCart.getProductId();
			ProductDetail productDetail = restTemplate.getForObject("http://localhost:8087/productDetail/getProductDetailsById/"+productId,ProductDetail.class);
			ProductRating productRating = restTemplate.getForObject("http://localhost:8088/productRating/getProductRatingsById/"+productId,ProductRating.class);
			
			productCart.setProductDetail(productDetail);
			productCart.setProductRating(productRating);
		}
		
		return new ResponseEntity<List<ProductCart>>(cartList, HttpStatus.OK);
	}
}
