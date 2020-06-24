package com.test.dao;

import com.test.entity.Question;
import com.test.entity.Test;

import java.util.List;

public interface QuestionDao {
    public List<Question> SelectAllQuestion();
    public int InsertQuestion(Question q);
    public int deleteQuestion(int num);
    public int updateQuestion(Question q);
}
