package project6;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * JUnit test class for PrimeNumberMethod.
 * Tests the isPrime method with various inputs.
 * Based on CMSC 201 Project 6 instructions.
 * @author Roopal
 * @version 1.0
 */
public class PrimeNumberMethodTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up PrimeNumberMethod tests...");
    }

    @Test
    public void testIsPrimeMethod() {
        assertTrue(PrimeNumberMethod.isPrime(2));    // ✅ Prime
        assertTrue(PrimeNumberMethod.isPrime(13));   // ✅ Prime
        assertTrue(PrimeNumberMethod.isPrime(97));   // ✅ Prime

        assertFalse(PrimeNumberMethod.isPrime(1));   // ❌ Not prime
        assertFalse(PrimeNumberMethod.isPrime(100)); // ❌ Not prime
        assertFalse(PrimeNumberMethod.isPrime(25));  // ❌ Not prime
    }
}
