package com.sanshay.properties.polymorphism;

public class Circle extends Shapes{


    // this will run when obj of circle is created
    // hence is overriding ther parent method
    @Override 
    void area(){
        System.out.println("pie r square");
    }
}
