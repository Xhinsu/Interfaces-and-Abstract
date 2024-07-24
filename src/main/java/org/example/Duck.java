package org.example;

import java.sql.SQLOutput;

public class Duck extends Bird implements Swimmable {



    @Override
    public void swim() {
        Swimmable.super.swim();
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void makeSound() {

    }
}
