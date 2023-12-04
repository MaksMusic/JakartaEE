package com.example.jakartaee.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servlet_forward", value = "/Servlet_forward")
public class Servlet_redicateAndForward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //redirect
        // все что будет до перенаправления все равно не выведется
        //response.sendRedirect("https://translate.google.com/?hl=ru");
        //или
        // response.sendRedirect("/Accounts.jsp");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Accounts.jsp");
        requestDispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
