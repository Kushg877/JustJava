package com.company.classes.secondClass;

import java.util.Scanner;

public class secondClass {
    static int a = 4;
    static int b = 5;

    static {  //------> This block is executed only once as soon as it encounters Declaring of Human class first time. If another object will create after sometime then also this block will not execute. This block is executed only once(i.e when first object is created)

        System.out.println("I am in static block and i will not execute again");
        b=a*b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Human kush = new Human(13,"Kush",10000,false);
        System.out.println(Human.population);  // prints 1 because until now only 1 object is created

//      System.out.println(kush.population); ----> This statement will also print 1 but dont do it like this because its not the right habit

        Human rahul = new Human(24,"rahul",15000,true);
        System.out.println(Human.population); // prints 2 because now 2 objects of humans are there
        Human bhavesh = new Human(26,"bhavesh",25000,true);

        System.out.println(Human.population);  // prints 3 because 3 objects are created before printing this statement
        System.out.println(Human.population); // prints 3 because 3 objects are created before printing this statement

         // for static block
//        System.out.println(secondClass.a+" "+secondClass.b);
//        secondClass obj = new secondClass();
    }

    static void fun(){
//        greeting();  ----> static cannot contain a non static member
        // But if we assign object to non static member then we can use it.
        secondClass obj = new secondClass();
        obj.greeting();
    }

    void fun2(){
        // A non static can contain both static and non static members.
        fun();
        greeting();
    }

    void greeting(){
        System.out.println("Hello");
    }
    static {  //------> This block is executed exactly once when the class is first loaded,
        // meaning this is the first thing which gets executed even before main function.
        // Run it you will get more clarity
        System.out.println("I am in static block");// -----> This statement will only print once
        b = a * 5;
    }
}

class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void a(){
        System.out.println("hello peter");
//        System.out.println(this.age);  ----> Cannot use this keyword in static function
    }

    Human(int age , String name, int salary, boolean married) {
        this.age=age;
        this.name=name;
        this.married=married;
        this.salary=salary;
        Human.population+=1; // Also works with this.population += 1 as well but that is more right.
//        Human sarika = new Human();
        Human.a();

    }


}
