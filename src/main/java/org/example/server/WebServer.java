package org.example.server;

public class WebServer extends Server{
    private final static String health = "good";
    protected String serverStaus;

    public WebServer(String status){
        this.serverStaus = status;
        this.serverType = "Web-server";
    }
    @Override
    public void getHealth(){
        System.out.println("Health: " + this.health);
    }

    @Override
    public void getStatus(){
        System.out.println("Status: " + this.serverStaus);
    }
}
