package com.test.service;

import com.test.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "StudentService",urlPatterns = "/StudentService")
public class StudentService extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession(true);
        String type = req.getParameter("type");

        User user = (User)session.getAttribute("user") ;
        if(user==null){
            out.println("<h1>请登录</h1><br/><a href='/'>返回</a>");
            return;
        }

        if(type.equals("viewgrade")){
            if(user.getUserType()!='s'){
                out.println("<h1>学生才能查看成绩</h1><br/><a href='/'>返回</a>");
            }else {
                resp.sendRedirect("/score_query.jsp");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
