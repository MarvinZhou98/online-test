<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/23
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>修改密码</title>
    <style>
        .center {
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>修改密码</h1>
    <form action="UserService" method="post">
        <input type="hidden" name="type" value="changePassword">
        旧密码：<input type="password" name="pw0"><br />
        新密码：<input type="password" name="pw1"><br />
        <a href="/"><input type="button" value="返回"></a>
        <input type="submit" value="修改">
    </form>
</div>
</body>

</html>
