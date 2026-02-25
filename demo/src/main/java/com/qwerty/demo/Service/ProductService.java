package com.qwerty.demo.Service;

import com.qwerty.demo.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> dummyProducts= new ArrayList<>(Arrays.asList(
            new Product(1,"bottle",100),
            new Product(2,"flask",300),
            new Product(1,"watch",2000)
            ));
    public List<Product> getProducts(){
        return dummyProducts;
    }
    public Product getProductById(int prodId){
        return dummyProducts.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst().get();
    }
    public void addProduct(Product prod){
        dummyProducts.add(prod);
    }

    public void updateProduct(Product prod){
        int index=0;
        for (int i = 0; i < dummyProducts.size(); i++) {
            if(dummyProducts.get(i).getProdId()==prod.getProdId()){
                index=i;
            }
        }
        dummyProducts.set(index,prod);
    }

}
