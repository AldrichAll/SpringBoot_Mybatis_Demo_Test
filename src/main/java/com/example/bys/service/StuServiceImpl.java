package com.example.bys.service;

import com.example.bys.entity.StuEntity;
import com.example.bys.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StuEntity> getAllStus(){
        return studentMapper.getAllStus();
    }

    @Override
    public void addStu( StuEntity stuEntity){
        //System.out.println("stuId is "+stuEntity.getStuid()+" name is "+stuEntity.getName());
        studentMapper.addStu(stuEntity);
    }

    @Override
    public void deleteStu(int stuId){
        studentMapper.deleteStu(stuId);
    }
}
