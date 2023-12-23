package com.example.jpt;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "saveServlet",value = "/saveServlet")
public class saveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        if (name == null || name.trim().isEmpty() || address == null || address.trim().isEmpty() || phone == null || phone.trim().isEmpty()) {
            out.println("<p style='color:red;text-align:center;'>Please enter all  fields!</p>");
            request.getRequestDispatcher("index.jsp").include(request, response);
            out.close();
        } else {
            student s = new student();
            s.setName(name);
            s.setAddress(address);
            s.setPhone(phone);
            int res = studentDatabase.save(s);
            if (res > 0) {
                out.println("<p style='color:green;text-align:center;'>Record saved successfully!</p>");
                request.getRequestDispatcher("index.jsp").include(request, response);
            } else {
                out.println("Sorry! unable to save record");
            }
            out.close();
        }
    }
}