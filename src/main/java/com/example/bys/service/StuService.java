package com.example.bys.service;

import com.example.bys.entity.StuEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface StuService {
    List<StuEntity> getAllStus();
    void addStu(StuEntity stuEntity);
    void deleteStu(int stuId);
    void updateStu(@RequestBody StuEntity stuEntity);
}
