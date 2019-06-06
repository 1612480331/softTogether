package com.example.demo.mapper;

import com.example.demo.entity.course;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import java.util.List;

public interface courseMapper {
    List<course> queryAll();
    course queryByNo(course course);
    int insert(course course);
}
