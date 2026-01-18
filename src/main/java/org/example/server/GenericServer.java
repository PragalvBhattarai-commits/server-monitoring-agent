package org.example.server;

public abstract class GenericServer {
    public static int serverIdCounter = 0;
    public static int ipAddressCounter = 1000;

    protected int serverId;
    protected int ipAddress;

    GenericServer(){
        this.serverId = serverIdCounter++;
        this.ipAddress = ipAddressCounter++;
    }

    public abstract void getMetrics();
    public abstract void getHealth();
    public abstract void getStatus();
}
