package com.app.storeapp.service;

import java.util.List;

import com.app.storeapp.domain.Product;

public interface ProductService {
public Product createProduct(Product product);
public Product updateProduct(Product product);
public Product getProduct(Integer id);
public boolean deleteProduct(Integer id);
public List<Product> getAllProducts();

}
