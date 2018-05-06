package com.playground.leetcode;

import com.playground.leetcode.JudgeRootCircle;

import org.junit.Test;
import static org.junit.Assert.*;

public class JudgeRootCircleTest {
    @Test public void test1() {
      JudgeRootCircle judgeRootCircle = new JudgeRootCircle();
      assertTrue(judgeRootCircle.moveAndCheckHome("UD"));
    }
    @Test public void test2() {
      JudgeRootCircle judgeRootCircle = new JudgeRootCircle();
      assertFalse(judgeRootCircle.moveAndCheckHome("LL"));
    }
    @Test public void test3() {
      JudgeRootCircle judgeRootCircle = new JudgeRootCircle();
      assertFalse(judgeRootCircle.moveAndCheckHome("UU"));
    }
    @Test public void test4() {
      JudgeRootCircle judgeRootCircle = new JudgeRootCircle();
      assertTrue(judgeRootCircle.moveAndCheckHome("LLLDDDRRRUUU"));
    }
}
