package com.cg.CapStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.CapStore.dao.ICapStoreDao;
import com.cg.CapStore.dto.OrderDetails;
import com.cg.CapStore.dto.OrderProduct;
import com.cg.CapStore.dto.Product;

@Service("ser")
@Transactional
public class CapStoreServiceImpl implements ICapstoreService {
	@Autowired
	ICapStoreDao dao;

	@Override
	public OrderProduct search(String ordId) {
		
		return dao.search(ordId);
	}

	@Override
	public Product getProductDetails(String prodId) {
		// TODO Auto-generated method stub
		return dao.getProductDetails(prodId);
	}

	@Override
	public OrderDetails getOrderDetails(String ordId) {
		// TODO Auto-generated method stub
		return dao.getOrderDetails(ordId);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return dao.update(product);
	}

}
