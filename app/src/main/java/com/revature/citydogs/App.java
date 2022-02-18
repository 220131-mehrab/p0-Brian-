package com.revature.citydogs;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        String webAppName = "/citydogs";
        DogRepo dogRepo = new DogRepo("nycdogs.csv");
        DogServlet dogServlet = new DogServlet(dogRepo);
        SearchServlet searchService = new SearchServlet();

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.setPort(0);
        server.getConnector();

        server.addContext(webAppName, null);
        server.addServlet(webAppName, "DefaultServlet", new DefaultServlet()).addMapping("/*");
        server.addServlet(webAppName, "DogServlet", dogServlet).addMapping("/dogs");
        server.addServlet(webAppName, "SearchServlet", searchService).addMapping("/search");
        System.out.println("Server running on local http://localhost:" + server.getConnector().getPort());
            try {
                server.start();
            } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
