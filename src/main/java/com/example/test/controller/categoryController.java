package com.example.test.controller;

import com.example.test.modal.category;
import com.example.test.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class categoryController {
    @Autowired
    categoryService service;

    @PostMapping(path = "/create-category")
    public category create(@RequestBody category categories){
        return service.create(categories);
    }
    @GetMapping(path = "/get-category")
    public List<category> get(){
        return service.get();
    }
}
