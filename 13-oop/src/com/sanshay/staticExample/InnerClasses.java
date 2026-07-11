package com.sanshay.staticExample;

import java.util.Arrays;


public class InnerClasses {
        static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

// non static ke ander staatic kr skte hai but static ke  ander non static nhi
        @Override
        public String toString()  {
            return name;
        }
    }

    public  void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//static class A {
//
//}