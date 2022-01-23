package com.company.classes.fifthClass.Interfaces;

public class CdPlayer implements Media{

    public void CdPlayer(){
        System.out.println("I am in CdPlayer class");
    }

    @Override
    public void stop() {
        System.out.println("music stops");
    }

    @Override
    public void start() {
        System.out.println("music starts");
    }
}
