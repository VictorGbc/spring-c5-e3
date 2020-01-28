package com.endava.springc5e3.controllers;

import com.endava.springc5e3.entities.Product;
import com.endava.springc5e3.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/all")
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
