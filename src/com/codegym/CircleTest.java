package com.codegym;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(10);
        circles[1] = new Circle(20);
        circles[2] = new Circle(30);
        circles[3] = new Circle(40);
        circles[4] = new Circle(50);
        for (int i = 0; i < circles.length; i++) {
            System.out.println(i+". Before: "+circles[i].getArea());
            circles[i].resize(Math.random()*100);
            System.out.println(i+". After: " + circles[i].getArea());
        }

    }
}