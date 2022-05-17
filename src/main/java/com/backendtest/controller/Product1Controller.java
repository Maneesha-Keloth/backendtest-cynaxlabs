package com.backendtest.controller;

import com.backendtest.model.Product1;
import com.backendtest.service.Product1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/products")
public class Product1Controller {

    @Autowired
    private Product1Service service;

    @PostMapping
    public Product1 create(@RequestBody Product1 product1){
        return service.save(product1);
    }

    @DeleteMapping("/{productId}")
    public String delete(@PathVariable String productId){
        return service.delete(Integer.parseInt(productId));
    }

    @PatchMapping
    public Product1 update(@RequestBody Product1 product1){
        return service.update(product1);
    }

    @GetMapping("/{productId}")
    public Product1 read(@PathVariable String productId){
        return service.findById(Integer.parseInt(productId));
    }

}
