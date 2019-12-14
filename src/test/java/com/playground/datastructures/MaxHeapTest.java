package com.playground.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxHeapTest {

  @Test
  public void test() {
    Integer[] input = new Integer[7];
    input[0] = 4;
    input[1] = 7;
    input[2] = 3;
    input[3] = 1;
    input[4] = 5;
    input[5] = 6;
    input[6] = 2;

    MaxHeap<Integer> heap = new MaxHeap<Integer>(input);
    assertEquals(new Integer(7), heap.popOut());
    assertEquals(new Integer(6), heap.popOut());
    assertEquals(new Integer(5), heap.popOut());
    assertEquals(new Integer(4), heap.popOut());
    assertEquals(new Integer(3), heap.popOut());
    assertEquals(new Integer(2), heap.popOut());
    assertEquals(new Integer(1), heap.popOut());
    assertNull(heap.popOut());
  }
}
