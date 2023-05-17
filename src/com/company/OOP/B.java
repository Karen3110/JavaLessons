package com.company.OOP;

public interface B extends A {
    void f();

    default void foo(){

        System.out.println("fooB");
    }
}
