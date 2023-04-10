package com.example.SpringbootREST.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringbootREST.entity.Product;



public interface ProductRepository extends CrudRepository<Product, Integer>{
	List<Product> findByName(String name);
	List<Product> findByPrice(Double price);
	List<Product> findByNameAndPrice(String name,Double price);
	
}
