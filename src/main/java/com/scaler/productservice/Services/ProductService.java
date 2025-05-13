package com.scaler.productservice.Services;

import com.scaler.productservice.Exceptions.ProductNotFoundException;
import com.scaler.productservice.models.Product;

import java.util.List;

public interface ProductService {

//    Product getProductById(Long productId);
//    Product getProductById() throws ProductNotFoundException;

    //    public Product getProductById(Long productId) {
    Product getProductById(Long productId) throws ProductNotFoundException;

    List<Product> getAllProducts();

//    List<Product> getAllProducts();
}
