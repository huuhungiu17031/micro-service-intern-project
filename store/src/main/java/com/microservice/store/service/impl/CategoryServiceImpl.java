package com.microservice.store.service.impl;

import com.microservice.store.entity.Category;
import com.microservice.store.payload.request.CategoryRequest;
import com.microservice.store.repository.CategoryRepository;
import com.microservice.store.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public String addCategory(CategoryRequest categoryRequest) {
        Category category = categoryRepository.save(mapDataCategoryToObject(categoryRequest));
        return category.getCategoryName();
    }

    private Category mapDataCategoryToObject(CategoryRequest categoryRequest){
        return Category.builder().id(categoryRequest.getId()).categoryName(categoryRequest.getCategoryName()).build();
    }
}
