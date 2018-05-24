package com.playground.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {
  @Test
  public void testStack1() {
    Stack stack = new Stack();
    stack.push(10);
    assertEquals(10, stack.peek());
    stack.push(20);
    assertEquals(20, stack.peek());
    assertEquals(20, stack.pop());
    assertEquals(10, stack.pop());
    assertEquals(null, stack.pop());
    assertEquals(null, stack.peek());
  }
}
