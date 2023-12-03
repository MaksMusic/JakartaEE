<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01.12.2023
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.jakartaee.database.WorkDataBase" %>
<%@ page import="com.example.jakartaee.database.Account" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>accounts</title>
</head>


<body>

<% WorkDataBase workDataBase = new WorkDataBase();%>
<%= workDataBase.getText()%>
<input type="button" value="покупка" data-color="green" >


</body>
</html>
