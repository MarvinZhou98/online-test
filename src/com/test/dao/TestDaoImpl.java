package com.test.dao;

import com.test.entity.SelectQuestion;
import com.test.entity.Test;
import net.jdbc.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestDaoImpl implements TestDao {
    @Override
    public List<Test> SelectAllTest() {
        SelectQuestionImpl a = new SelectQuestionImpl();
        List<Test> listtest = new ArrayList<Test>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select *from Test";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String Name = rs.getString("Name");
                int time = rs.getInt("Time");
                String TestID = rs.getString("TestID");
                List<SelectQuestion> listq = a.SelectQuestion(TestID);
                Test test = new Test();
                test.setName(Name);
                test.setQuestions(listq);
                test.setTime(time);
                test.setTestID(TestID);
                listtest.add(test);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return listtest;
    }
}
