package com.sanshay.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
//        this.age = age; this calls  this.age from parent only
    }
    @Override
    void career() {
        System.out.println("coder");
    }

    @Override
    void partner() {
        System.out.println("i lover iron man");

    }
}
