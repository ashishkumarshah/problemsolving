package com.playground.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class RottenOrangesTest {
  @Test
  public void test1() {
    int data[][] = {{2, 1, 0, 2, 1}, {1, 0, 1, 2, 1}, {1, 0, 0, 2, 1}};
    int time = RottenOranges.findTotalTimeToRotAllOranges(3, 5, data);
    assertEquals(2, time);
  }

  @Test
  public void test2() {
    int data[][] = {{2, 1, 0, 2, 1}, {0, 0, 1, 2, 1}, {1, 0, 0, 2, 1}};
    int time = RottenOranges.findTotalTimeToRotAllOranges(3, 5, data);
    assertEquals(-1, time);
  }
}
