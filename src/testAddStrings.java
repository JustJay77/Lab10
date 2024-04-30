import static org.junit.Assert.*;
import org.junit.Test;

public class testAddStrings {

    @Test
    public void testAddStringsSimple() {
        JUnitTesting myTest = new JUnitTesting();
        assertEquals("Simple concatenation of two strings", "HelloWorld", myTest.addStrings("Hello", "World"));
    }

    @Test
    public void testAddStringsWithSpace() {
        JUnitTesting myTest = new JUnitTesting();
        assertEquals("Concatenation of strings with spaces", "Hello World", myTest.addStrings("Hello ", "World"));
    }

    @Test
    public void testAddStringsEmpty() {
        JUnitTesting myTest = new JUnitTesting();
        assertEquals("Concatenation involving an empty string", "Hello", myTest.addStrings("Hello", ""));
    }

    @Test
    public void testAddStringsWithSpecialChars() {
        JUnitTesting myTest = new JUnitTesting();
        assertEquals("Concatenation of strings with special characters", "Hello@World", myTest.addStrings("Hello@", "World"));
    }

}
