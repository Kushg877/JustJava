package com.company.classes.fifthClass.Interfaces;

public interface Engine {

    static final int x=78000; //----> it is by default static and final and its ok if you dont put it

    static void greet(){
        //static interface method should always have body and call via the interface name
    }
    void start();
    void stop();
    void acc();
}
