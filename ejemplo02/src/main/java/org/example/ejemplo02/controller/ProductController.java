package org.example.ejemplo02.controller;

import lombok.AllArgsConstructor;
import org.example.ejemplo02.domain.entity.Product;
import org.example.ejemplo02.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor

public class ProductController {
    private final ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        productService.createProduct(product);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
}
