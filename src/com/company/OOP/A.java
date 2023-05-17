package com.company.OOP;

public interface A {
    void f();
    default void foo(){
        System.out.println("fooA");
    }
}
