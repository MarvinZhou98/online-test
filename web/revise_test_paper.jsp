<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/24
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>修改试卷</title>
    <style>
        .center{
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>修改</h1>
    <form >
        试卷名：<input type="text" value="$name" ><br/>
        题号：<input type="text" value="$id"  ><br/>
        题目类型：<input type="text"  value="$type" ><br/>
        题目内容：<input type="text" value="$conent"  ><br/>
        分值：<input type="text" value="$score" ><br/>
        答案：<input type="text" value="$answer" ><br/>

        <input type="submit" value="提交"><br/>
        <input type="submit" value="返回"><br/>
    </form>
</div>
</body>

</html>