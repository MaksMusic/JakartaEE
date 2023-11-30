package com.example.jakartaee.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Servlet1", value = "/Servlet1")
public class Servlet_info extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<html><body>");
        pw.println("<h1>Info</h1>");
        pw.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }
}
