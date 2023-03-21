package com.app.storeapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.storeapp.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
