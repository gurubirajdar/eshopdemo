package com.eshop.productservice.service;

import org.springframework.stereotype.Service;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    @Override
    public String getProductById(Long id) {
        return "Fake store product id is "+id;
    }

    @Override
    public void getAllProducts() {

    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public void createProduct() {

    }

    @Override
    public void updateProductById() {

    }
}
