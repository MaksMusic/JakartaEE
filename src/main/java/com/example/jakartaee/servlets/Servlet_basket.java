package com.example.jakartaee.servlets;

import com.example.jakartaee.entity.Cart;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servlet_basket", value = "/Servlet_basket")
public class Servlet_basket extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String name = request.getParameter("name");
        Integer count = Integer.parseInt(request.getParameter("count"));

        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null){
            cart = Cart.builder()
                    .name(name)
                    .count(count)
                    .build();
        }
        session.setAttribute("cart",cart);


        RequestDispatcher dispatcher = request.getRequestDispatcher("/basketJsp.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
