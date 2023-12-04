<%@ page import="com.example.jakartaee.entity.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04.12.2023
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Cart cart =(Cart) session.getAttribute("cart");%>
<h2>
  <%= "name" +  cart.getName()  + " count " + cart.getCount()%>>
</h2>

</body>
</html>
