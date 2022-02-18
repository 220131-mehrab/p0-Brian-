package com.revature.citydogs;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DogServlet extends HttpServlet {
    private DogRepo dogRepo;

    public DogServlet(DogRepo dogRepo) {

        this.dogRepo = dogRepo;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userInput;
        userInput = req.getParameter("searchName");

        if (userInput != null) {
            String result = dogRepo.getDog(userInput);
            resp.getWriter().println(result);
        } else {
            for (String dog : dogRepo.getDogs()) {
                resp.getWriter().println(dog);
            }
        }
    }
}

