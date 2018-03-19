package server;

import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.DBService;
import servlets.SignInServlet;
import servlets.SignUpServlet;

public class Main {
    public static void main(String[] args) throws Exception {
//        DBService dbService = new DBService();
//
//        ServletContextHandler sC = new ServletContextHandler(ServletContextHandler.SESSIONS);
//        sC.addServlet(new ServletHolder(new SignUpServlet(dbService)), "/signup");
//        sC.addServlet(new ServletHolder(new SignInServlet(dbService)), "/signin");
//
//        org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(8080);
//        server.setHandler(sC);
//
//        server.start();
//        System.out.println("Server started");
//        server.join();

        Car[] cars = new Car[2];
        BMW bmw = new BMW();
        Audi audi = new Audi();
        cars[0] = bmw;
        cars[1] = audi;
        for (int i = 0; i < cars.length; i++) {
            cars[i].speed();
        }
    }
}
