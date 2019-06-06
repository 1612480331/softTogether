package com.example.demo.serviceImpl;

import com.example.demo.entity.user;
import com.example.demo.service.userService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "teacher")
public class teacherServiceImpl implements userService {
    @Override
    public List<user> queryAll() {
        return null;
    }

    @Override
    public user queryById(int id) {
        return null;
    }

    @Override
    public int insert(user user) {
        return 0;
    }

    @Override
    public int update(user user) {
        return 0;
    }
}
