package com.springSecurity.JWTSpring.repository;

import com.springSecurity.JWTSpring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product, Integer > {
}
