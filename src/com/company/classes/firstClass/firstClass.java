package com.company.classes.firstClass;

import java.util.Scanner;

public class firstClass {
    public static <prashant> void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Simple Debugging process is:
//           first it will set value by default according to datatype
//           then it see any default value set in the class
//           then it see values in constructor if defines in class
//           then finally if values is defined in main class then that will be final value otherwise value in
//           constructor(if defined) will be final otherwise default value set in class will be final
//           otherwise default value of that datatype will be final.

        Students[] student = new Students[5]; // By default stores null value.
        Students student1; // Declaring "Kush" reference variable to an object of "Student" type.
        student1 = new Students(); //Dynamically Allocates the stack memory at run time and returns a reference to it
        Students kush = new Students();
        kush.rno = 15;
        kush.name = "Kush Garg";
        kush.marks = 89.6f;
        System.out.println(kush.rno+" "+kush.name+" "+kush.marks);

        Students rahul = new Students();
//        rahul.name = "rahul";
        rahul.greeting();
        rahul.name = "rahul";
        rahul.greeting();
        rahul.changeName("Manu");
        rahul.greeting();

        Students prashant = new Students(13 , "prashant" , 15.54f);
        prashant.greeting();

        Students bhavesh = new Students(prashant);
        System.out.println(bhavesh.name);

        Students.fun();
    }
}

class Students{
    int rno = 15;
    String name = "ram";
    float marks = 90;

    void greeting(){
        System.out.println("hi "+name);
    }

// common idea is just put "this" in function(constructor) in classes if you want to change the value of class variables

    void changeName(String newName){
        name = newName;
        /*
        or
        this.name = name;  -----> if you want same variable
         */
    }

// Constructors dont have return type because implicitly the type of class is return type.
//    Students(){
//        this.rno = 15;
//        this.name = "Kush";
//        this.marks = 65;
//    }

    Students(int rno , String name , float marks){
        // put "this" if variable name is same
        System.out.println("Object is created");
        this.rno = rno;
        this.name = name;
        this.marks = marks;

        /* OR change variable name
        rno = roll;
        name = naam;
        marks = mark;
         */
    }

    //    This how you call constructor inside another constructor

    Students(){
        //this will call constructor having 3 arguments which is above constructor.
        //internally: new Students(13,"kush",10.0f);
        this(13,"kush",10.0f);
    }

    static void fun(){
        Students kunal = new Students();
        System.out.println(kunal.name);

    }

    Students(Students other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}
