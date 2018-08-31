package com.llf.hibernate.pojo;

import java.util.Set;

public class Category {
	int id;
    String name;
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
	
	Set<Product> Products;
	public Set<Product> getProducts() {
		return Products;
	}
	public void setProducts(Set<Product> products) {
		Products = products;
	}
}
