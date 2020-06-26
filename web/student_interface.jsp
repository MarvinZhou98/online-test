<%@ page import="com.test.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/23
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>学生界面</title>
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
    if(user==null||user.getUserType()!='s')
        response.sendRedirect("/");
%>
<div class="center">
    <h1>学生界面</h1>
    <h2>欢迎您，<%=user.getUserName()%></h2>
    <a href="UserService"><button>查看个人信息</button></a><br/>
    <a href="change_password.jsp"><button>修改密码</button></a><br/>
    <form action="TestService" method="post">
        <input type="hidden" name="type" value="viewtestpaper">
        <input type="submit" value="查看考试">
    </form>
    <form action="StudentService" method="post">
        <input type="hidden" name="type" value="viewgrade">
        <input type="submit" value="查看成绩">
    </form>
</div>
</body>

</html>