package com.ape.springapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ape.springapp.entity.Product;
import com.ape.springapp.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class RestProductController {

    private final ProductRepository productRepository;

    public RestProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> productos = productRepository.findAll();
        return ResponseEntity.ok(productos);
    }
}