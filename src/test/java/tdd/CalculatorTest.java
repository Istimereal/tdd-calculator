package tdd;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testDemoAdd()
    {
        int expected = 6;
        int actual = calculator.add(2,4);
        assertEquals(expected, actual);

        int expected2 = 10;
        int actual2 = calculator.add(4,6);
        assertEquals(expected2, actual2);

        int expected3 = 8;
        int actual3 = calculator.add("2,2,2,2");
        assertEquals(expected3, actual3);

        int expected4 = 15;
        int actual4 = calculator.add(new int[]{4,5,6});
        assertEquals(expected4, actual4);

        int expected5 = 21;
        int actual5 = calculator.add(new int[]{1,2,3,4,5,6});
        assertEquals(expected5, actual5);
    }

    @Test
    void testDemoSubtract()
    {
        int expected = 3;
        int actual = calculator.subtract(7,4);
        assertEquals(expected, actual);

        int expected1 = 5;
        int actual1 = calculator.subtract(12,7);
        assertEquals(expected1, actual1);
    }

    @Test
    void testDemoMultiply()
    {
        int expected = 8;
        int actual = calculator.multiply(2,4);
        assertEquals(expected, actual);

        int expected1 = 70;
        int actual1 = calculator.multiply(10,7);
        assertEquals(expected1, actual1);
    }

    @Test
    void testDemoDivide()
    {
        int expected = 2;
        int actual = calculator.divide(10,5);
        assertEquals(expected, actual);

       int expected1 = 5;
       int actual1 = calculator.divide(10,2);
       assertEquals(expected1, actual1);
    }
}