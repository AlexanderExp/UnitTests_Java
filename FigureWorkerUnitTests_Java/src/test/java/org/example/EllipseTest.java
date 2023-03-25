package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EllipseTest {
    @Test
    public void EllipseAreaTest() {
        var ellipse = new Ellipse(4, 3);
        assertEquals(38, ellipse.getArea());
    }

    @Test
    public void EllipsePerimeterTest() {
        var ellipse = new Ellipse(4, 3);
        assertEquals(22, ellipse.getPerimeter());
    }
}