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
@WebServlet(name = "Ducati", urlPatterns = {"/ducati"})
public class Ducati extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Ducati</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Kawasaki</h1>");
        out.println("<img src='imgs/ducati.jpg'>");
        out.println("<h1>Descripcion</h1>");
        out.println("<p>La marca italiana con sede en Bolonia fabrica motocicletas desde 1935. Ducati es conocida por sus potentes motos deportivas. La compañía tiene una historia larga en las carreras, que comenzó en 1951. Hoy en día se gasta más del 7% de sus ingresos en el negocio de las carreras.</p>");
        out.println("</body>");
        out.println("</html>");    
    }


}
