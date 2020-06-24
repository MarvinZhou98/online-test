package com.test.service;

import com.test.dao.UserDao;
import com.test.dao.UserDaoImpl;
import com.test.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserService",urlPatterns = "/UserService")
public class UserService extends HttpServlet {
    protected boolean UserLogin(User user){
        return false;
    }
    protected boolean UserRegister(User user){
        return false;
    }
    protected User ViewMessage(User user){
        return null;
    }
    protected boolean ChangePassword(User user,String pw){
        return false;
    }
    protected void AddUser(User user){

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String type = req.getParameter("type");
        if(type.equals("register")){
            User user = new User();
            user.setUserID(req.getParameter("UserID"));
            user.setUserName(req.getParameter("UserName"));
            user.setUserPassword(req.getParameter("UserPassword"));
            user.setUserType(req.getParameter("UserType").charAt(0));

            UserDao ud = new UserDaoImpl();
            ud.InsertUser(user);
        }
    }
}
