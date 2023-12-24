package com.yash.productrating.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.productrating.model.ProductRating;
import com.yash.productrating.repository.ProductRatingRepository;

@Service
public class ProductRatingServiceImpl implements ProductRatingService {
	
	@Autowired
	ProductRatingRepository productRatingRepository;

	@Override
	public ProductRating getProductRatingById(int id) {
		ProductRating productRating = productRatingRepository.findByProductId(id);
		return productRating;
	}

}
