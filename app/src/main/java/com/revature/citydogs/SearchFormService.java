package com.revature.citydogs;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SearchFormService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "<Html>" +
                "<Head>" +
                "<Title>NYC Dog Search</Title>" +
                "</Head>" +
                "<body>" +
                "    <form action='/nycdogs' method='get'>" +
                "        <input type='name' name='searchName'/>" +
                "        <input type='submit' value='Search'/>    " +
                "</form>" +
                "</body>" +
                "</html>";
        resp.getWriter().println(HTMLForm);
    }
}
