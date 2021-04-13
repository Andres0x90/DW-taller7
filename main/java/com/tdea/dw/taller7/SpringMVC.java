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
@WebServlet(name = "SpringMVC", urlPatterns = {"/springmvc"})
public class SpringMVC extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Spring MVC</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div id='explicacion'><p>Spring MVC</p></div>");
        out.println("<input type='button' id='explicar' value='Explicar'></input>");
        out.println("<script src='scripts/springmvc.js'></script>");
        out.println("</body>");
        out.println("</html>");        
    }

}
