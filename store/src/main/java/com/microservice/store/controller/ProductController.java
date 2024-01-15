package com.microservice.store.controller;

import com.microservice.store.payload.request.ProductRequest;
import com.microservice.store.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody ProductRequest productRequest){
        productService.addProduct(productRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("Create product successfully");
    }

}
