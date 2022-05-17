package com.backendtest.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="products2")
public class Product2 {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private double price;
    private String currencyCode;
}
