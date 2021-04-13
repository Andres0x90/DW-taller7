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
@WebServlet(name = "Yamaha", urlPatterns = {"/yamaha"})
public class Yamaha extends HttpServlet {



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Yamaha</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Yamaha</h1>");
        out.println("<img src='imgs/yamaha.jpg'>");
        out.println("<h1>Descripcion</h1>");
        out.println("<p>Las Yamaha son conocidas por su excelente rendimiento, calidad y manejo relativamente fácil. Yamaha es casi tan exitoso como Honda. Por otra parte, el número de motos de cross que vende supera a Honda, no por mucho pero si por encima de ellos, pero dónde Yamaha está muy por encima en ventas es en motos para la ciudad como los scooters y maxiscooters, donde es el número uno muy seguido por otras marcas de segunda categoría como Kymko.</p>");
        out.println("</body>");
        out.println("</html>");   
    }

}
