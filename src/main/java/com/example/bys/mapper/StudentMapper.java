package com.example.bys.mapper;

import com.example.bys.entity.StuEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    List<StuEntity> getAllStus();
    void addStu(StuEntity stuEntity);
    void deleteStu(int stuId);
}
