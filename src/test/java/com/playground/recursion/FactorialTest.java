package com.playground.recursion;

import com.playground.recursion.Factorial;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test public void testFactorial() {
      assertEquals(Factorial.factorial(2),2);
      assertEquals(Factorial.factorial(1),1);
      assertEquals(Factorial.factorial(0),1);
      assertEquals(Factorial.factorial(4),24);
      assertEquals(Factorial.factorial(5),120);
      try {
        long retval = Factorial.factorial(-1);
        fail("Exception Not Thrown");
      } catch (IllegalArgumentException ex) {
        
      }
    }
}
