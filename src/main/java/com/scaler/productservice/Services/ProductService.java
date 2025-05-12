package com.scaler.productservice.Services;

import com.scaler.productservice.models.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Long productId);

    List<Product> getAllProducts();

//    List<Product> getAllProducts();
}
