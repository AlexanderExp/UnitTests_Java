package org.example;

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

}
