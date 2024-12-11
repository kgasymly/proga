package ru.itis.inf403;


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Dog[] arr1 = Dog.createDogs();
        Dog d1 = arr1[0];
        Dog d2 = arr1[1];
        Bird[] arr2 = Bird.createBirds();
        Bird b1 = arr2[0];
        Bird b2 = arr2[1];
        b2.eat();
        b2.sleep();
        b1.fly();
        d2.coatColor();
        d2.poroda();
        d2.eat();
        d2.sleep();
        d2.bark();

    }
}

