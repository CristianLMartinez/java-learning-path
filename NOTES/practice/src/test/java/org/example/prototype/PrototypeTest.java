package org.example.prototype;


import org.junit.Test;

import static org.junit.Assert.*;

public class PrototypeTest {

    @Test
    public void testCloneable() throws CloneNotSupportedException {
        int SIDE = 3;
        Square shape = new Square(SIDE);
        assertNotNull(shape);
        assertEquals(SIDE, shape.getSide());

        // The parent class Shape has to implements Cloneable
        Square clonedShape = (Square) shape.clone();
        assertNotNull(clonedShape);
        assertEquals(shape.getSide(), clonedShape.getSide());

        Circle circle = new Circle(5);
        assertThrows(CloneNotSupportedException.class, () ->
            circle.clone()
        );
    }

}
