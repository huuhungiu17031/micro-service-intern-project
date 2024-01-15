package com.microservice.store.payload.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryRequest {
    private Integer id;
    private String categoryName;
    private Integer storeId;
}

