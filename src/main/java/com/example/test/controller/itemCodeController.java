package com.example.test.controller;


import com.example.test.modal.itemCode;
import com.example.test.service.itemCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class itemCodeController {
    @Autowired
    itemCodeService itemCodeServices;

    @PostMapping(path = "/create-item-code")
    public itemCode create(@RequestBody itemCode itemCodes){
        return itemCodeServices.create(itemCodes);
    }
    @GetMapping(path = "/get-item-code")
    public List<itemCode> get(){
        return itemCodeServices.get();
    }
}
