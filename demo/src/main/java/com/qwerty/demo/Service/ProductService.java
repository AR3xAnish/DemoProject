package com.qwerty.demo.Service;

import com.qwerty.demo.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> dummyProducts= Arrays.asList(
            new Product(1,"bottle",100),
            new Product(2,"flask",300),
            new Product(1,"watch",2000)
            );
    public List<Product> getProducts(){
        return dummyProducts;
    }
    public Product getProductById(int prodId){
        return dummyProducts.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst().get();
    }

}
