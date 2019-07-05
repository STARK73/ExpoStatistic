package ru.expo.servercontrol.model;

public class Statistic {
    public Statistic(String numberServer) {
        this.numberServer = numberServer;
    }

    public String getNumberServer() {
        return numberServer;
    }

    public void setNumberServer(String numberServer) {
        this.numberServer = numberServer;
    }

    private String numberServer;
}
