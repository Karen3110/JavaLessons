package com.company.OOP;

//from a or b does not meter for foo method
// it will cal foo for B because  Foo is overridden By B from A interface
public class D implements  A, B {
    @Override
    public void f() {
        System.out.println("something");
    }
}
