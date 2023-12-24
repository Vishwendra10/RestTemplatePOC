package com.yash.productdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.productdetails.model.ProductDetail;
import com.yash.productdetails.service.ProductDetailsService;

@RestController
@RequestMapping("/productDetail")
public class ProductDetailsController {
	
	@Autowired
	ProductDetailsService productDetailsService;
	
	@GetMapping(value="/getProductDetailsById/{id}")
	public ResponseEntity<ProductDetail> getProductDetails(@PathVariable int id) {
		
		ProductDetail productById= productDetailsService.getProductDetailsById(id);
		return new ResponseEntity<ProductDetail>(productById, HttpStatus.OK);
	}

}