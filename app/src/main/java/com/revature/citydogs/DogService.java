package com.revature.citydogs;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DogService extends HttpServlet {
    private DogPile dogPile;

    public DogService(DogPile dogPile) {

        this.dogPile = dogPile;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userInput;
        userInput = req.getParameter("searchName");

        if (userInput != null) {
            String result = dogPile.getDog(userInput);
            resp.getWriter().println(result);
        } else {
            for (String dog : dogPile.getDogs()) {
                resp.getWriter().println(dog);
            }
        }
    }
}

