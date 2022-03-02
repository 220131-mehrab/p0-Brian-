package com.revature.citydogs3;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DogService extends HttpServlet {
    private DogRepo dogRepo;

    public DogService(DogRepo dogRepo) {
        this.dogRepo = dogRepo;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "<Html>\n" +
                "<Head>\n" +
                "<Title>CityDogs</Title>\n" +
                "</Head>\n" +
                "<Body>\n" +
                "<h1>Welcome to CityDogs</h1>\n" +
                "<h2>Search the pet dogs and breeds of New York City</h2>\n" +
                "<p>source: <a href='https://opendata.cityofnewyork.us/'>NYCOpenData</a></p>\n" +
                "<form action='/' method='get'>\n" +
                "    <input type='name' name='searchName'/> \n" +
                "    " +
                "    <input type='submit' value='Search'/>\n" +
                "</form>\n" +
                "</Body>\n" +
                "</Html>";
        resp.getWriter().println(HTMLForm);

        String userInput;
        userInput = req.getParameter("searchName");

            for (String dogs : dogRepo.getAllDogs()) {
                if (dogs.contains(userInput)){
                    resp.getWriter().println(dogs);
                }
            }
        }
    }

