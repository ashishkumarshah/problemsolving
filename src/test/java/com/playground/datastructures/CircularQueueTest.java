package com.playground.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

/** Class to test the implementation of SortedLinkedList */
public class CircularQueueTest {
  @Test
  public void testCircularQueue1() throws Exception {
    CircularQueue cq = new CircularQueue(10);
    try {
      cq.deQueue();
      fail("Exception not thrown for negative test case");
    } catch (EmptyQueueException emptyQueueException) {
      // This is expected. Move on
    }

    cq.enqueue(1);
    cq.enqueue(2);
    cq.enqueue(3);
    cq.enqueue(4);
    cq.enqueue(5);
    cq.enqueue(6);
    cq.enqueue(7);
    cq.enqueue(8);
    cq.enqueue(9);
    cq.enqueue(10);
    Integer deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(1), deQueuedValue);
    cq.enqueue(11);
    try {
      cq.enqueue(12);
      fail("No exception thrown");
    } catch (QueueOverflowException queueOverflowException) {
      // This is expected. Move on
    }
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(2), deQueuedValue);
    cq.enqueue(12);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(3), deQueuedValue);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(4), deQueuedValue);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(5), deQueuedValue);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(6), deQueuedValue);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(7), deQueuedValue);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(8), deQueuedValue);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(9), deQueuedValue);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(10), deQueuedValue);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(11), deQueuedValue);
    deQueuedValue = (Integer) cq.deQueue();
    assertEquals(new Integer(12), deQueuedValue);
  }

  @Test
  public void testCircularQueue2() throws Exception {
    CircularQueue cq = new CircularQueue(10);

    cq.enqueue(1);
    cq.enqueue(2);
    cq.enqueue(3);
    cq.enqueue(4);
    cq.enqueue(5);
    cq.enqueue(6);
    cq.enqueue(7);
    cq.enqueue(8);
    cq.enqueue(9);
    cq.enqueue(10);
    try {
      cq.enqueue(11);
      fail("No exception thrown");
    } catch (QueueOverflowException queueOverflowException) {
      // This is expected. Move on
    }
  }
}
