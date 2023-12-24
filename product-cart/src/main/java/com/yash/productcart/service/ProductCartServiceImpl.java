package com.yash.productcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.productcart.model.ProductCart;
import com.yash.productcart.repository.ProductCartRepository;

@Service
public class ProductCartServiceImpl implements ProductCartService {

	@Autowired
	ProductCartRepository productCartRepository;

	@Override
	public List<ProductCart> getAllCartProducts() {
		
		return productCartRepository.findAll();
	}

}
