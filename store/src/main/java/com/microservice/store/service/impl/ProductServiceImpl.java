package com.microservice.store.service.impl;

import com.microservice.store.entity.Product;
import com.microservice.store.payload.request.ProductRequest;
import com.microservice.store.repository.ProductRepository;
import com.microservice.store.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void addProduct(ProductRequest productRequest) {
        productRepository.save(mapDataProductToObject(productRequest));
    }

    private Product mapDataProductToObject(ProductRequest productRequest) {
        return Product.builder()
                .id(productRequest.getId())
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription())
                .imageUrl(productRequest.getImageUrl())
                .quantity(productRequest.getQuantity())
                .build();
    }
}
