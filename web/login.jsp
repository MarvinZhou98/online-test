<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/23
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>登录</title>
    <style>
        .center {
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>登录</h1>
    <form action="UserService" method="post">
        <input type="hidden" name="type" value="login">
        账号：<input type="text" name="UserID"><br />
        密码：<input type="password" name="UserPassword"><br />
    </select><br />
        <input type="submit" value="登录">
    </form>
</div>
</body>

</html>