package com.eshop.productservice.model;

import lombok.Data;

@Data
public class Product extends BaseModel {
    private String title;
    private String desc;
    private int price;
    private String image;
    private Category category;
}
