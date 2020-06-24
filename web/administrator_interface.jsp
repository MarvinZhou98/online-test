<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/24
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>管理员界面</title>
    <style>
        .center{
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>管理员个人中心</h1>
    <form >
        姓名：<input type="text" value="$name"  ><br/>

        <input type="submit" value="查看个人信息"><br/>
        <input type="submit" value="修改个人信息"><br/>
        <input type="submit" value="查看用户信息"><br/>
        <input type="submit" value="修改用户信息"><br/>
    </form>
</div>
</body>

</html>