package com.company.classes.fifthClass.abstractDemo;

public class Son extends Parent{

    Son(int age){
        super(age);
//        this.age=age;
    }

//    public abstract void a();

    @Override
    void career(){
        System.out.println("I am a coder");
    }

    @Override
    void married(){
        System.out.println("I am married");
    }
}
