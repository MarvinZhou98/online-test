package com.test.dao;

import com.test.entity.Test;

import java.util.List;

public interface TestDao {
public List<Test> SelectAllTest();
public int InsertTest();
public int deleteTest();
public int updateTest();
}
