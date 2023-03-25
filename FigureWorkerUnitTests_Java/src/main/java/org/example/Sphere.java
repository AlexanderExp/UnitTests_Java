package org.example;

class Sphere extends Shape {

    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(4 * Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

}
