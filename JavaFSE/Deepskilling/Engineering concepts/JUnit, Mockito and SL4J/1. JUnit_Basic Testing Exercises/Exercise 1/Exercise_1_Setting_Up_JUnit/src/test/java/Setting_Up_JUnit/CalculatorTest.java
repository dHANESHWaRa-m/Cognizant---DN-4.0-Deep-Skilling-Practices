package Setting_Up_JUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-8, calculator.add(-5, -3));
    }
}