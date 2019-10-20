package com.shoppingcatapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcatapp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
