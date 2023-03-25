package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void CircleAreaTest() {
        var circle = new Circle(5);
        assertEquals(79, circle.getArea());
    }
    @Test
    public void CirclePerimeterTest() {
        var circle = new Circle(5);
        assertEquals(31, circle.getPerimeter());
    }
}