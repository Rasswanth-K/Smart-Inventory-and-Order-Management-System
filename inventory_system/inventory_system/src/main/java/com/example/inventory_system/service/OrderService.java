package com.example.inventory_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.inventory_system.model.Orders;
import com.example.inventory_system.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public List<Orders> getAllOrders() {
        return repo.findAll();
    }

    public Orders addOrder(Orders order) {
        return repo.save(order);
    }

    public Orders updateOrder(Long id, Orders order) {
        Orders existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setStatus(order.getStatus());
            existing.setPriority(order.getPriority());
            return repo.save(existing);
        }

        return null;
    }
}
