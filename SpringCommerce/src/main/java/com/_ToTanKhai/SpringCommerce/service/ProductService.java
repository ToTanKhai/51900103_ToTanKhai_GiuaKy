package com._ToTanKhai.SpringCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._ToTanKhai.SpringCommerce.entity.Product;
import com._ToTanKhai.SpringCommerce.repository.*;
@Service
public class ProductService {

	@Autowired
	private ProductRepository PRepo;
	
	public void save(Product p) {
		PRepo.save(p);
	}
	


	public List<Product> getAllProduct() {
		return PRepo.findAll();
	}
	
	public Product getProductById(int id) {
		return PRepo.findById(id).get();
	}
	
	public void deleteById(int id) {
		PRepo.deleteById(id);
	}
	
	



	public List<Product> search(String keyword) {
		return PRepo.search(keyword);
	}
	
}
