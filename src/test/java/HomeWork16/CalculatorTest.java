package HomeWork16;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    public Calculator calculator = new Calculator();
    private final int a = 3;
    private final int b = 5;

    @Test
    public void testAddition() {

        // GIVEN
        int intBefore = 0;

        // WHEN
        long intAfter = calculator.addition(a, b);
        long intNotNull = calculator.addition(intBefore, b);

        //THEN
        assertEquals(8, intAfter);
        assertNotSame(intBefore, intNotNull);

    }

    @Test(expected = NullPointerException.class)
    public void testAddition_negativeFlow() {

        // WHEN
        long intAfter = calculator.addition(null, b);

    }

    @Test
    public void testMultiplication() {

        //GIVEN
        int intBefore = 10;

        //WHEN
        int result = calculator.multiplication(a, b);
        int intAfter = calculator.multiplication(intBefore, a);

        //THEN
        assertEquals(15, result);
        assertTrue(intBefore < intAfter);

    }

    @Test
    public void testDivision() {

        //GIVEN
        int intBefore = 5;

        //WHEN
        double result = calculator.division(6, 3);
        double intAfter = calculator.division(intBefore, a);

        //THEN
        assertEquals(2, result, 0.1);
        assertTrue(intBefore > intAfter);

    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {

        //WHEN
        calculator.division(a, 0);

    }

    @Test
    public void testSubtraction() {

        //GIVEN
        int intBefore = 2;

        //WHEN
        int result = calculator.subtraction(b, a);
        int intAfter = calculator.subtraction(intBefore, a);

        //THEN
        assertEquals(2, result);
        assertTrue(intAfter < intBefore);
    }

    @Test
    public void testIntegerPars() {
        //GIVEN
        String str = "1";

        //WHEN
        int resultIntegerPars = calculator.integerPars(str);

        //THEN
        assertEquals(1, resultIntegerPars);
        
    }

    @Test(expected = NumberFormatException.class)
    public void testIntegerPars_negativeFlow() {
        //GIVEN
        String str = "1a";

        //WHEN
        int resultIntegerPars = calculator.integerPars(str);

        //THEN
        assertEquals(1, resultIntegerPars);
    }
}