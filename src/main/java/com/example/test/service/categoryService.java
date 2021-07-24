package com.example.test.service;

import com.example.test.modal.category;
import com.example.test.repository.categoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class categoryService {
    @Autowired
    categoryRepo categoryRepository;

    public category create(category categories){
        return categoryRepository.save(categories);
    }

    public List<category> get(){
        List<category> categories=new ArrayList<>();
        categoryRepository.findAll().forEach(s->categories.add(s));
        return categories;
    }
}
