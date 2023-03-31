package com.example.S11SpringBootDataJPA;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootDataJPA.entity.Product;
import com.example.S11SpringBootDataJPA.repository.ProductRepository;

@SpringBootTest
class S11SpringBootDataJpaApplicationTests {
	
	
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}
	
	
	//@Test
	
	void createProduct() {
		Product product = new Product();
		product.setName("Phone");
		product.setDesc("One Plus Nord");
		product.setPrice(380000);
		
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		productRepository.save(product);
		
		
	}
	
	//@Test
	void readProduct() {
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct =productRepository.findById(1);
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
		}else {
			System.out.println("Product not present in db");
		}
	}
	
	//@Test
	void updateProduct() {
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct =productRepository.findById(2);
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
			product.setDesc("Lenova Laptop");
			product.setName("Lenova");
			product.setPrice(100000);
			productRepository.save(product);
		}else {
			System.out.println("Product not present in db");
		}
	}
	
	@Test
	void readAllProducts() {
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		Iterable<Product> products =(List<Product>)productRepository.findAll();
		System.out.println(products);
		
	}

}
