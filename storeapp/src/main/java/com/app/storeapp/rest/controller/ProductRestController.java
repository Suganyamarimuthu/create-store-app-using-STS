package com.app.storeapp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.storeapp.domain.Product;
import com.app.storeapp.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductRestController {
@Autowired
private ProductService ps;

@GetMapping
public List<Product>getAllProducts(){
	return ps.getAllProducts();
	
}
@GetMapping("/{productId}")
public Product getProductById(@PathVariable("productId")Integer id) {
	return ps.getProduct(id);
}
@ResponseStatus(code = HttpStatus.NO_CONTENT)
@DeleteMapping("/{productId}")
public void deletetProductById(@PathVariable("productId")Integer id) {
	 ps.deleteProduct(id);
}
@PutMapping("/{productId}")
public Product updateProductById(@PathVariable("productId")Integer id,@RequestBody Product product) {
	return ps.updateProduct(product);
}
@ResponseStatus(code=HttpStatus.CREATED)
@PostMapping
public Product addtProduct(@RequestBody Product product) {
	return ps.createProduct(product);
}
}
