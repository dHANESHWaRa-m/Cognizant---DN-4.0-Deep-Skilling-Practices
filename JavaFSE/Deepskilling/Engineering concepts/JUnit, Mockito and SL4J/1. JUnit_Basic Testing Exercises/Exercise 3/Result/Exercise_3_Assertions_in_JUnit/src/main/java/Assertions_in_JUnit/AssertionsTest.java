package Assertions_in_JUnit;

import org.junit.Test;

import static org.junit.Assert.*;


public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);


        assertTrue(5 > 3);

        assertFalse(5 < 3);

        assertNull(null);

        assertNotNull(new Object());
    }

    @Test
    public void testAdditionalAssertions() {
        String str1 = "Hello";
        String str2 = str1;
        assertSame(str1, str2);

        String str3 = new String("Hello");
        assertNotSame(str1, str3);
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);

        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });


    }
}