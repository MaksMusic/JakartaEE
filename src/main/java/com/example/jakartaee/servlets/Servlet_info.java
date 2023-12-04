package com.example.jakartaee.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Servlet1", value = "/Servlet1")
public class Servlet_info extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        HttpSession session = request.getSession();
        Integer count =(Integer) session.getAttribute("count");

        if (count != null){
           session.setAttribute("count",count+1);
        }else {
            session.setAttribute("count",1);
        }
        count = (Integer) session.getAttribute("count");


        PrintWriter pw = response.getWriter();
        pw.println("<html> <head> <meta charset=\"UTF-8\">  </head> <body>");
        pw.println("<h1>Hello "+ name + " " +surname + "вы посетили сайт "+count + " раз" +  "</h1>");
        pw.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
