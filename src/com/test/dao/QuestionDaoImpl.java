package com.test.dao;

import com.test.entity.Question;
import net.jdbc.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuestionDaoImpl implements QuestionDao {

    @Override
    public List<Question> SelectAllQuestion() {
        List<Question> listquestion = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from Question";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int num=rs.getInt("No");
                String type = rs.getString("Type");
                String content = rs.getString("Content");
                String answer=rs.getString("Answer");
                int ID = rs.getInt("TestID");
                Question q=new Question();
                q.setNum(num);
                q.setType(type.charAt(0));
                q.setContent(content);
                q.setAnswer(answer);
                q.setID(ID);
                listquestion.add(q);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return listquestion;
    }

    @Override
    public int InsertQuestion(Question q) {
        int rows = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "insert into Question values(?,?,?,?,?)";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, q.getNum());
            ps.setString(2, q.getType()+"");
            ps.setString(3, q.getContent());
            ps.setString(4,q.getAnswer());
            ps.setInt(5,q.getID());
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
        String sql="delete from Question where No=?";
        try
        {
            conn=JDBCUtils.getConnection();
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
    public int updateQuestion(Question q) {
        int rows = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "update Question set Context=?,Answer=? where No=?";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,q.getContent());
            ps.setString(2,q.getAnswer());
            ps.setInt(3,q.getNum());
            rows = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return rows;
    }
}
