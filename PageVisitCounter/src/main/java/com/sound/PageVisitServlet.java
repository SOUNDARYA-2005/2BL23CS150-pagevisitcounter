package com.sound;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/visit")
public class PageVisitServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        session.setAttribute("count", count);

        Date time = new Date(session.getCreationTime());

        out.println("<h2>Page Visit Counter</h2>");
        out.println("<p>You visited " + count + " times</p>");
        out.println("<p>Session Created: " + time + "</p>");
    }
}