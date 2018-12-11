package com.cg.CapStore.dao;

import com.cg.CapStore.dto.OrderDetails;
import com.cg.CapStore.dto.OrderProduct;
import com.cg.CapStore.dto.Product;

public interface ICapStoreDao {
	public OrderProduct search(String orderId);
  public OrderDetails getOrderDetails(String ordId);
	public Product getProductDetails(String prodId);
	public Product update(Product product);

}
