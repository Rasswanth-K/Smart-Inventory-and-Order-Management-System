package com.example.inventory_system.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.inventory_system.model.Product;
import com.example.inventory_system.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product add(Product p) {
        return repo.save(p);
    }
    public Product updateProduct(Long id, Product product) {
        Product existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(product.getName());
            existing.setPrice(product.getPrice());
            existing.setQuantity(product.getQuantity());
            existing.setCategory(product.getCategory());

            return repo.save(existing);
        }

        return null;
    }
    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
    public List<Product> getLowStockProducts() {
        return repo.findAll()
                .stream()
                .filter(p -> p.getQuantity() < 10)
                .toList();
    }
    public long getTotalProducts() {
        return repo.count();
    }
}
