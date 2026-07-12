package com.sanshay.properties.inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight old){
        super(old);
        this.weight = old.weight;
    }
    BoxWeight(double h){
        super();
        this.h = h;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;
    }
}

