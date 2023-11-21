package com.eshop.productservice.controller;

import com.eshop.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    ProductController(@Qualifier("FakeStoreProductService") ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id){
        System.out.print("Inside product controller");
    //return "In side product controller get product by id "+id;
        return productService.getProductById(id);
    }

    @GetMapping
    public void getAllProduct(){

    }

    @PostMapping
    public void createProduct(){

    }
    @DeleteMapping
    public void deleteProduct(){

    }

    public void updateProductById(){

    }
}
