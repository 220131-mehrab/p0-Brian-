package com.revature.citydogapp;

import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        DogPile dogPile = new DogPile ("nycdogs.csv");
        DogService dogService = new DogService(dogPile);
        DogServer DogServer = new DogServer(dogService);

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.getConnector();
        server.addContext("", null);
        //server.addServlet("", "dexServlet", dogService).addMapping;

    }
}
