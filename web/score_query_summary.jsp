<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/23
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>查看汇总成绩</title>
    <style>
        .center {
            width: 100%;
            text-align: center;
        }

        .center table {
            margin: auto;
            border-collapse: collapse;
        }
    </style>
</head>

<body>
<div class="center">
    <h1>查看汇总成绩</h1>
    <table border="3">
        <tr>
            <th>学生姓名</th>
            <th>试卷科目</th>
            <th>成绩</th>
        </tr>
        <tr>
            <td>$name</td>
            <td>$subject</td>
            <td>$score</td>
        </tr>
        <tr>
            <td>$name</td>
            <td>$subject</td>
            <td>$score</td>
        </tr>
        <tr>
            <td>$name</td>
            <td>$subject</td>
            <td>$score</td>
        </tr>
        <tr>
            <td>$name</td>
            <td>$subject</td>
            <td>$score</td>
        </tr>
        <tr>
            <td>$name</td>
            <td>$subject</td>
            <td>$score</td>
        </tr>
    </table>
    <form>
        <input type="button" value="返回">
        <input type="button" value="修改成绩"><br />
    </form>
</div>
</body>

</html>