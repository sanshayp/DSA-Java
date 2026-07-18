package com.sanshay.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("engine stop");
    }

    @Override
    public void acc() {
        System.out.println("acclerating");
    }
}
