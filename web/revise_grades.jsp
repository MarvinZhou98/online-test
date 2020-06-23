<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/23
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>修改成绩</title>
    <style>
        .center {
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>修改成绩</h1>
    <form>
        学生姓名：<select name="" id="">
        <option>%name</option>
        <option>%name</option>
        <option>%name</option>
        <option>%name</option>
        <option>%name</option>
    </select><br />
        试卷科目：<select name="" id="">
        <option>$subject</option>
        <option>$subject</option>
        <option>$subject</option>
        <option>$subject</option>
        <option>$subject</option>
    </select><br />
        成绩：<input type="text"><br />
        <input type="button" value="返回">
        <input type="button" value="确认修改">
    </form>
</div>
</body>

</html>