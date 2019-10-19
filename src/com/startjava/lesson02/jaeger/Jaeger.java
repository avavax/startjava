package com.startjava.lesson02.jaeger;

public class Jaeger {

    private String name;
    private float weight;
    private float height;
    private int speed;
    private int power;
    private int armor;

    public Jaeger(String name, float weight, float height, int speed, int power, int armor) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.speed = speed;
        this.power = power;
        this.armor = armor;
    }

    public boolean drift() {
        System.out.println("Включен дрифт");
        return true;
    }

    public void move() {
        System.out.println("Робот двигается");
    }

    public void useCannon() {
        System.out.println("Робот стреляет");
    }

    public String scanKaiju() {
        return "Ничего не обнаружено";
    }

    public String getName() {
        return this.name;
    }
}