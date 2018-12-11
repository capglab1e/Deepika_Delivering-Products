package com.cg.CapStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.CapStore.dto.OrderDetails;
import com.cg.CapStore.dto.OrderProduct;
import com.cg.CapStore.dto.Product;
import com.cg.CapStore.service.ICapstoreService;


@Controller
public class CapStoreController {
	@Autowired
	ICapstoreService ser;
	
	@RequestMapping("all")
	public String order(@ModelAttribute("ordId")OrderDetails orderdet)
	{
		return "Idpage";
	}

	@RequestMapping(value="retrieveId",method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("ordId")OrderDetails orderdet)
	{
		OrderProduct ord=ser.search(orderdet.getOrderId());
	String prdId=ord.getProductId();

	OrderDetails ordDe=ser.getOrderDetails(orderdet.getOrderId());
	Integer qty=ordDe.getQuantity();
	System.out.println(qty);
	Product pr=ser.getProductDetails(prdId);
	Integer qtyAvai=pr.getQuanAvailable();
	System.out.println(qtyAvai);
	pr.setQuanAvailable(qtyAvai-qty);
	Product prod=ser.update(pr);
	System.out.println(prod.getQuanAvailable());
	
		
	
		
		return new ModelAndView("success","Quantity",prod.getQuanAvailable());
		
	}


}
