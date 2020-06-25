<%@ page import="com.test.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/23
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>查看个人信息</title>
    <style>
        .center {
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<%
    User vuser = (User)session.getAttribute("view_user");
%>
<div class="center">
    <h1>查看个人信息</h1>
    <h2>姓名：<%= vuser.getUserName() %></h2>
    <h2>账号：<%= vuser.getUserID() %></h2>
    <h2>用户类型：<%= vuser.getUserType()=='s'?"学生":vuser.getUserType()=='t'?"老师":"管理员" %></h2>
    <a href="/"><button>返回</button></a>
</div>
</body>

</html>