package com.company.classes.fifthClass.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(15);
        son.career();

        Daughter daughter = new Daughter(16);
        daughter.career();

        Parent mom = new Parent(15)//---> JAVA doesnot allow to create an object without implementing abstract classes
        {
            @Override
            void career() {

            }

            @Override
            void married() {

            }
        };
        System.out.println(mom.age);

        Parent daughter2= new Daughter(59);// We cannot create object of abstract parent class but we can make type of refererence to some object like this
    }
}
