package com.revature.citydogs;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>WeirdDogApp" +
                "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>NYC Dog Search</h1>" +
                "    \n" +
                "<form action='citydogs' method='get'>" +
                "        \n" +
                "    <input type='name' name='searchName'/>" +
                "        \n" +
                "    <input type='submit' value='Search'/>  \n" +
                "    <a href='/citydogs'>See entire list of registered dogs</a>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
        resp.getWriter().println(HTMLForm);
    }
}
