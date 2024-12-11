package ru.itis.inf403;

public class DomesticCats extends Cat {
    public String name;
    public String poroda;

    public DomesticCats() {}

    public DomesticCats(String name, String poroda) {
        this.name = name;
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void purring() {
        System.out.println(name + ": мяу");
    }
    public void run() {
        System.out.println(name + " бегает");
    }
    public void por() {
        System.out.println("порода у " + name + " : " + poroda);
    }

    public static DomesticCats[] createDomesticCats() {
        DomesticCats domesticCats1 = new DomesticCats("Буся", "Швейцарский кот");
        DomesticCats domesticCats2 = new DomesticCats("АйсКьюб", "Британский кот");
        DomesticCats[] arr3 = {domesticCats1,domesticCats2};
        return arr3;
        }
    }