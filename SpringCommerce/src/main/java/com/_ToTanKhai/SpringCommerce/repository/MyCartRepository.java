package com._ToTanKhai.SpringCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com._ToTanKhai.SpringCommerce.entity.MyCartList;


@Repository
public interface MyCartRepository extends JpaRepository<MyCartList, Integer> {

}
