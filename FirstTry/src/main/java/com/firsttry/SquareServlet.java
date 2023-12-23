package com.firsttry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw=res.getWriter();
        pw.println("Welcome");
        int k=(int)req.getAttribute("k");
        pw.println("The square of "+ k + " is "+ k*k);
    }
}
