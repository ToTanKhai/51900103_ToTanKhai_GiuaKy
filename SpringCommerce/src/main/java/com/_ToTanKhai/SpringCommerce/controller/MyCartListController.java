package com._ToTanKhai.SpringCommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com._ToTanKhai.SpringCommerce.service.MyCartListService;

@Controller
public class MyCartListController {
	@Autowired
	private MyCartListService service;
	@RequestMapping("/deleteMyCart/{id}")
	public String deleteMyCart(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/my_cart";
	}
}
