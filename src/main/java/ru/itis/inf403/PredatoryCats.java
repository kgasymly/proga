package ru.itis.inf403;

import java.sql.SQLOutput;

public class PredatoryCats extends Cat {
    public String name;
    public int victims;
    public PredatoryCats() {}

    public PredatoryCats(String name, int victims) {
        this.name = name;
        this.victims = victims;
    }

    public String getName() {
        return name;
    }

    public int getVictims() {
        return victims;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVictims(int victims) {
        this.victims = victims;
    }

    public void growl() {
        System.out.println(name + " R-r-r-r");
    }
    public void attack() {
        System.out.println(name + " нападает на какое-то животное");
    }
    public void hunt() {
        System.out.println(name + " охотиться на какое-то животное");
    }
    public void victim() {
        System.out.println("Число жертв у " + name + " : " +  victims);
    }

    public static PredatoryCats[] createPredatoryCats() {
        PredatoryCats predatoryCats1 = new PredatoryCats("Рысь" , 12);
        PredatoryCats predatoryCats2 = new PredatoryCats("Леопард", 9);
        PredatoryCats[] arr4 = {predatoryCats1,predatoryCats2};
        return arr4;
    }
}
