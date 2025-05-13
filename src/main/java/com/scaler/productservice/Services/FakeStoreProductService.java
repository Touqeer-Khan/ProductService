package com.scaler.productservice.Services;

import com.scaler.productservice.Exceptions.ProductNotFoundException;
import com.scaler.productservice.dtos.FakeStoreDtos;
import com.scaler.productservice.models.Category;
import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private Product convertFakeStoreDtosToProduct(FakeStoreDtos fakeStoreDtos) {
        Product product = new Product();
        product.setId(fakeStoreDtos.getId());
        product.setTitle(fakeStoreDtos.getTitle());
        product.setDescription(fakeStoreDtos.getDescription());
        product.setPrice(fakeStoreDtos.getPrice());

        Category category=new Category();
        category.setName(fakeStoreDtos.getCategory());
        product.setCategory(category);
        return product;

    }



    @Override
    public Product getProductById(Long productId) throws ProductNotFoundException {
//        FakeStoreDtos fakeStoreDtos= restTemplate.
//                            getForObject("https://fakestoreapi.com/products/"
//                            + productId,
//                            FakeStoreDtos.class);
//        return convertFakeStoreDtosToProduct(fakeStoreDtos);
        FakeStoreDtos fakeStoreDtos=restTemplate.getForObject(
                "https://fakestoreapi.com/products/"
                + productId , FakeStoreDtos.class);
        if (fakeStoreDtos==null){
            throw new ProductNotFoundException("Product with id"+ productId +"doenn't exist");
        }
        return convertFakeStoreDtosToProduct(fakeStoreDtos);
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreDtos[] fakeStoreDtos= restTemplate.getForObject(
                "https://fakestoreapi.com/products",
                FakeStoreDtos[].class
        );
        List<Product> products = new ArrayList<>();
        for (FakeStoreDtos fakeStoreDto: fakeStoreDtos) {
            products.add(convertFakeStoreDtosToProduct(fakeStoreDto));

        }
        return products;
    }
}
