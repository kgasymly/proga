package ru.itis.inf403;


public class Dog extends Animal {
    public String name;
    public String coatColor;
    public String poroda;

    public Dog() {
    }

    public Dog(String name, String coatColor, String poroda) {
        this.name = name;
        this.coatColor = coatColor;
        this.poroda = poroda;
    }

    public void bark() {
        System.out.println(name +": 'Гав гав'");
    }

    public String getName() {
        return name;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEyesColor(String eyesColor) {
        this.coatColor = coatColor;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void eat() {
        System.out.println(name + " кушает");
    }

    public void sleep() {
        System.out.println(name + " спит");
    }

    public void coatColor() {
        System.out.println("у " + name + " " + coatColor + " цвет шерсти");
    }

    public void poroda() {
        System.out.println("порода " + name + " : " + poroda);
    }

    public static Dog[] createDogs() {
        Dog dog1 = new Dog("Шарик", "рыже-золотистый","Шпиц");
        Dog dog2 = new Dog("Тузик", "черный", "Бульдог");
        Dog[] arr1 = {dog1,dog2};
        return arr1;
    }

}
