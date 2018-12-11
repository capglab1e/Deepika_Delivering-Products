package com.cg.CapStore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.CapStore.dto.OrderDetails;
import com.cg.CapStore.dto.OrderProduct;
import com.cg.CapStore.dto.Product;
@Repository("dao")
public class CapStoreDaoImpl implements ICapStoreDao {
  
	@PersistenceContext
	EntityManager em;
	
	@Override
	public OrderProduct search(String orderId) {
	OrderProduct ord=em.find(OrderProduct.class, orderId);
		return ord;
	}

	@Override
	public Product getProductDetails(String prodId) {
		Product pro=em.find(Product.class, prodId);
		return pro;
	}

	@Override
	public OrderDetails getOrderDetails(String ordId) {
		OrderDetails ordDet=em.find(OrderDetails.class, ordId);
		return ordDet;
	}

	@Override
	public Product update(Product product) {
		Product pr=em.merge(product);
		return pr;
	}

}
