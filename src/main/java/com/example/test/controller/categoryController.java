package com.example.test.controller;

import com.example.test.modal.category;
import com.example.test.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
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
