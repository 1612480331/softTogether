package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class user implements Serializable {
    private String id;
    private String password;
    private String userName;
    private String email;
   /*private String studentNo;
    private String studentPassword;
    private String studentName;
    private String studentMail;*/
}
