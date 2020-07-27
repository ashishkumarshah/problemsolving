package com.playground.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinCostClimbingStairsTest {

  @Test
  public void test1() {
    MinCostClimbingStairs s = new MinCostClimbingStairs();
    int[] input = {10, 15, 20};
    assertEquals(15, s.minCostClimbingStairs(input));
  }

  @Test
  public void test2() {
    MinCostClimbingStairs s = new MinCostClimbingStairs();
    int[] input = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    assertEquals(6, s.minCostClimbingStairs(input));
  }
}
