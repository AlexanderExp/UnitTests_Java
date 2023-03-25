package org.example;

class Ellipse extends Shape {

    private double a;
    private double b;

    public Ellipse(double a, double b) {
        super("Ellipse");
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * a * b);
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * Math.sqrt((a * a + b * b) / 2));
    }

}
