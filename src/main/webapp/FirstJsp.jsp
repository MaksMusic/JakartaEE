<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29.11.2023
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date,com.example.jakartaee.database.WorkDataBase" %>
<%@ page import="com.example.jakartaee.database.Account" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>JSP test</title>
</head>
<body>

<%--Вывод даты которую сначала присвоили в переменную--%>
<%="Hello JSP" %>
<% String text = "Текущее время vc"; %>
<% String now = new Date().toString(); %>
<p>
    <%=  text  + " " + now %>
</p>



<%--генирирует случ число и если оно больше 0.95 выводит сообщение и сэтим числом--%>
<%
    double num = Math.random();
    if (num > 0.95) {
%>
<h2>Ты выйграл , user!</h2><p>(<%= num %>)</p>
<%
    }
%>


<%--цикл фор--%>
<% for (int i = 0,j=1; i < 10; i++,j++) {
    out.println("hello" + j);
}%>

</body>
</html>
