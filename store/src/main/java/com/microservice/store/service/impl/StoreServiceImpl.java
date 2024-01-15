package com.microservice.store.service.impl;

import com.microservice.store.entity.Store;
import com.microservice.store.payload.request.StoreRequest;
import com.microservice.store.repository.StoreRepository;
import com.microservice.store.service.StoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StoreServiceImpl implements StoreService {
    private final StoreRepository storeRepository;
    @Override
    public String createStore(StoreRequest storeRequest) {
        Store store = mapDataStoreToObject(storeRequest);
        return store.getName();
    }

    private Store mapDataStoreToObject(StoreRequest storeRequest){
        return Store.builder()
                .id(storeRequest.getId())
                .city(storeRequest.getCity())
                .name(storeRequest.getName())
                .userId(storeRequest.getUserId())
                .isActive(storeRequest.getIsActive())
                .district(storeRequest.getDistrict())
                .phoneNumber(storeRequest.getPhoneNumber())
                .build();
    }
}
