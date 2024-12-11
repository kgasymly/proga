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

        DomesticCats[] arr3 = DomesticCats.createDomesticCats();
        DomesticCats dc1 = arr3[0];
        DomesticCats dc2 = arr3[1];

        PredatoryCats[] arr4 = PredatoryCats.createPredatoryCats();
        PredatoryCats pc1 = arr4[0];
        PredatoryCats pc2 = arr4[1];

        d1.coatColor();
        d1.poroda();
        d1.eat();
        d1.sleep();
        d1.bark();

        d2.coatColor();
        d2.poroda();
        d2.eat();
        d2.sleep();
        d2.bark();

        b1.eat();
        b1.sleep();
        b1.fly();

        b2.eat();
        b2.sleep();
        b2.fly();

        dc1.run();
        dc1.purring();
        dc1.por();

        dc2.run();
        dc2.purring();
        dc2.por();

        pc1.growl();
        pc1.attack();
        pc1.hunt();
        pc1.victim();

        pc2.growl();
        pc2.attack();
        pc2.hunt();
        pc2.victim();

    }
}

