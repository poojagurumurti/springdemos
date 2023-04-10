package com.example.S13SoringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.S13SoringBootREST.entity.Product;
import com.example.S13SoringBootREST.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	
	@Autowired
	private ProductRepository repository;
	
	@GetMapping
	public Iterable<Product> getProducts(){
		return  repository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Integer id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/{id}")
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		return repository.save(product);
	}
	

}
