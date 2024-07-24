package org.example;

public class Aeroplane extends Vehicle implements Flyable, Drive {

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    };


    @Override
    public void move() {
        System.out.println("Aeroplane is moving.");
    }

    @Override
    public void drive(){
        System.out.println(this.getClass().getSimpleName()+" is being driven");
    }
}
