package com.sanshay.interfaces;

public class Car implements Engine, Brake,Media{


    @Override
    public void start() {
        System.out.println("start kari");
    }
    @Override
    public void brake() {
        System.out.println("brake mari");
    }

    @Override
    public void stop() {
        System.out.println("rok di");
    }

    @Override
    public void acc() {
        System.out.println("race bhjadhai");
    }
}
