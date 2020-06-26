<%@ page import="com.test.entity.User" %>
<%@ page import="com.test.entity.Grade" %>
<%@ page import="com.test.dao.GradeDao" %>
<%@ page import="com.test.dao.GradeDaoImpl" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/23
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>成绩查询</title>
    <style>
        .center {
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<%
    User user= (User) session.getAttribute("user");
    if(user==null)
        response.sendRedirect("/");
    GradeDao gd = new GradeDaoImpl();
    List<Grade> grades = gd.SelectAllGrade();
%>
<div class="center">
    <h1>成绩查询</h1>
    <%
        for(int i=0;i<grades.size();i++){
            Grade g = grades.get(i);
            if(g.getUserID().equals(user.getUserID())){
    %>
    <h2>课号为<%=g.getTestID()%>的成绩是<%=g.getGrade()%>分</h2>
    <%
        }}
    %>
    <a href="/"><button>返回</button></a>
</div>
</body>

</html>