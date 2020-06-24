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
    <title>增加试卷</title>
    <style>
        .center{
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>增加</h1>
    <form >
        试卷名：<input type="text" ><br/>
        题号：<input type="text" ><br/>
        题目类型：<input type="text" ><br/>
        题目内容：<input type="text" ><br/>
        分值：<input type="text" ><br/>
        答案：<input type="text" ><br/>

        <input type="submit" value="提交"><br/>
        <input type="submit" value="返回"><br/>
    </form>
</div>
</body>

</html>