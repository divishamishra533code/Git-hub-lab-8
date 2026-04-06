package com.example.productsearch;

import com.example.productsearch.entity.Product;
import com.example.productsearch.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(ProductRepository repo) {
        return args -> {
            repo.save(new Product("iPhone", "Electronics", 80000));
            repo.save(new Product("Laptop", "Electronics", 60000));
            repo.save(new Product("Shoes", "Fashion", 3000));
            repo.save(new Product("T-shirt", "Fashion", 800));
            repo.save(new Product("Watch", "Accessories", 5000));
        };
    }
}
