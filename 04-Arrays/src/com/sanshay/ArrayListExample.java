package com.sanshay;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);


//        list.add(67);
//        list.add(6678);
//        list.add(69);
//        list.add(6090);
//        list.add(67);
//        list.add(67);
//        System.out.println(list.contains(3749));
//
//        list.set(0, 99);
//        list.remove(2);
//
//
//        System.out.println(list);

        //input

        for (int i = 0; i < 5; i++) {

            list.add(in.nextInt());
        }

        // get item ar any index

        for (int i = 0; i < 5; i++) {

            System.out.println(list.get(i)); // pass index her   e
            
        }
        
//        System.out.println(list);
    }


}