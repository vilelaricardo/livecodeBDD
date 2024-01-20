package com.livecodebdd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {


    @GetMapping("/products")
    public List<String> getAllProducts(){

        List<String> products = new ArrayList<String>();

        products.add("Mouse");
        products.add("Keyboard");
        products.add("Pen");
        products.add("Screen");
        products.add("Notebook");
        products.add("CellPhone");

        return products;
    }
}
