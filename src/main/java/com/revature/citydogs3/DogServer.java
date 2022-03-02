package com.revature.citydogs3;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class DogServer {
    private Tomcat server;

    public DogServer(DogService dogService) {
        this.server = new Tomcat();
        this.server.setBaseDir(System.getProperty("java.io.tmpdir"));
        this.server.getConnector();
        this.server.addContext("", null);
        this.server.addServlet("", "dogService", dogService).addMapping("/*");
        try {
            this.server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
