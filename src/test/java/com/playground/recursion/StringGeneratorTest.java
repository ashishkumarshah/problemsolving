package com.playground.recursion;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class StringGeneratorTest {

  @Test
  public void testGenerateBinaryStrings3() {
    String[] retval = StringGenerator.generateBinaryStrings(3);
    assertEquals(8, retval.length);
    assertArrayEquals(
        new String[] {"000", "001", "010", "011", "100", "101", "110", "111"}, retval);
  }

  @Test
  public void testGenerateBinaryStrings2() {
    String[] retval = StringGenerator.generateBinaryStrings(2);
    assertEquals(4, retval.length);
    assertArrayEquals(new String[] {"00", "01", "10", "11"}, retval);
  }

  @Test
  public void testGenerateBinaryStrings0() {
    String[] retval = StringGenerator.generateBinaryStrings(0);
    assertEquals(0, retval.length);
    assertArrayEquals(new String[] {}, retval);
  }

  @Test
  public void testGeneratePermutations() {
    List<Character> input = Arrays.asList('a', 'p', 'p', 'l', 'e');
    List<String> output = StringGenerator.generatePermutations(input, 5);
    assertEquals(120, output.size());
  }

  @Test
  public void testGeneratePermutationsNegative() {
    List<Character> input = Arrays.asList('a', 'p', 'p', 'l', 'e');
    List<String> output = StringGenerator.generatePermutations(input, 6);
    assertEquals(null, output);
  }
}
