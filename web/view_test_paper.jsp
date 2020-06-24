<%--
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
    </style>
</head>

<body>
<div class="center">
    <h1>查看试卷</h1>
    <form >
        <h2> 试卷名：$name <br/>
            题号：$id<br/>
            题目类型：$type<br/>
            题目内容：$content<br/>
            分值：$score<br/>
            答案：$answer <br/>


            <input type="submit" value="返回"><br/>
    </form>
</div>
</body>

</html>