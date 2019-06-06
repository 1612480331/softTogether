package com.example.demo.mapper;

import com.example.demo.entity.choicequestion;

import java.util.List;

public interface choiceQuestionMapper {
    public int insert(choicequestion choicequestion);
    public List queryByClass(choicequestion choicequestion);
}
