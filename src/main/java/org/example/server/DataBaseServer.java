package org.example.server;

public class DataBaseServer extends Server {
    protected String ram;
    private final static String health = "good";
    protected String serverStaus;

    public DataBaseServer(String status, String ram) {
        this.serverStaus = status;
        this.serverType = "data-base-server";
        this.ram = ram;
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
