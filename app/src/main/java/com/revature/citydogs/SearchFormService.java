package com.revature.citydogs;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SearchFormService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "\n" +
                "<html>\n" +
                "<body>\n" +
                "<h1>NYC Dog Search</h1>" +
                "    \n" +
                "<form action='/nycdogs' method='get'>" +
                "        \n" +
                "    <input type='name' name='searchName'/>" +
                "        \n" +
                "    <input type='submit' value='Search'/>    \n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
        resp.getWriter().println(HTMLForm);
    }
}
