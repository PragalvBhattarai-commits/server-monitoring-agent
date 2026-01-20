package org.example.server;

public class CacheServer extends Server{
    protected String ttl;
    private final static String health = "good";
    protected String serverStaus;

    public CacheServer(String serverStaus, String ttl){
        this.serverStaus = serverStaus;
        this.serverType = "data-base-server";
        this.ttl = ttl;
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
