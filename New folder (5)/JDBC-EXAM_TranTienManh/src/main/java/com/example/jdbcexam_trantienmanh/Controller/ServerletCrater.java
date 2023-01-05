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

@WebServlet("/Crate")
public class ServerletCrater extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/Crate.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Name");
        String DateofBirth = req.getParameter("Date");
        String Address = req.getParameter("Address");
        String PhoneNumber = req.getParameter("Phone");
        String Email = req.getParameter("Email");
        int Classroom = Integer.parseInt(req.getParameter("Classroom"));

        Service.Crate(new Stundent(name,DateofBirth,Address,PhoneNumber,Email,Classroom));

        resp.sendRedirect("/Show");

    }
}
