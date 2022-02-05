package com.example.productservice.Service;

import com.example.productservice.Entities.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product saveEmployee(Product employee) {
        return productRepository.save(employee);
    }

    public Product findProductById(String id) {
        return productRepository.findProductById(id);
    }
}