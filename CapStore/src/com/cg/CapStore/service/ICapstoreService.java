package com.cg.CapStore.service;

import com.cg.CapStore.dto.OrderDetails;
import com.cg.CapStore.dto.OrderProduct;
import com.cg.CapStore.dto.Product;

public interface ICapstoreService {
	public OrderProduct search(String ordId);
	public Product getProductDetails(String prodId);
	  public OrderDetails getOrderDetails(String ordId);
		public Product update(Product product);
}
