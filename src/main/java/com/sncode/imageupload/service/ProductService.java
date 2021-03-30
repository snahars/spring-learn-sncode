package com.sncode.imageupload.service;

import com.sncode.imageupload.entity.Product;
import com.sncode.imageupload.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public Product addProduct ( Product product) {
        return productRepository.save(product);
    }

    public List<Product> addProducts (List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts () {
        return productRepository.findAll();
    }

    public Product getProductById (Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public Product getProductByProductName (String productName) {
        return productRepository.findByProductName(productName);
    }

    public String deleteProduct (Long productId) {
        productRepository.deleteById(productId);
        return "Product Removed of " + productId;
    }

    public Product updateProduct (Product product) {
        Product existingProduct = productRepository.findById(product.getProductId()).orElse(null);

        existingProduct.setProductName(product.getProductName());
//        existingProduct.setQuantity(product.getQuantity());
//        existingProduct.setPrice(product.getPrice());

        productRepository.save(existingProduct);

        return existingProduct;
    }

}
