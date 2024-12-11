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

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void fly() {
        System.out.println(name + " летает");
    }

    public static Bird[] createBirds() {
        Bird bird1 = new Bird("Ястреб", "коричневый", "хищный");
        Bird bird2 = new Bird("Попугай", "разноцветный","попугаеобразный");
        Bird[] arr2 = {bird1,bird2};
        return arr2;
    }

}
