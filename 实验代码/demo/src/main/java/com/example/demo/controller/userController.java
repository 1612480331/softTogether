
package com.example.demo.controller;

import com.example.demo.entity.user;
import com.example.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    @Qualifier("student")
    private userService studentService;

    @PostMapping("/login")
    public user login(@RequestParam int id,
                        @RequestParam String password){
        user user=null;
        user=studentService.queryById(id);
        return user;
    }
}
