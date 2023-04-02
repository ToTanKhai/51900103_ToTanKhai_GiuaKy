package com._ToTanKhai.SpringCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._ToTanKhai.SpringCommerce.entity.MyCartList;
import com._ToTanKhai.SpringCommerce.repository.MyCartRepository;

@Service
public class MyCartListService {

	@Autowired
	private MyCartRepository myCart;
	public void saveMyCart(MyCartList cart) {
		myCart.save(cart);
	}
	

	public List<MyCartList> getAllMyCart() {
		return myCart.findAll();
	}
	
	public void deleteById(int id) {
		myCart.deleteById(id);
	}
}
