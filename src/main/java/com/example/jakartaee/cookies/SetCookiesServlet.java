package com.example.jakartaee.cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //создание самих cookies
        Cookie cookies1 = new Cookie("id","123");
        Cookie cookies2 = new Cookie("name","Tom");

        //установка времени действия cookies 1 день (в секундах)
        cookies1.setMaxAge(60*60*24);
        cookies2.setMaxAge(60*60*24);

        //добавить cookies в ответ
        response.addCookie(cookies1);
        response.addCookie(cookies2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
