package com.app.storeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.storeapp.dao.ProductRepository;
import com.app.storeapp.domain.Product;

@SpringBootApplication
public class StoreappApplication implements CommandLineRunner{
	
	@Autowired
	ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Executing the SQL queries");
		repository.save(new Product(null, "TV", 1000.00, "ELECTRONICS", "LG"));
		repository.save(new Product(null, "TV", 1000.00, "ELECTRONICS", "SONY"));
		repository.save(new Product(null, "TV", 1000.00, "ELECTRONICS", "ONIDA"));
		repository.save(new Product(null, "TV", 1000.00, "ELECTRONICS", "SAMSUNG"));
		repository.save(new Product(null, "MOBILE", 1000.00, "ELECTRONICS", "LG"));
		repository.save(new Product(null, "MOBILE", 1000.00, "ELECTRONICS", "NOKIA"));
		repository.save(new Product(null, "MOBILE", 1000.00, "ELECTRONICS", "SAMSUNG"));
		repository.save(new Product(null, "MOBILE", 1000.00, "ELECTRONICS", "REDMI"));
		repository.save(new Product(null, "MOBILE", 1000.00, "ELECTRONICS", "LG"));
		repository.save(new Product(null, "MOBILE", 1000.00, "ELECTRONICS", "WHIRLPOOL"));
		
	}

	
	
	
}
