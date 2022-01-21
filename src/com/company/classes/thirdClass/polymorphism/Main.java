package com.company.classes.thirdClass.polymorphism;



public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        Shapes shape1=new Circle();
        shape1.area();
//        Shapes sqaure2 = new Square();
//        sqaure2.area();
    }
}
