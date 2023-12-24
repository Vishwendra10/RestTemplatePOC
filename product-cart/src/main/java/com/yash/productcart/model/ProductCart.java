package com.yash.productcart.model;

import jakarta.persistence.*;

@Entity
@Table(name="product_cart")
public class ProductCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@Transient
	private ProductDetail productDetail;
	@Transient
	private ProductRating productRating;
	public ProductCart(int productId, ProductDetail productDetail, ProductRating productRating) {
		super();
		this.productId = productId;
		this.productDetail = productDetail;
		this.productRating = productRating;
	}
	public ProductCart() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public ProductDetail getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}
	public ProductRating getProductRating() {
		return productRating;
	}
	public void setProductRating(ProductRating productRating) {
		this.productRating = productRating;
	}

}
