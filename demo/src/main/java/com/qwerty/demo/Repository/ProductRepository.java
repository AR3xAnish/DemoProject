package com.qwerty.demo.Repository;

import com.qwerty.demo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
