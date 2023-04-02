package com._ToTanKhai.SpringCommerce.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com._ToTanKhai.SpringCommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	@Query(value= "select * from product where name LIKE %?1% ", nativeQuery = true)
	public List<Product> search (String keyword);
}


