package com.example.inventory_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.inventory_system.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}