package com.sanshay.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son =new Son(30);

        son.career();
        son.normal();

        Daughter daughter = new Daughter(19);
        daughter.career();
         // cant create boject of abstract  class

//        Parent mom = new Parent(45);
        Parent.hello();


    }

}
