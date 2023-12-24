package com.yash.productrating.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product_rating")
public class ProductRating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ratingId;
	private int productId;
	private long rating;
	private String comment;
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public ProductRating(int ratingId, int productId, long rating, String comment) {
		super();
		this.ratingId = ratingId;
		this.productId = productId;
		this.rating = rating;
		this.comment = comment;
	}
	public ProductRating() {
		super();
	}
	
}
