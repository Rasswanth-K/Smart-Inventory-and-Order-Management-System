package com.example.inventory_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.inventory_system.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
