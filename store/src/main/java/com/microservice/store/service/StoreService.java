package com.microservice.store.service;

import com.microservice.store.payload.request.StoreRequest;

public interface StoreService {
    String createStore(StoreRequest storeRequest);
}
