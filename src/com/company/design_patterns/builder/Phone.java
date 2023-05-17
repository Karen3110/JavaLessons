package com.company.design_patterns.builder;

public class Phone {
    private String model;
    private int screenWidth;
    private int screenHeight;
    private int memory;

    public static final PhoneBuilder BUILDER = new PhoneBuilder();

    public Phone() {
    }

    public Phone(String model, int screenWidth, int screenHeight, int memory) {
        this.model = model;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.memory = memory;
    }

    public void enableWifiHotSpot () {
        System.out.println("Enabling Wifi hot spot");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", screenWidth=" + screenWidth +
                ", screenHeight=" + screenHeight +
                ", memory=" + memory +
                '}';
    }
}
