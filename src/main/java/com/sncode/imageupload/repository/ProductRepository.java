package com.sncode.imageupload.repository;

import com.sncode.imageupload.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductName(String productName);

//    Optional<Product> findByName(String productName);


}
