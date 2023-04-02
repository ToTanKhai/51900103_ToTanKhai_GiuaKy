package com._ToTanKhai.SpringCommerce.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com._ToTanKhai.SpringCommerce.entity.Product;
import com._ToTanKhai.SpringCommerce.entity.MyCartList;
import com._ToTanKhai.SpringCommerce.service.MyCartListService;
import com._ToTanKhai.SpringCommerce.service.ProductService;




@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	
	@Autowired
	private MyCartListService myCartService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/create_product")
	public String createProduct() {
		return "createProduct";
	}
	
	@GetMapping("/list_product")
	public ModelAndView getAllProduct() {
		List<Product> list = service.getAllProduct();
		ModelAndView m = new ModelAndView();
		m.setViewName("productList");
		m.addObject("product", list);
		return new ModelAndView("productList", "product", list);
	}
	
	@PostMapping("/save")
	public String addProduct(@ModelAttribute Product p) {
		service.save(p);
		return "redirect:/list_product";
	}
	
	@GetMapping("/my_cart")
	public String getMyCart(Model model) {
		
		List<MyCartList>list =  myCartService.getAllMyCart();
		model.addAttribute("product", list);
		return "myCart";
	}
	@RequestMapping("/myCart/{id}")
	public String getAllMyCart(@PathVariable("id") int id) {
		Product p = service.getProductById(id);
		MyCartList mp = new MyCartList(p.getId(), p.getName(), p.getPrice(), p.getCategory(), p.getBrand(), p.getColor()); 
		myCartService.saveMyCart(mp);
		return "redirect:/my_cart";
	}
	
	@RequestMapping("/editProduct/{id}")
	public String editProduct(@PathVariable("id") int id, Model model) {
		Product p = service.getProductById(id);
		model.addAttribute("product", p);
		return "productEdit";
	}
	
	@RequestMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/list_product";
	}
	
	@GetMapping("/search")
	public String search(@Param("keyword")String keyword, Model model) {
		
		System.out.println("Keyword:" +keyword);
		
		List<Product> searchResult = service.search(keyword);
		model.addAttribute("keyword", keyword);
		
		model.addAttribute("searchResult", searchResult);
		return "search_result";
		
	}
	
}
