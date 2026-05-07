package com.sound;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/visit")
public class PageVisitServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Create or get session
        HttpSession session = request.getSession();

        // Get visit count
        Integer count = (Integer) session.getAttribute("count");

        // First visit
        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        // Save updated count
        session.setAttribute("count", count);

        // Session creation time
        Date creationTime = new Date(session.getCreationTime());

        // Output
        out.println("<html><body>");

        out.println("<h1>Page Visit Counter</h1>");

        out.println("<h2>You visited this page "
                + count + " times.</h2>");

        out.println("<h3>Session Created Time: "
                + creationTime + "</h3>");

        out.println("<br><a href='visit'>Visit Again</a>");

        out.println("</body></html>");
    }
}