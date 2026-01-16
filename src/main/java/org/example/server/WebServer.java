package org.example.server;

public class WebServer extends GenericServer{
    protected String serverType = "web-server";
    protected String health = "good";
    protected String serverStaus;

    public WebServer(String status){
        this.serverStaus = status;
    }

    @Override
    public void getMetrics(){
        System.out.println("Server Type: " + this.serverType);
        System.out.println("Server IP Address: " + this.ipAddress);
        System.out.println("Server ID: " + this.serverId);
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
