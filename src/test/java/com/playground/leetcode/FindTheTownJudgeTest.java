package com.playground.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindTheTownJudgeTest {

  @Test
  public void testFindJudge1() {
    FindTheTownJudge findTheTownJudge = new FindTheTownJudge();
    int[][] trustMatrix = {{1, 2}};
    assertEquals(findTheTownJudge.findJudge(2, trustMatrix), 2);
  }

  @Test
  public void testFindJudge2() {
    FindTheTownJudge findTheTownJudge = new FindTheTownJudge();
    int[][] trustMatrix = {{1, 3}, {1, 2}, {2, 3}};
    assertEquals(findTheTownJudge.findJudge(3, trustMatrix), 3);
  }

  @Test
  public void testFindJudge3() {
    FindTheTownJudge findTheTownJudge = new FindTheTownJudge();
    int[][] trustMatrix = {{1, 3}, {2, 3}, {3, 1}};
    assertEquals(findTheTownJudge.findJudge(3, trustMatrix), -1);
  }

  @Test
  public void testFindJudge4() {
    FindTheTownJudge findTheTownJudge = new FindTheTownJudge();
    int[][] trustMatrix = {{1, 3}, {1, 2}, {2, 3}, {2, 2}};
    assertEquals(findTheTownJudge.findJudge(3, trustMatrix), 3);
  }

  @Test
  public void testFindJudge5() {
    FindTheTownJudge findTheTownJudge = new FindTheTownJudge();
    int[][] trustMatrix = {{1, 3}, {1, 2}, {2, 3}, {2, 2}};
    assertEquals(findTheTownJudge.findJudge(4, trustMatrix), -1);
  }
}
