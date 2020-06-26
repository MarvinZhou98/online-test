package com.test.service;

import com.test.dao.UserDao;
import com.test.dao.UserDaoImpl;
import com.test.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UserService",urlPatterns = "/UserService")
public class UserService extends HttpServlet {
    protected User UserLogin(String id,String pw){
        UserDao ud = new UserDaoImpl();
        List<User> userList = ud.SelectAllUser();
        for(int i=0;i<userList.size();i++){
            User u = userList.get(i);
            if(u.getUserID().equals(id)&&u.getUserPassword().equals(pw))
                return u;
        }
        return null;
    }

    protected boolean UserRegister(User user){
        UserDao ud = new UserDaoImpl();
        List<User> userList = ud.SelectAllUser();
        for(int i=0;i<userList.size();i++){
            User u = userList.get(i);
            if(u.getUserID().equals(user.getUserID()))
                return true;
        }
        return false;
    }

    protected User ViewMessage(User user){
        user.setUserPassword("");
        return user;
    }

    protected User ChangePassword(User user,String pw){
        User u = new User();
        u.setUserID(user.getUserID());
        u.setUserName(user.getUserName());
        u.setUserType(user.getUserType());
        u.setUserPassword(pw);
        UserDao ud = new UserDaoImpl();
        ud.updateUser(u);
        return u;
    }

    protected void AddUser(User user){
        UserDao ud = new UserDaoImpl();
        ud.InsertUser(user);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession(true);
        String type = req.getParameter("type");
        if(type == null){
            if(session.getAttribute("user")== null){
                out.println("<h1>请登录</h1><br/><a href='/'>返回</a>");
            }else {
                User user = (User)session.getAttribute("user") ;
                User vuser = ViewMessage(user);
                session.setAttribute("view_user",vuser);
                resp.sendRedirect("/view_personal_information.jsp");
            }
        }else if(type.equals("register")){
            User user = new User();
            user.setUserID(req.getParameter("UserID"));
            user.setUserName(req.getParameter("UserName"));
            user.setUserPassword(req.getParameter("UserPassword"));
            user.setUserType(req.getParameter("UserType").charAt(0));

            if(!UserRegister(user)){
                AddUser(user);
                session.setAttribute("user",user);
                out.println("<h1>注册成功</h1><br/><a href='/'>返回</a>");
            }else {
                out.println("<h1>用户已注册</h1><br/><a href='/'>返回</a>");
            }
        }
        else if(type.equals("login")){
            String UserID = req.getParameter("UserID");
            String UserPassword = req.getParameter("UserPassword");
            User user = UserLogin(UserID,UserPassword);
            if(user!=null){
                session.setAttribute("user",user);
                out.println("<h1>登录成功</h1><br/><a href='/'>返回</a>");
            }else {
                out.println("<h1>登录失败</h1><br/><a href='/'>返回</a>");
            }
        }else if(type.equals("changePassword")){
            User user = (User) session.getAttribute("user");
            if(user==null){
                out.println("<h1>请登录</h1><br/><a href='/'>返回</a>");
            }else{
                String pw0 = req.getParameter("pw0");
                String pw1 = req.getParameter("pw1");
                if(!user.getUserPassword().equals(pw0)){
                    out.println("<h1>密码错误</h1><br/><a href='/'>返回</a>");
                }else {
                    User u = ChangePassword(user,pw1);
                    session.setAttribute("user",u);
                    out.println("<h1>密码修改成功</h1><br/><a href='/'>返回</a>");
                }
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
