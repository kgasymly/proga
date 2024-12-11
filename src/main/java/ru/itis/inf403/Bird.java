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

    public String getName() {
        return name;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public String getVid() {
        return vid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public void setVid(String vid) {
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

    public static

}
