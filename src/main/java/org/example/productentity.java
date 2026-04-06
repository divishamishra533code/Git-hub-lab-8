package com.example.productsearch.repository;

import com.example.productsearch.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    List<Product> findByCategory(String category);

    List<Product> findByPriceBetween(double min, double max);

    
    @Query("SELECT p FROM Product p ORDER BY p.price ASC")
    List<Product> getAllSortedByPrice();

    // Products above certain price
    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<Product> getExpensiveProducts(double price);

    // Products by category (JPQL)
    @Query("SELECT p FROM Product p WHERE p.category = :category")
    List<Product> getProductsByCategoryJPQL(String category);
}
