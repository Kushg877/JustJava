package com.company.classes.fifthClass.abstractDemo;

public class Daughter extends Parent{

    Daughter(int age){
        super(age);
//        this.age=age;
    }

    @Override
    void career(){
        System.out.println("I want to be a Doctor");
    }

    @Override
    void married(){
        System.out.println("I am not Married");
    }
}
