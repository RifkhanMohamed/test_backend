package com.example.test.service;

import com.example.test.modal.itemCode;
import com.example.test.repository.itemCodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class itemCodeService {
    @Autowired
    itemCodeRepo itemCodeRepos;

    public itemCode create(itemCode itemCodes){
        return itemCodeRepos.save(itemCodes);
    }

    public List<itemCode> get(){
        List<itemCode> itemCodes=new ArrayList<>();
        itemCodeRepos.findAll().forEach(s->itemCodes.add(s));
        return itemCodes;
    }
}
