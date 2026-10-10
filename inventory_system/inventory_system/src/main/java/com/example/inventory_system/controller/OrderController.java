package com.example.inventory_system.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.inventory_system.model.Orders;
import com.example.inventory_system.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping
    public List<Orders> getAll() {
        return service.getAllOrders();
    }

    @PostMapping
    public Orders add(@RequestBody Orders order) {
        return service.addOrder(order);
    }

    @PutMapping("/{id}")
    public Orders update(@PathVariable Long id, @RequestBody Orders order) {
        return service.updateOrder(id, order);
    }
}
