package com.company.design_patterns.builder;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Phone p = Phone.BUILDER.withMemory(123).withModel("IP").build();

        System.out.println(p);
    }
}
