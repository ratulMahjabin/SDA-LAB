package com.example.productservice.Controller;

import com.example.productservice.Entities.Product;
import com.example.productservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveEmployee(product);
    }
    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") String employeeId){
        return productService.findProductById(employeeId);
    }
}