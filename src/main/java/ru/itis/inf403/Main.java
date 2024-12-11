package ru.itis.inf403;


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Eagle eagle = new Eagle();
        Dog[] arr1 = Dog.createDogs();
        Dog s1 = arr1[0];
        Dog s2 = arr1[1];

        s2.coatColor();
        s2.poroda();
        s2.eat();
        s2.sleep();
        s2.bark();

    }
}

