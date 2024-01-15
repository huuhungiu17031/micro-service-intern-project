package com.microservice.store.payload.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreRequest {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String district;
    private String city;
    private Boolean isActive;
    private Integer userId;
}
