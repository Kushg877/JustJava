package com.company.classes.fifthClass.abstractDemo;

public abstract class Parent {
    int age;

    Parent(int age){
        this.age=age;
        System.out.println("I am in constructor");
    }

    abstract void career();
    abstract void married();
}
