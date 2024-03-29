package com.shoppingcatapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcatapp.entities.Product;
import com.shoppingcatapp.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> listAll() {
		return repository.findAll();
	}
	
	public Product save(Product product) {
		return repository.save(product);
	}
	
	public Product get(Long id) {
		return repository.findById(id).get();
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
