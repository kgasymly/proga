package ru.itis.inf403;

public class Bird extends Animal {
    public String name;
    public String coatColor;
    public String vid;

    public Bird() {}

    public Bird(String name, String coatColor, String vid) {
        this.name = name;
        this.coatColor = coatColor;
        this.vid = vid;
    }
    public void eat() {
        System.out.println("Bird is eating");
    }
    public void sleep() {
        System.out.println(name + "спит");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }


}
