package com.scaler.productservice.models;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Basemodel {
    @Id
    private double id;
//    private int createdat;
//    private int updatedat;
}
