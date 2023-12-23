package com.example.qsn44;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "updateServlet", value = "/updateServlet")
public class updateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws  IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        if (name == null || name.trim().isEmpty() || address == null || address.trim().isEmpty() || phone == null || phone.trim().isEmpty()) {
            response.sendRedirect("editServlet?id=" + id + "&error=Please%20enter%20all%20fields!");
            out.close();
        } else {
            student s = new student();
            s.setId(id);
            s.setName(name);
            s.setAddress(address);
            s.setPhone(phone);
            int res = studentDatabase.update(s);
            if (res > 0) {
                response.sendRedirect("viewServlet");
            } else {
                out.println("Sorry! unable to update record");
            }
            out.close();
        }
    }
}

