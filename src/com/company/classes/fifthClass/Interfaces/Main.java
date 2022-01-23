package com.company.classes.fifthClass.Interfaces;

public class Main{

    public static void main(String[] args) {
//        Media car= new Car();
//        car.start();
//        car.stop();

//        ElectricEngine pe= new ElectricEngine();
        PowerEngine pe = new PowerEngine("first");
        ElectricEngine qe = new ElectricEngine("second");

        NiceCar car1 = new NiceCar(pe);
        car1.start();
        car1.startMusic();
        car1.upgradeEngine(qe);
        car1.start();

    }
}
