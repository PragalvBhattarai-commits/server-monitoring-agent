package org.example.server;

public class DataBaseServer extends GenericServer {
    protected String ram;
    protected String serverType = "data-base-server";
    protected String health = "good";
    protected String serverStaus;

    public DataBaseServer(String status, String ram) {
        this.serverStaus = status;
        this.ram = ram;
    }

    @Override
    public void getMetrics() {
        System.out.println("Server Type: " + this.serverType);
        System.out.println("Server IP Address: " + this.ipAddress);
        System.out.println("Server ID: " + this.serverId);
        System.out.println("RAM: " + this.ram);
    }

    @Override
    public void getHealth() {
        System.out.println("Health: " + this.health);
    }

    @Override
    public void getStatus() {
        System.out.println("Status: " + this.serverStaus);
    }
}
