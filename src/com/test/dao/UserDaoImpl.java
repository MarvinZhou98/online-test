package com.test.dao;

import com.test.entity.Grade;
import com.test.entity.User;
import com.net.jdbc.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{


    @Override
    public List<User> SelectAllUser() {

        List<User> listuser = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from User";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String No=rs.getString("Sno");
                String Name = rs.getString("SName");
                String Password = rs.getString("Password");
                String Type=rs.getString("Type");
                User user = new User();
                user.setUserID(No);
                user.setUserName(Name);
                user.setUserPassword(Password);
                user.setUserType(Type.charAt(0));
                listuser.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return listuser;
    }

    @Override
    public int InsertUser(User user) {
        int rows = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "insert into User values(?,?,?,?)";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUserID());
            ps.setString(2, user.getUserName());
            ps.setString(3, user.getUserPassword());
            ps.setString(4,user.getUserType()+"");
            rows = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return rows;
    }

    @Override
    public int updateUser(User user) {
        int rows = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "update User set Password=? where Sno=?";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUserPassword());
            ps.setString(2,user.getUserID());
            rows = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(conn, ps, rs);
        }
        return rows;
    }
}
