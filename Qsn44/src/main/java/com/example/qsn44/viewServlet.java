package com.example.qsn44;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "viewServlet", value = "/viewServlet")
public class viewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color:whitesmoke;'><center>");
        out.println("<h1>Student's Data:</h1>");
        List<student> list = studentDatabase.getAllStudent();
        out.print("<table border='5' width='100%' cellspacing='0' cellpadding='5px'");
        out.println("<tr><th>SN</th><th>Name</th><th>Address</th><th>Phone Number</th><th>Edit</th><th>Delete</th></tr>");
        int sn = 0;
        for (student s : list) {
            sn++;
            out.print("<tr>");
            out.print("<td align='center'>" + sn + "</td>");
            out.print("<td align='center'>" + s.getName() + "</td>");
            out.print("<td align='center'>" + s.getAddress() + "</td>");
            out.print("<td align='center'>" + s.getPhone() + "</td>");
            out.print("<td align='center'><a href='editServlet?id=" + s.getId() + "'>edit</a></td>");
            out.print("<td align='center'><a href='deleteServlet?id=" + s.getId() + "'>delete</a></td>");
            out.print("</tr>");
        }
        out.println("</table>");
        out.println("<br>");
        out.println("<form action='index.jsp' method='get'>");
        out.println("<input type='submit' value='Add Data' style='padding: 8px 20px;box-shadow: 2px 2px 5px #999;'>");
        out.println("</form>");
        out.println("</center></body></html>");
        out.close();
    }
}
