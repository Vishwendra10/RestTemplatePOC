package com.yash.productcart.model;

public class ProductDetail {
	
	private int productDetailId;
	private int productId;
	private String productName;
	private String description;
	private long price;
	public int getProductDetailId() {
		return productDetailId;
	}
	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public ProductDetail(int productDetailId, int productId, String productName, String description, long price) {
		super();
		this.productDetailId = productDetailId;
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}
	public ProductDetail() {
		super();
	}
	
}
