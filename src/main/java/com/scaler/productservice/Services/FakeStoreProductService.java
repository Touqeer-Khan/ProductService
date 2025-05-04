package com.scaler.productservice.Services;

import com.scaler.productservice.dtos.FakeStoreDtos;
import com.scaler.productservice.models.Category;
import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    public Product getProductById(Long productId) {

        FakeStoreDtos productDtos= restTemplate.
                            getForObject("https://fakestoreapi.com/products/"
                            + productId,
                            FakeStoreDtos.class);
        return convertFakeStoreDtosToProduct(productDtos);
    }
}
