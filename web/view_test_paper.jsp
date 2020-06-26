<%@ page import="com.test.entity.User" %>
<%@ page import="com.test.dao.TestDao" %>
<%@ page import="com.test.dao.TestDaoImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.test.entity.Test" %><%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/24
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>查看试卷</title>
    <style>
        .center{
            width: 100%;
            text-align: center;
        }
        .tbcenter{
            margin: 0 auto;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>查看试卷</h1>
    <%
        User user= (User) session.getAttribute("user");
        if(user==null)
            response.sendRedirect("/");
        TestDao td = new TestDaoImpl();
        List<Test> l = td.SelectAllTest();
        if(l.size()==0){
    %>
    <h2>无试卷</h2>
    <%
        }else {
    %>
    <table class="tbcenter">
        <tr>
            <th>考试名</th>
            <th>考试时间</th>
            <th>链接</th>
        </tr>

    <%
            for(int i=0;i<l.size();i++){
                Test t = l.get(i);
    %>
    <tr>
        <td><%= t.getName()%></td>
        <td><%= t.getTime()%></td>
        <td><form action="TestService" method="post">
            <input type="hidden" name="type" value="testpaper">
            <input type="hidden" name="testid" value="<%= t.getTestID() %>">
            <input type="submit" value="开始考试">
        </form></td>
    </tr>
    <%
            }
    %>
    </table>
    <%
        }
    %>
</div>
</body>

</html>