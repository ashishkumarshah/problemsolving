package com.phodu.playground.factorial;

import com.phodu.playground.factorial.Factorial;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test public void testFactorial() {
	assertEquals(Factorial.factorial(2),2);
	assertEquals(Factorial.factorial(1),1);
	assertEquals(Factorial.factorial(0),1);
	assertEquals(Factorial.factorial(4),24);
	assertEquals(Factorial.factorial(5),120);
	//assertEquals(Factorial.factorial(-1),120);
    }
}