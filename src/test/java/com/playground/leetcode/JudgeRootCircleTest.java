package com.playground.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class JudgeRootCircleTest {
  @Test
  public void test1() {
    JudgeRootCircle judgeRootCircle = new JudgeRootCircle();
    assertTrue(judgeRootCircle.moveAndCheckHome("UD"));
  }

  @Test
  public void test2() {
    JudgeRootCircle judgeRootCircle = new JudgeRootCircle();
    assertFalse(judgeRootCircle.moveAndCheckHome("LL"));
  }

  @Test
  public void test3() {
    JudgeRootCircle judgeRootCircle = new JudgeRootCircle();
    assertFalse(judgeRootCircle.moveAndCheckHome("UU"));
  }

  @Test
  public void test4() {
    JudgeRootCircle judgeRootCircle = new JudgeRootCircle();
    assertTrue(judgeRootCircle.moveAndCheckHome("LLLDDDRRRUUU"));
  }
}
