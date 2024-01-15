package com.microservice.store.service;

import com.microservice.store.payload.request.ProductRequest;

public interface ProductService {
    void addProduct(ProductRequest productRequest);
}
