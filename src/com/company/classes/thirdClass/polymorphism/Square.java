package com.company.classes.thirdClass.polymorphism;

public class Square extends Shapes {
//    This will run when object of Square is created
//    hence it is overriding the parent method
    @Override // this is called annotation to check if following function overriding any method from its parent class
    // also if you delete this function from parent class then it(overriding) starts giving error
    // because now no longer they have same functions
    void area(){
        System.out.println("Area is square of side");
    }
}
