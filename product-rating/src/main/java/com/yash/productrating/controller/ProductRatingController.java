package com.yash.productrating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.productrating.model.ProductRating;
import com.yash.productrating.service.ProductRatingService;

@RestController
@RequestMapping("/productRating")
public class ProductRatingController {
	
	@Autowired
	ProductRatingService productRatingService;
	
	@GetMapping(value="/getProductRatingsById/{productid}")
	public ResponseEntity<ProductRating> getProductDetails(@PathVariable int productid) {
		
		ProductRating ratingByProductId= productRatingService.getProductRatingById(productid);
		return new ResponseEntity<ProductRating>(ratingByProductId, HttpStatus.OK);
	}

}