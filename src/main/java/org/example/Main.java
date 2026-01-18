package org.example;
import org.example.server.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WebServer webserver = new WebServer("online");
        DataBaseServer databaseServer = new DataBaseServer("online", "20GB");
        CacheServer cacheServer = new CacheServer("online", "10000 seconds");

        Boolean session = true;
        Scanner sc = new Scanner(System.in);

        while (session) {
            System.out.println("__________________");
            System.out.println("__________________");
            System.out.println("Select 1, 2, 3, 4");
            System.out.println("1: Web Server");
            System.out.println("2: Database Server");
            System.out.println("3: Cache Server");
            System.out.println("4: Exit");

            String userSelection = sc.nextLine();
            switch (userSelection) {
                case "1" -> serverMethods(webserver);
                case "2" -> serverMethods(databaseServer);
                case "3" -> serverMethods(cacheServer);
                case "4" -> session = false;
            }
        }
        System.out.println("Exiting....");
    }

    public static void serverMethods(GenericServer server) {
        Scanner sc = new Scanner(System.in);
        Boolean session = true;

        while (session) {
            System.out.println("-----------------");
            System.out.println("-----------------");
            System.out.println("Select 1, 2, 3, 4");
            System.out.println("1. Get Metrics");
            System.out.println("2. Get Health");
            System.out.println("3. Get Status");
            System.out.println("4. Exit");

            String userSelection = sc.nextLine();
            switch (userSelection) {
                case "1" -> server.getMetrics();
                case "2" -> server.getHealth();
                case "3" -> server.getStatus();
                case "4" -> session = false;
            }
        }
        System.out.println("Going back to servers page...");
    }
}