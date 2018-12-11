package com.cg.CapStore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
   @Id
	@Column(name = "prod_id")
	private String productId;

	@Column(name = "prod_name")
	private String productName;
	@Column(name = "description")
	private String description;
	@Column(name = "price")
	private double price;
	@Column(name = "category_id")
	private String categoryId;
	@Column(name = "subcategory_id")
	private String subcatId;
	@Column(name = "qty_available")
	private Integer quanAvailable;
	@Column(name = "qty_supplied")
	private Integer quanSupplied;
	@Column(name = "merchant_id")
	private String merchantId;
	@Column(name = "rating")
	private Integer rating;
	@Column(name = "merchant_userId")
	private Integer merUserId;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, String description,
			double price, String categoryId, String subcatId,
			Integer quanAvailable, Integer quanSupplied, String merchantId,
			Integer rating, Integer merUserId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.categoryId = categoryId;
		this.subcatId = subcatId;
		this.quanAvailable = quanAvailable;
		this.quanSupplied = quanSupplied;
		this.merchantId = merchantId;
		this.rating = rating;
		this.merUserId = merUserId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubcatId() {
		return subcatId;
	}

	public void setSubcatId(String subcatId) {
		this.subcatId = subcatId;
	}

	public Integer getQuanAvailable() {
		return quanAvailable;
	}

	public void setQuanAvailable(Integer quanAvailable) {
		this.quanAvailable = quanAvailable;
	}

	public Integer getQuanSupplied() {
		return quanSupplied;
	}

	public void setQuanSupplied(Integer quanSupplied) {
		this.quanSupplied = quanSupplied;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getMerUserId() {
		return merUserId;
	}

	public void setMerUserId(Integer merUserId) {
		this.merUserId = merUserId;
	}

}
