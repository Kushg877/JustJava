package com.company.classes.fifthClass.Interfaces;

public class Car implements Engine,Brake,Media{

    @Override
    public void start() {
        System.out.println("engine starts");
    }

    @Override
    public void stop() {
        System.out.println("engine stops");
    }

    @Override
    public void acc() {
        System.out.println("engine accelarates");
    }
}
