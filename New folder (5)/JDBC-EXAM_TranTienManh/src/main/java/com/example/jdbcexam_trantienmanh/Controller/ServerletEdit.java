package com.example.jdbcexam_trantienmanh.Controller;

import com.example.jdbcexam_trantienmanh.Model.Stundent;
import com.example.jdbcexam_trantienmanh.Service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Edit")
public class ServerletEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
         Stundent student= Service.findByStudent(id);
        req.setAttribute("t",student);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/edit.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
