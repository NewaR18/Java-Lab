package com.example.qsn44;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "editServlet", value = "/editServlet")
public class editServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color:whitesmoke;'><center>");
        out.println("<h1><center>Update Student's data:</center></h1>");
        int id = Integer.parseInt(request.getParameter("id"));
        student s = studentDatabase.getStudentById(id);
        String error = request.getParameter("error");
        if (error != null && !error.isEmpty()) {
            out.println("<p style='color: red;'>" + error + "</p>");
        }
        out.print("<form action='updateServlet' method='post'>");
        out.print("<table style=\"border-collapse: separate; border-spacing: 25px;border-radius: 20px;\">");
        out.print("<tr><td></td><td><input type='hidden' name='id' value='" + s.getId() + "'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='" + s.getName() + "'/></td></tr>");
        out.print("<tr><td>Address:</td><td><input type='text' name='address' value='" + s.getAddress() + "'/></td></tr>");
        out.print("<tr><td>Phone No:</td><td><input type='text' name='phone' value='" + s.getPhone() + "'/></td></tr>");
        out.print("<tr><td colspan='2' style=\"text-align: center;\"><input type='submit' value=' Update ' style=\"padding: 8px 20px;box-shadow: 2px 2px 5px #999;\"></td></tr>");
        out.print("</table>");
        out.print("</form>");
        out.println("</center></body></html>");
        out.close();
    }
}

