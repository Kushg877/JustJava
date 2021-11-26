package com.company.classes.thirdClass.inheritance;

public class BoxWeight extends Box{
    // child can access elements of parent class until and unless they are not private  but no vice vera for obvious reasons
    double weight;

    public BoxWeight(double l,double weight) {
        super(l);
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // this calls constructor with 3 parameters of the parent(Box) class and we know l,h,w are initialize there only
        //let say we private l, therefore we cannot initialize l here but above statement will still be right because l is not initialize in this class but its own class i.e. Box
        System.out.println(super.w); // ---> should initialize before any child class because it does not care about what child class contains
        this.weight = weight;
    }
}
