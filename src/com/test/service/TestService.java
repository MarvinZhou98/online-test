package com.test.service;

import com.test.dao.GradeDao;
import com.test.dao.GradeDaoImpl;
import com.test.dao.TestDao;
import com.test.dao.TestDaoImpl;
import com.test.entity.Grade;
import com.test.entity.Test;
import com.test.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

@WebServlet(name = "TestService",urlPatterns = "/TestService")
public class TestService extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
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

        if(type.equals("viewtestpaper")){
            resp.sendRedirect("/view_test_paper.jsp");
        }else if(type.equals("testpaper")){
            String id = req.getParameter("testid");
            TestDao td = new TestDaoImpl();
            List<Test> testList = td.SelectAllTest();
            for(int i=0;i<testList.size();i++){
                Test t = testList.get(i);
                if(id.equals(t.getTestID())){
                    session.setAttribute("test",t);
                    resp.sendRedirect("/test_paper.jsp");
                    break;
                }
            }
            out.println("<h1>试卷未找到</h1><br/><a href='/'>返回</a>");
        }else if(type.equals("testing")){
            String id = req.getParameter("testid");
            int num = Integer.parseInt(req.getParameter("num"));
            int grade = 0;
            for(int i=0;i<num;i++){
                String ans = req.getParameter("ans"+i);
                String que = req.getParameter("que"+i);
                if(ans.equals(que))
                    grade++;
            }
            Grade g = new Grade();
            g.setGrade(grade);
            g.setTestID(id);
            g.setUserID(user.getUserID());
            GradeDao gd = new GradeDaoImpl();
            gd.InsertGrade(g);
            resp.sendRedirect("/");
        }
    }

    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doPost(req, resp);
    }
}
