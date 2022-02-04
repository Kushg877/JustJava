package com.company.classes.thirdClass.inheritance;

import java.util.Arrays;

public class Box {
    double l;
    double h;
    double w;

    public void fun(){

    }
    Box() {
        super();
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){  // copy constructor..previously we use another instead of old but it doesnt matter
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information()
    {
        System.out.println("Running the box");

    }
}
