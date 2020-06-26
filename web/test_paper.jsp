<%@ page import="com.test.entity.User" %>
<%@ page import="com.test.entity.Test" %>
<%@ page import="java.util.List" %>
<%@ page import="com.test.entity.SelectQuestion" %><%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/6/23
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">

    <%
        User user= (User) session.getAttribute("user");
        if(user==null)
            response.sendRedirect("/");
        Test test= (Test) session.getAttribute("test");
        if(test==null)
            response.sendRedirect("/");
        List<SelectQuestion> questions = test.getQuestions();
    %>

    <title><%=test.getName()%></title>
    <style>
        .center {
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body>
<div class="center">
    <h1><%=test.getName()%></h1>
    <h2>考试时间:<%=test.getTime()%>分钟</h2>
    <form action="TestService" method="post" id="test_form">
        <input type="hidden" name="type" value="testing">
        <input type="hidden" name="testid" value="<%=test.getTestID()%>">
        <input type="hidden" name="num" value="<%=questions.size()%>">
        <%
            for(int i=0;i<questions.size();i++){
                SelectQuestion q = questions.get(i);
        %>

        <p>
            <%=i+1%>:<%=q.getContent()%><br>
            A:<%=q.getSelectA()%><input type="radio" name="ans<%=i%>" value="A"><br>
            B:<%=q.getSelectB()%><input type="radio" name="ans<%=i%>" value="B"><br>
            C:<%=q.getSelectC()%><input type="radio" name="ans<%=i%>" value="C"><br>
            D:<%=q.getSelectD()%><input type="radio" name="ans<%=i%>" value="D"><br>
            <input type="hidden" name="que<%=i%>" value="<%=q.getAnswer()%>">
        </p>

        <%
            }
        %>
        <input type="submit" value="交卷">
    </form>
</div>
<script>
    setTimeout("document.getElementById('test_form').submit()",(<%=test.getTime()%>*60000));
</script>
</body>

</html>