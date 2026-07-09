package com.sanshay.intro;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

//        Student[] students = new Student[5];

        // decalaring
//        Student kunal = new Student();

        Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);
//        rahul.greeting();
//
//        kunal.changeName("Shoe lover");
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

//        Student random = new Student(rahul);
//        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.marks);
        Student one = new Student();
        Student two = one;
        one.name = "Something something";

        System.out.println(two.name);


    }
}
// create a class


class Student {
    int rno;
    String name;
    float marks ;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object
    void greeting() {
        System.out.println("name ois " + name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }

    Student(int roll,String namee,float mark){
        this.rno = roll;
        this.name = namee;
        this.marks = mark;
    }

}

