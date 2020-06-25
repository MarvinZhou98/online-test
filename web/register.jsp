<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/23
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>注册</title>
    <style>
        .center {
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>注册</h1>
    <form action="UserService" method="post">
        <input type="hidden" name="type" value="register">
        姓名：<input type="text" name="UserName"><br />
        账号：<input type="text" name="UserID"><br />
        密码：<input type="password" name="UserPassword"><br />
        用户类型：<select name="UserType">
        <option value="s">学生</option>
        <option value="t">老师</option>
        <option value="m">管理员</option>
    </select><br />
        <input type="submit" value="注册">
    </form>
</div>
</body>

</html>