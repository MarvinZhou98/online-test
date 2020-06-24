package com.test.dao;

import com.test.entity.Test;
import com.test.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> SelectAllUser();
    public int InsertUser(User user);
    public int updateUser(User user);
}
