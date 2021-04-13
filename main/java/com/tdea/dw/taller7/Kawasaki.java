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
@WebServlet(name = "Kawasaki", urlPatterns = {"/kawasaki"})
public class Kawasaki extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>kawasaki</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Kawasaki</h1>");
        out.println("<img src='imgs/kawasaki.jpg'>");
        out.println("<h1>Descripcion</h1>");
        out.println("<p>La numero 1 en fabricación en motores para motos de competición, esto se debe a la división de Kawasaki Heavy Industries, que ganó el reconocimiento como un fabricante de una amplia gama de motores, tanto para competición como para su uso particular. Esta marca no despunta por su gran variedad, de hecho ha empezado a fabricar ciertos modelos o estilos que hasta ahora no se habían atrevido a tocar, como los scooters, maxiscooters y motos custom.</p>");
        out.println("</body>");
        out.println("</html>");         
    }


}
