package com.laphayen.lifecycle;

import java.io.IOException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    public LifeCycleServlet() {
        super();
        System.out.println("Servlet 생성자.");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init() 실행.");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service() 실행.");
        super.service(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet() 실행.");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, this is a GET request response!</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost() 실행.");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, this is a POST request response!</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() 실행.");
    }
}
