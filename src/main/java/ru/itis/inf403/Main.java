package ru.itis.inf403;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
        Bird bird = new Bird();
        bird.eat();
    }
}

