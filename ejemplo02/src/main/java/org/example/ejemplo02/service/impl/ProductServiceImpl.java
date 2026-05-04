package org.example.ejemplo02.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.ejemplo02.domain.entity.Product;
import org.example.ejemplo02.repository.ProductRepository;
import org.example.ejemplo02.service.ProductService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void createProduct (Product product) {
        productRepository.save(product);
    }
}
