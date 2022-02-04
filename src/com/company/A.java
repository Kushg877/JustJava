package com.company;

public class A {
    class B{
        static void methodB(){
            System.out.println("Method B");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b= a.new B();
        b.methodB();
    }
}
