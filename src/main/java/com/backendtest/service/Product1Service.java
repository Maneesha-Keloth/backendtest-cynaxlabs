package com.backendtest.service;

import com.backendtest.model.Product1;
import com.backendtest.repository.Product1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Product1Service {

    @Autowired
    private Product1Repository productRepository1;

    public Product1 save(Product1 product1){
        return productRepository1.save(product1);
    }

    public Product1 findById(int id){
        return productRepository1.findById(id).get();
    }

    public String delete(int id) {
        productRepository1.deleteById(id);
        return "product removed !! " + id;
    }

    public Product1 update(Product1 product1) {
        Product1 existingProduct1 = productRepository1.findById(product1.getId()).orElse(null);
        existingProduct1.setName(product1.getName());
        existingProduct1.setPrice(product1.getPrice());
        return productRepository1.save(existingProduct1);
    }


}
