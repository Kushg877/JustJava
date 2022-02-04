package com.company.classes.forthClass;


public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(15, "kush");
        int n= obj.num;
        System.out.println(n);
    }
}
