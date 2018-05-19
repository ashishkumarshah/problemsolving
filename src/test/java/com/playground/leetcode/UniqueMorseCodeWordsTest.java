package com.playground.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueMorseCodeWordsTest {
  @Test
  public void testUniqueMorseCodeWords() {
    String[] input1 = {"gin", "zen", "gig", "msg"};
    assertEquals(UniqueMorseCodeWords.getUniqueMorseCodeCount(input1), 2);
  }
}
