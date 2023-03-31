package com.examples.S01springcoreapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {
	int id;
	String name;
	private List<String> departments;
	private Map<Integer,String> products;
	private  Properties countriesLanguages;
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	
	
	public Properties getCountriesLanguages() {
		return countriesLanguages;
	}
	public void setCountriesLanguages(Properties countriesLanguages) {
		this.countriesLanguages = countriesLanguages;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departments="+ departments+ ", products="+ products+",countriesLanguages ="+ countriesLanguages+",address="+address+"]";
	}
	
}
