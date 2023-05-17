package com.company.design_patterns.builder;


public class PhoneBuilder {
    private String model;
    private int screenWidth;
    private int screenHeight;
    private int memory;

    public PhoneBuilder() {
    }

    PhoneBuilder withModel(String model) {
        this.model = model;
        return this;
    }


    public PhoneBuilder withScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
        return this;
    }


    public PhoneBuilder withScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
        return this;
    }


    public PhoneBuilder withMemory(int memory) {
        this.memory = memory;
        return this;
    }

    public Phone build() {
        return new Phone(model, screenWidth, screenHeight, memory);
    }
}
