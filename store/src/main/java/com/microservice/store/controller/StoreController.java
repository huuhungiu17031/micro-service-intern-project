package com.microservice.store.controller;

import com.microservice.store.payload.request.StoreRequest;
import com.microservice.store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;
    @PostMapping
    public ResponseEntity<String> createStore(@RequestBody StoreRequest storeRequest){
        String storeName = storeService.createStore(storeRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(storeName + "was created");
    }
}
