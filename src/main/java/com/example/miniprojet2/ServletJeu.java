package com.example.miniprojet2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletJeu", value = "/ServletJeu")
public class ServletJeu extends HttpServlet {
   Arraylist m=new Arraylist();
   boolean test=false;
    int nb=0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/Jeux.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        m.addList(request.getParameter("mot"));
        request.setAttribute("Mot",m);
        nb++;
        request.setAttribute("nb",nb);
        if( nb>7){
            m.getListMot().clear();
            nb=0;
        }
        request.setAttribute("nbItantative",nb);
        this.getServletContext().getRequestDispatcher("/Jeux.jsp").forward(request,response);
    }
}
