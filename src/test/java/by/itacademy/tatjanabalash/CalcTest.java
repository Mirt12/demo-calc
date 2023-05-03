package by.itacademy.tatjanabalash;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalcTest {
    //JUnit Maven Java example
    @Test
    public void testSum() {
//ARRANGE:
        int expected = 8;
//ACT:
        int actual = Calc.sum(3, 5);
//ASSERT:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSubstract() {
        int expected = -2;
        int actual = Calc.subtract(3, 5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 6;
        int actual = Calc.multiply(3, 2);
        Assertions.assertEquals(expected, actual);
    }
}