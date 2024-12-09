package ru.itis.inf403;


public class Dog extends Animal{
    public String name;
    public String eyesColor;
    public String poroda;
    public static void bark() {
        System.out.println("Gav gav");
    }
    public void eat() {
        System.out.println("Dog is eating");
    }
}
