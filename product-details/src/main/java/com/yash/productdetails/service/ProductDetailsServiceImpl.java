package com.yash.productdetails.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.productdetails.model.ProductDetail;
import com.yash.productdetails.repository.ProductDetailsRepository;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
	
	@Autowired
	ProductDetailsRepository productDetailsRepo;

	/*
	 * @Override public Optional<List<Product>> getAllProductDetails() { // TODO
	 * Auto-generated method stub List<Product> findAll =
	 * productDetailsRepo.findAll(); return Optional.ofNullable(findAll).filter(list
	 * -> !list.isEmpty()); }
	 */

	public ProductDetail getProductDetailsById(int id) {
		ProductDetail product= productDetailsRepo.findByProductId(id);
		return product;
	}
}
