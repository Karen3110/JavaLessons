package com.company.design_patterns.observer;

import java.util.LinkedList;
import java.util.List;

public class Phone {
    private String model;
    private int screenWidth;
    private int screenHeight;
    private int memory;

    private final List<PCElectronics> observers = new LinkedList<>();


    public Phone() {
    }

    public Phone(String model, int screenWidth, int screenHeight, int memory) {
        this.model = model;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.memory = memory;
    }

    public void enableWifiHotSpot() {
        System.out.println("Enabling Wifi hot spot");
        for (PCElectronics observer : observers) {
            observer.connectToPhoneWifi();
        }
    }

    public void addObserver(PCElectronics computer) {
        observers.add(computer);
    }

    public void removeObserver(PCElectronics computer) {
        observers.remove(computer);
    }
}
