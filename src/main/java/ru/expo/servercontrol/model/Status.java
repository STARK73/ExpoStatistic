package ru.expo.servercontrol.model;

public class Status {
    String pc;
    String loadCP;
    String loadRAM;
    String temperature;
    String countSession;
    String countErrors;
    String fanSpeed;

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getLoadCP() {
        return loadCP;
    }

    public void setLoadCP(String loadCP) {
        this.loadCP = loadCP;
    }

    public String getLoadRAM() {
        return loadRAM;
    }

    public void setLoadRAM(String loadRAM) {
        this.loadRAM = loadRAM;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getCountSession() {
        return countSession;
    }

    public void setCountSession(String countSession) {
        this.countSession = countSession;
    }

    public String getCountErrors() {
        return countErrors;
    }

    public void setCountErrors(String countErrors) {
        this.countErrors = countErrors;
    }

    public String getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(String fanSpeed) {
        this.fanSpeed = fanSpeed;
    }
}