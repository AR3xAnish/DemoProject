package com.qwerty.demo.Controller;

import com.qwerty.demo.Model.Product;
import com.qwerty.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService prodservice;
    @RequestMapping("/products")
    List<Product> getProducts(){
        return prodservice.getProducts();
    }

    @GetMapping("/products/{prodId}")
    Product getProductById(@PathVariable int prodId){
        return prodservice.getProductById(prodId);
    }
}
