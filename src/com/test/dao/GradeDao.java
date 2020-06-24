package com.test.dao;

import com.test.entity.Grade;
import com.test.entity.Question;

import java.util.List;

public interface GradeDao {
    public List<Grade> SelectAllGrade() throws Exception;
    public int InsertGrade(Grade grade);
    public int updateGrade(Grade grade);
}
