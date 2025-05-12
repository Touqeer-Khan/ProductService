package com.scaler.productservice.Controller;


import com.scaler.productservice.Services.ProductService;
import com.scaler.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }



    @GetMapping("/{id}")
    public Product getProductById (@PathVariable("id") long id){
        return productService.getProductById(id);
    }
    @GetMapping()
    public List<Product> getAllProducts(){
//        return null;

        return productService.getAllProducts();
    }
    @PostMapping("/{id}")
    public Product updateProduct(@PathVariable("id") long productId,
                                 @RequestBody Product product){
        return null;
    }
}
