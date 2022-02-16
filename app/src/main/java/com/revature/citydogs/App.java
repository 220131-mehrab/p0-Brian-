package com.revature.citydogs;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        //String webAppName = "nycdogs";
        DogPile dogPile = new DogPile ("nycdogs.csv");
        DogService dogService = new DogService(dogPile);
        SearchFormService sfService = new SearchFormService();

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.getConnector();
        server.addContext("", null);
        server.addServlet("", "dogServlet", dogService).addMapping("/");
        server.addServlet("", "searchFormServlet", sfService).addMapping("/search");
            try {
                server.start();
            } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
