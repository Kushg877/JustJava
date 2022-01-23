package com.company.classes.fifthClass.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media = new CdPlayer();

    public NiceCar(Engine engine){
        this.engine=engine;
        System.out.println("hello");
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        media.start();
    }
    public void stopMusic(){
        media.stop();
    }
    public void upgradeEngine(Engine engine){
        this.engine=engine;
    }
}
