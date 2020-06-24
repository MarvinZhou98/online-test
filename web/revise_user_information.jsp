<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/24
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>修改用户信息</title>
    <style>
        .center{
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>修改用户信息</h1>
    <form >
        姓名：<input type="text" value="$name"><br/>
        账号：<input type="text" value="$id"><br/>
        密码：<input type="text" value="$psd"><br/>
        用户类型：<input type="text"  value ="$type"><br/>

        <input type="submit" value="修改"><br/>
        <input type="submit" value="返回"><br/>
    </form>
</div>
</body>

</html>
