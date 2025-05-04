package com.scaler.productservice.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends Basemodel {
    private String title;
    private String description;
    private double price;
    private String imageurl;
    private Category category;


}
