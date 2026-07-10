package com.sanshay.intro;

public class WrapperClasses {
    public static void main(String[] args) {
        int a= 10;
        int b  =20;
        swap(a,b);
        System.out.println(a + " "+b);//will no sweap
        int temp =a;
        a = b;
        b=temp;
        System.out.println(a + " "+b);// will swap

        Integer num = 45;  // obj3ecct so it has many properties

       final A kunal = new A("sanshay");
       kunal.name ="san";

//cant reassign
//       kunal = new A("new");

        A obj;
        for (int i = 0; i < 10000; i++) {
            obj = new A("randok");
        }
    }
    static void swap(int a ,int b){
        int temp =a;
        a = b;
        b=temp;
    } //will not swap


    static void swapI(Integer a ,Integer b){
        int temp =a;
        a = b;
        b=temp; // it should but it will no swap final  class

        // final prevent from being changed
    }
}
class A{
  final int num = 10;
  String name;

  public A(String name){
      this.name = name;
  }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroysed");
    }
}
