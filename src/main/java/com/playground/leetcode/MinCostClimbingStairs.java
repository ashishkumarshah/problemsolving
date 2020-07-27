package com.playground.leetcode;

/**
 * This Class is a solution for https://leetcode.com/problems/min-cost-climbing-stairs/
 *
 * @author ashishkumar.shah
 */
public class MinCostClimbingStairs {
  public int minCostClimbingStairs(int[] cost) {
    int prevPrev = cost[0];
    int prev = cost[1];
    int current;
    for (int i = 2; i < cost.length; i++) {
      current = cost[i] + Math.min(prev, prevPrev);
      prevPrev = prev;
      prev = current;
    }
    return Math.min(prev, prevPrev);
  }
}
