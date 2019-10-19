package com.startjava.lesson02.jaeger;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("One", 1200.0f, 75.2f, 5, 3, 4);
        jaeger1.move();
        System.out.println(jaeger1.getName());
    }
}