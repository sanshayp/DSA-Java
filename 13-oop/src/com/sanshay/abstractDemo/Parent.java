package com.sanshay.abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

//    abstract void career();
    abstract void partner();

    //cannot create object of abstract classses;
    // cant create abstract construct

    // abstract classes are that are need to be overridern
    // abstract static cannot be but there can be static in abstract

    static void hello(){
        System.out.println("he");
    }
    void normal(){
        System.out.println("norma; metthod");
    }
}
