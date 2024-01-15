package com.microservice.store.payload.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {
    private Integer id;
    private String name;
    private Integer price;
    private String imageUrl;
    private String description;
    private Integer quantity;
}
