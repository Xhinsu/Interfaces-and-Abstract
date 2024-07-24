package org.example;

public class Car extends Vehicle implements Drive{

    @Override
    public void move() {
        System.out.println("Car is driving!");
    }

    @Override
    public void drive(){
        System.out.println(this.getClass().getSimpleName() + " is being driven");
    }
}
