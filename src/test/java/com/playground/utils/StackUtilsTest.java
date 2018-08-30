package com.playground.utils;

import static org.junit.Assert.*;

import java.util.Stack;
import org.junit.Test;

public class StackUtilsTest {

  @Test
  public void testStackReversal() {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    StackUtils.reverseStack(stack);
    assertEquals(new Integer(1), stack.pop());
    assertEquals(new Integer(2), stack.pop());
    assertEquals(new Integer(3), stack.pop());
    assertEquals(new Integer(4), stack.pop());
    assertEquals(new Integer(5), stack.pop());
    assertTrue(stack.isEmpty());
  }

  @Test
  public void testStackSorting() {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(34);
    stack.push(11);
    stack.push(50);
    stack.push(23);
    stack.push(100);
    stack.push(45);
    StackUtils.sortStack(stack);
    assertEquals(new Integer(100), stack.pop());
    assertEquals(new Integer(50), stack.pop());
    assertEquals(new Integer(45), stack.pop());
    assertEquals(new Integer(34), stack.pop());
    assertEquals(new Integer(23), stack.pop());
    assertEquals(new Integer(11), stack.pop());
    assertTrue(stack.isEmpty());
  }
}
