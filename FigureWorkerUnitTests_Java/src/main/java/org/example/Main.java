package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Ellipse ellipse = new Ellipse(4, 3);
        Rectangle rectangle = new Rectangle(4, 5);
        Sphere sphere = new Sphere(5);

        printInfo(circle);
        printInfo(ellipse);
        printInfo(rectangle);
        printInfo(sphere);
    }

    public static void printInfo(Shape shape) {
        System.out.println("Shape: " + shape.getName());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println();
    }
}