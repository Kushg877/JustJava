package com.company.classes.fifthClass.Interfaces;

public class PowerEngine implements Engine{

    private String name;

    PowerEngine(String name){
        System.out.println("hi");
        this.name=name;
    }

    @Override
    public void start() {
        System.out.println("Power engine starts");
        System.out.println(name);
    }

    @Override
    public void stop() {
        System.out.println("Power engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelarate");
    }
}
