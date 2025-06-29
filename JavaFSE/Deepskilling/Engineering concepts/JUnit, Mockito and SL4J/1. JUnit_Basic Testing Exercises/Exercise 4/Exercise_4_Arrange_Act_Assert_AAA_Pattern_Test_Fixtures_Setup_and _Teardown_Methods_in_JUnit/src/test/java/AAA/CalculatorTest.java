package AAA;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest{

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Running @Before: Initializing Calculator instance.");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Running @After: Cleaning up (Calculator instance set to null).");
        calculator = null;
    }

    @Test
    public void testAddPositiveNumbers() {
        System.out.println("--- Running testAddPositiveNumbers ---");
        int num1 = 5;
        int num2 = 3;
        int expectedSum = 8;
        int actualSum = calculator.add(num1, num2);

        assertEquals("The sum of positive numbers should be correct", expectedSum, actualSum);
    }

    @Test
    public void testAddNegativeNumbers() {
        System.out.println("--- Running testAddNegativeNumbers ---");
        int num1 = -5;
        int num2 = -3;
        int expectedSum = -8;

        int actualSum = calculator.add(num1, num2);

        assertEquals("The sum of negative numbers should be correct", expectedSum, actualSum);
    }

    @Test
    public void testSubtract() {
        System.out.println("--- Running testSubtract ---");
        int num1 = 10;
        int num2 = 4;
        int expectedDifference = 6;

        int actualDifference = calculator.subtract(num1, num2);

        assertEquals("The difference should be correct", expectedDifference, actualDifference);
    }

    @Test
    public void testMultiply() {
        System.out.println("--- Running testMultiply ---");
        int num1 = 6;
        int num2 = 7;
        int expectedProduct = 42;

        int actualProduct = calculator.multiply(num1, num2);

        assertEquals("The product should be correct", expectedProduct, actualProduct);
    }

    @Test
    public void testDivideValid() {
        System.out.println("--- Running testDivideValid ---");
        int num1 = 10;
        int num2 = 2;
        double expectedQuotient = 5.0;

        double actualQuotient = calculator.divide(num1, num2);

        assertEquals("The quotient should be correct", expectedQuotient, actualQuotient, 0.001); // Delta for double comparison
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        System.out.println("--- Running testDivideByZero ---");
        int num1 = 10;
        int num2 = 0; // Divisor is zero
        
        calculator.divide(num1, num2);

    }
}

