<%--
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
<div class="center">
    <h1>查看个人信息</h1>
    <h2>姓名：$name</h2>
    <h2>账号：$user</h2>
    <h2>用户类型：$usertype</h2>
    <form>
        <input type="button" value="返回"><br />
    </form>
</div>
</body>

</html>