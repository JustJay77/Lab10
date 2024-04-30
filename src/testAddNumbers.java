import static org.junit.Assert.*;
import org.junit.Test;

public class testAddNumbers {

    @Test
    public void testAddNumbersPositive() {
        JUnitTesting myTest = new JUnitTesting();
        assertEquals("Adding two positive numbers should work", 12, myTest.addNumbers(7, 5));
    }

    @Test
    public void testAddNumbersNegative() {
        JUnitTesting myTest = new JUnitTesting();
        assertEquals("Adding two negative numbers should work", -10, myTest.addNumbers(-7, -3));
    }

    @Test
    public void testAddNumbersWithZero() {
        JUnitTesting myTest = new JUnitTesting();
        assertEquals("Adding a number with zero should return the number itself", 7, myTest.addNumbers(7, 0));
    }

    @Test
    public void testAddNumbersPositiveNegative() {
        JUnitTesting myTest = new JUnitTesting();
        assertEquals("Adding a positive and a negative number should work", 4, myTest.addNumbers(7, -3));
    }

}
