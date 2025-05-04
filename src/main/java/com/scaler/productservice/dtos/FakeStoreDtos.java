package com.scaler.productservice.dtos;


import com.scaler.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDtos {
    private double id;
    private String title;
    private String description;
    private double price;
    private String imageurl;
    private String category;
}
