package com.scaler.productservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="Categories")
public class Category extends Basemodel {
    private double id;
    private String name;
}
