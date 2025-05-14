package com.scaler.productservice.Controller;


import com.scaler.productservice.Exceptions.ProductNotFoundException;
import com.scaler.productservice.Services.ProductService;
import com.scaler.productservice.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;


//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
    public ProductController(@Qualifier("selfProductservice")ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")


//    public Product getProductById(@PathVariable("id") Long id) {
//        return productService.getProductById(id);
//    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
//        System.out.println("Random text!!!");
    public Product getProductById(@PathVariable("id") long id) throws ProductNotFoundException {
//        Product product = productService.getProductById(id);
//
//        return new ResponseEntity<>(
//                product,
//                HttpStatus.OK
//        );
        return productService.getProductById(id);
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return null;
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long productId,
                                 @RequestBody Product product) {
        return null;
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long productId,
                                  @RequestBody Product product) {
        return null;
    }

    //it'll call first
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(),
                HttpStatus.OK);
    }
}


