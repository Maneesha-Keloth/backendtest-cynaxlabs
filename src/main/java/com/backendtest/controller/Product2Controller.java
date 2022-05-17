package com.backendtest.controller;

import com.backendtest.model.Product2;
import com.backendtest.service.Product2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/products")
public class Product2Controller {

    @Autowired
    private Product2Service service;

    @PostMapping
    public Product2 create(@RequestBody Product2 product){
        return service.save(product);
    }

    @DeleteMapping("/{productId}")
    public String delete(@PathVariable String productId){
        return service.delete(Integer.parseInt(productId));
    }

    @PatchMapping
    public Product2 update(@RequestBody Product2 product){
        return service.update(product);
    }

    @GetMapping("/{productId}")
    public Product2 read(@PathVariable String productId){
        return service.findById(Integer.parseInt(productId));
    }
}
