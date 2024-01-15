package com.microservice.store.service;

import com.microservice.store.payload.request.CategoryRequest;

public interface CategoryService {
    String addCategory(CategoryRequest categoryRequest);
}
