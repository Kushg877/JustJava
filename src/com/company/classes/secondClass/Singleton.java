package com.company.classes.secondClass;

public class Singleton {
    // only one object
    // basic idea is to not allow people to use constructor because when a constructor is called new object is created
    int num;
    private Singleton(){  // since this is private it will only run in this class.

    }

    private static Singleton instance;

    public static Singleton getInstance(){ //getters and setters
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
