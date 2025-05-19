package com.exercise.Caching.repository;

import com.exercise.Caching.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
