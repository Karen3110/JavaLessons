package com.company.design_patterns.observer;

public class Notebook implements PCElectronics {

    private final Phone phone;
    private final String name;

    public Notebook(Phone phone, String name) {
        this.name = name;
        this.phone = phone;
        phone.addObserver(this);
    }

    @Override
    public String toString() {
        return "Computer{" +
                " name='" + name + '\'' +
                '}';
    }

    @Override
    public void connectToPhoneWifi() {
        System.out.println("Connected:" + name);
    }
}
