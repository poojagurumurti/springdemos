package com.examples.S06SpringORMDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORMDemo.dao.ProductDao;
import com.examples.S06SpringORMDemo.entity.Product;



public class App 
{
    public static void main( String[] args )
    {
//    	create();
//    	update();
    	
//    	delete();
    	
//    	find();
    	findAll();
		
    }

	private static void findAll() {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDao productDao= (ProductDao) ctx.getBean("productdao");
		
		List<Product> products = productDao.findAll();
		System.out.println("Product found -"+products);
		
	}

	private static void find() {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDao productDao= (ProductDao) ctx.getBean("productdao");
		
		Product product = productDao.find(2);
		System.out.println("Product found -"+product);
		
	}

	private static void delete() {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDao productDao= (ProductDao) ctx.getBean("productdao");
		Product product =new Product();
		product.setId(1);
		
		productDao.delete(product);
		System.out.println("Product deleted");
		
	}

	private static void update() {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDao productDao= (ProductDao) ctx.getBean("productdao");
		Product product =new Product();
		product.setId(1);
		product.setName("Computer");
		product.setDescription("Deskotp computer");
		product.setPrice(45000.90);
		
		int result =productDao.create(product);
		System.out.println("Product updated");
		
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDao productDao= (ProductDao) ctx.getBean("productdao");
		Product product =new Product();
		product.setId(2);
		product.setName("Lapotp");
		product.setDescription("Lenova desktop");
		product.setPrice(89000);
		
		int result =productDao.create(product);
		System.out.println("Product created "+result);
	}
}
