/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.dw.taller7;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres
 */
@WebServlet(name = "Menu", urlPatterns = {"/menu"})
public class Menu extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Menu de motos</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Menu de motos</h1>");
        out.println("<p>Seleccione el modelo de moto que desea ver</p>");
        out.println("<ul><li><a href='yamaha'>Yamaha</a></li>");
        out.println("<li><a href='kawasaki'>Kawasaki</a></li>");
        out.println("<li><a href='ducati'>Ducati</a></li></ul>");
        out.println("</body>");
        out.println("</html>"); 
    }

}
