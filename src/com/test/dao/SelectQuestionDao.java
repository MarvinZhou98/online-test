package com.test.dao;

import com.test.entity.Question;
import com.test.entity.SelectQuestion;

import java.util.List;

public interface SelectQuestionDao {
    public List<SelectQuestion> SelectAllQuestion();
    public List<SelectQuestion>SelectQuestion(String id);
    public int InsertQuestion(SelectQuestion selectq);
    public int deleteQuestion(int num);
    public int updateQuestion(SelectQuestion selectq);
}

