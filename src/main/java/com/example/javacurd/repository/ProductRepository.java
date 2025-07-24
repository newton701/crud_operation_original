package com.example.javacurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javacurd.entity.Product;



public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);
	

}
