package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SphereTest {

    @Test
    void getArea() {
        var sphere = new Sphere(5);
        assertEquals(314, sphere.getArea());
    }

    @Test
    void getPerimeter() {
        var sphere = new Sphere(5);
        assertEquals(31, sphere.getPerimeter());
    }
}