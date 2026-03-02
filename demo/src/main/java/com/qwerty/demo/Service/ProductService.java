package com.qwerty.demo.Service;

import com.qwerty.demo.Model.Product;
import com.qwerty.demo.Repository.ProductRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
//    List<Product> dummyProducts= new ArrayList<>(Arrays.asList(
//            new Product(1,"bottle",100),
//            new Product(2,"flask",300),
//            new Product(1,"watch",2000)
//            ));
    @Autowired
    ProductRepository repo;

    public List<Product> getProducts(){

        return repo.findAll();
    }
    public Product getProductById(int prodId){
        return repo.findById(prodId).orElseThrow(()-> new RuntimeException("Not in DB"));
    }
    public void addProduct(Product prod){
//        dummyProducts.add(prod);
        repo.save(prod);
    }
    public void updateProduct(Product prod){
        repo.save(prod);
    }
    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
    /*
    public void updateProduct(Product prod){
        int index=0;
        for (int i = 0; i < dummyProducts.size(); i++) {
            if(dummyProducts.get(i).getProdId()==prod.getProdId()){
                index=i;
            }
        }
        dummyProducts.set(index,prod);
    }
    public void deleteProduct(int prodId){
        int index=0;
        for (int i = 0; i < dummyProducts.size(); i++) {
            if(dummyProducts.get(i).getProdId()==prodId){
                index=i;
            }
        }
        dummyProducts.remove(index);
    }
    */
}
