package com.scaler.productservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@Entity(name = "Products")
public class Product extends Basemodel {
    private String title;
    private String description;
    private double price;
    private String imageurl;
    @ManyToOne
    private Category category;


}
