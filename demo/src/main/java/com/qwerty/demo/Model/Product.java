package com.qwerty.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private double price;
}
