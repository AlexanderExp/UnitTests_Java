package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void getArea() {
        var rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        var rectangle = new Rectangle(4, 5);
        assertEquals(18, rectangle.getPerimeter());
    }
}