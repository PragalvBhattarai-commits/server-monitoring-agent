package org.example.server;

public abstract class Server {
    public static int serverIdCounter = 0;
    public static int ipAddressCounter = 1000;

    protected String serverType;
    protected int serverId;
    protected int ipAddress;

    Server(){
        this.serverId = serverIdCounter++;
        this.ipAddress = ipAddressCounter++;
    }

    public void getMetrics(){
        System.out.println("Server Type: " + this.serverType);
        System.out.println("Server IP Address: " + this.ipAddress);
        System.out.println("Server ID: " + this.serverId);
    };
    abstract void getHealth();
    abstract void getStatus();
}
