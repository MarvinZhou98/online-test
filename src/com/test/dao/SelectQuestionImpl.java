package com.test.dao;

import com.test.entity.SelectQuestion;
import net.jdbc.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SelectQuestionImpl implements SelectQuestionDao{

    @Override
    public List<SelectQuestion> SelectAllQuestion() {
        List<SelectQuestion> listselect = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from SelectQuestion";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int num=rs.getInt("No");
                String type = rs.getString("Type");
                String content = rs.getString("Content");
                String answer=rs.getString("Answer");
                String A=rs.getString("A");
                String B=rs.getString("B");
                String C=rs.getString("C");
                String D=rs.getString("D");
                int ID = rs.getInt("TestID");
                SelectQuestion selectq=new SelectQuestion();
                selectq.setNum(num);
                selectq.setType(type.charAt(0));
                selectq.setContent(content);
                selectq.setAnswer(answer);
                selectq.setSelectA(A);
                selectq.setSelectB(B);
                selectq.setSelectC(C);
                selectq.setSelectD(D);
                selectq.setID(ID);
                listselect.add(selectq);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return listselect;
    }

    @Override
    public List<SelectQuestion> SelectQuestion(String id) {
        List<SelectQuestion> listselect = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from SelectQuestion where TestID=?";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int num=rs.getInt("No");
                String type = rs.getString("Type");
                String content = rs.getString("Content");
                String answer=rs.getString("Answer");
                String A=rs.getString("A");
                String B=rs.getString("B");
                String C=rs.getString("C");
                String D=rs.getString("D");
                int ID = rs.getInt("TestID");
                SelectQuestion selectq=new SelectQuestion();
                selectq.setNum(num);
                selectq.setType(type.charAt(0));
                selectq.setContent(content);
                selectq.setAnswer(answer);
                selectq.setSelectA(A);
                selectq.setSelectB(B);
                selectq.setSelectC(C);
                selectq.setSelectD(D);
                selectq.setID(ID);
                listselect.add(selectq);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return listselect;
    }

    @Override
    public int InsertQuestion(SelectQuestion selectq) {
        int rows = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "insert into SelectQuestion values(?,?,?,?,?,?,?,?,?)";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, selectq.getNum());
            ps.setString(2, selectq.getType()+"");
            ps.setString(3, selectq.getContent());
            ps.setString(4,selectq.getAnswer());
            ps.setString(5,selectq.getSelectA());
            ps.setString(6,selectq.getSelectB());
            ps.setString(7,selectq.getSelectC());
            ps.setString(8,selectq.getSelectD());
            ps.setInt(9,selectq.getID());
            rows = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return rows;
    }

    @Override
    public int deleteQuestion(int num) {
        int rows=0;
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="delete from SelectQuestion where No=?";
        try
        {
            conn= JDBCUtils.getConnection();
            ps.setInt(1,num);
            rows=ps.executeUpdate();

        } catch (Exception e ){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(conn,ps,rs);
        }
        return rows;
    }

    @Override
    public int updateQuestion(SelectQuestion selectq) {
        int rows = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "update Question set Context=?,Answer=?,A=?,B=?,C=?,D=? where No=?";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,selectq.getContent());
            ps.setString(2,selectq.getAnswer());
            ps.setString(3,selectq.getSelectA());
            ps.setString(4,selectq.getSelectB());
            ps.setString(5,selectq.getSelectC());
            ps.setString(6,selectq.getSelectD());
            ps.setInt(7,selectq.getNum());
            rows = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return rows;
    }
}
