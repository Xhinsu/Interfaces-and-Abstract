package org.example;

public class Fish extends Animal implements Swimmable {

    @Override
    public void swim() {
        Swimmable.super.swim();
    }

    @Override
    public void makeSound() {

    }
}
