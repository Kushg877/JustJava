package com.company.classes.secondClass;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
//        obj.num;    ----> because num was private
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        // all three reference variable are pointing to all 1 single object.
    }
}
