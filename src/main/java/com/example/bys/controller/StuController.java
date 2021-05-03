package com.example.bys.controller;

import com.example.bys.entity.StuEntity;
import com.example.bys.service.StuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StuController {
    @Autowired
    private StuServiceImpl stuServiceImpl;

    @GetMapping(value = "/getAllStus")
    public List<StuEntity> getAllStus(){
        return stuServiceImpl.getAllStus();
    }

    @PostMapping(value = "/addStu")
    public void addStu(@RequestBody StuEntity stuEntity){
        System.out.println("In controller stuId is "+stuEntity.getStuId()+" name is "+stuEntity.getName());
        stuServiceImpl.addStu(stuEntity);
    }

    @RequestMapping(value = "/delStu", method = RequestMethod.POST)
    public void deleteStu(int stuId){
        stuServiceImpl.deleteStu(stuId);
    }



}
