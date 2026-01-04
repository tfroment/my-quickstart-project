package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-) 
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAppGreeting() {
        App app = new App();
        assertEquals("Hello World!", app.getGreeting());
    }

    @Test
    public void testSquareRootPositiveNumber() {
        App app = new App();
        assertEquals(2.0, app.squareRoot(4.0), 0.001);
        assertEquals(3.0, app.squareRoot(9.0), 0.001);
        assertEquals(0.0, app.squareRoot(0.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegativeNumberThrowsException() {
        App app = new App();
        app.squareRoot(-1.0);
    }
}
