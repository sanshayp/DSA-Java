package com.sanshay.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
//        this.age = age; this calls  this.age from parent only

    }

    @Override
    void career() {
        System.out.println("doctor");
    }

    @Override
    void partner() {
        System.out.println("i love ppper");

    }
}
