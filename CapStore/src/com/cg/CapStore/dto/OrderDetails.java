package com.cg.CapStore.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetails {
	@Id
	@Column(name = "ORDER_ID")
	private String orderId;
	@Column(name = "USER_ID")
	private String userId;
	@Column(name = "PAYMENT_ID")
	private String paymentId;
	@Column(name = "ORDER_STATUS")
	private String orderStatus;
	@Column(name = "TOTAL_PRICE")
	private double price;
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@Column(name="quantity")
	private Integer Quantity;

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	

	public OrderDetails(String orderId, String userId, String paymentId,
			String orderStatus, double price, Date orderDate, Integer quantity) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.paymentId = paymentId;
		this.orderStatus = orderStatus;
		this.price = price;
		this.orderDate = orderDate;
		Quantity = quantity;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
