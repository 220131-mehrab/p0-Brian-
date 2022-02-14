package com.revature.citydogapp;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class DogServer {
    private Tomcat server;

    public DogServer(DogService dogService) {
        this.server = new Tomcat();
        this.server.setBaseDir(System.getProperty("java.io.tmpdir"));
        this.server.getConnector();
        this.server.addContext("", null);
        this.server.addServlet("", "dexServlet", dogService).addMapping("/");
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
