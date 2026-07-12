package com.sanshay.properties.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;
    BoxPrice(){
        super();

        this.cost = -9;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice( double h, double w, double weight, double cost,double l) {
        super(l);
        this.l = l;
        this.cost = cost;
    }
}
