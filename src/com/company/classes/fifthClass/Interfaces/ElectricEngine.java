package com.company.classes.fifthClass.Interfaces;

public class ElectricEngine implements Engine{
    public String name;
    public ElectricEngine(String name){
        System.out.println("I am in Electric Engine");
        this.name=name;
    }

    @Override
    public void start() {
        System.out.println("Electric engine starts");
        System.out.println(name);
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Electriv engine accelarates");
    }
}
