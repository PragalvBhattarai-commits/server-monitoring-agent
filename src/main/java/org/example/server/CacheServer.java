package org.example.server;

public class CacheServer extends GenericServer{
    protected String ttl;
    protected String serverType = "data-base-server";
    protected String health = "good";
    protected String serverStaus;

    public CacheServer(String serverStaus, String ttl){
        this.serverStaus = serverStaus;
        this.ttl = ttl;
    }

    @Override
    public void getMetrics() {
        System.out.println("Server Type: " + this.serverType);
        System.out.println("Server IP Address: " + this.ipAddress);
        System.out.println("Server ID: " + this.serverId);
        System.out.println("TTL: " + this.ttl);
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
