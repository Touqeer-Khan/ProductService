package com.scaler.productservice.Services;

import com.scaler.productservice.models.Product;

public interface ProductService {

    Product getProductById(Long productId);
}
