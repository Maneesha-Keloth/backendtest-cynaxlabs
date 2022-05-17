package com.backendtest.service;

import com.backendtest.model.Product2;
import com.backendtest.repository.Product2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Product2Service {

    @Autowired
    private Product2Repository product2Repository;

    public Product2 save(Product2 product2){
        return product2Repository.save(product2);
    }

    public Product2 findById(int id){
        return product2Repository.findById(id).get();
    }

    public String delete(int id) {
        product2Repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product2 update(Product2 product2) {
        Product2 existingProduct2 = product2Repository.findById(product2.getId()).orElse(null);
        existingProduct2.setName(product2.getName());
        existingProduct2.setPrice(product2.getPrice());
        return product2Repository.save(existingProduct2);
    }
}
