package com.playground.utils;

import static org.junit.Assert.*;

import com.playground.datastructures.LinkedList;
import com.playground.datastructures.LinkedListNode;
import org.junit.Test;

public class LinkedListUtilsTest {
  @Test
  public void testLoopDetectionWithLoop() {
    LinkedList l = new LinkedList();
    LinkedListNode node1 = new LinkedListNode(1);
    LinkedListNode node2 = new LinkedListNode(2);
    LinkedListNode node3 = new LinkedListNode(3);
    LinkedListNode node4 = new LinkedListNode(4);
    LinkedListNode node5 = new LinkedListNode(5);
    LinkedListNode node6 = new LinkedListNode(6);
    LinkedListNode node7 = new LinkedListNode(7);
    LinkedListNode node8 = new LinkedListNode(8);
    l.insertBeforeHead(node1);
    l.insertBeforeHead(node2);
    l.insertBeforeHead(node3);
    l.insertBeforeHead(node4);
    l.insertBeforeHead(node5);
    l.insertBeforeHead(node6);
    node1.setNext(node6);
    l.insertBeforeHead(node7);
    l.insertBeforeHead(node8);
    assertTrue(LinkedListUtils.detectLoop(l));
  }

  @Test
  public void testLoopDetectionWithoutLoopEvenCount() {
    LinkedList l = new LinkedList();
    LinkedListNode node1 = new LinkedListNode(1);
    LinkedListNode node2 = new LinkedListNode(2);
    LinkedListNode node3 = new LinkedListNode(3);
    LinkedListNode node4 = new LinkedListNode(4);
    LinkedListNode node5 = new LinkedListNode(5);
    LinkedListNode node6 = new LinkedListNode(6);
    LinkedListNode node7 = new LinkedListNode(7);
    LinkedListNode node8 = new LinkedListNode(8);
    l.insertBeforeHead(node1);
    l.insertBeforeHead(node2);
    l.insertBeforeHead(node3);
    l.insertBeforeHead(node4);
    l.insertBeforeHead(node5);
    l.insertBeforeHead(node6);
    l.insertBeforeHead(node7);
    l.insertBeforeHead(node8);
    assertFalse(LinkedListUtils.detectLoop(l));
  }

  @Test
  public void testLoopDetectionWithoutLoopOddCount() {
    LinkedList l = new LinkedList();
    LinkedListNode node1 = new LinkedListNode(1);
    LinkedListNode node2 = new LinkedListNode(2);
    LinkedListNode node3 = new LinkedListNode(3);
    LinkedListNode node4 = new LinkedListNode(4);
    LinkedListNode node5 = new LinkedListNode(5);
    LinkedListNode node6 = new LinkedListNode(6);
    LinkedListNode node7 = new LinkedListNode(7);
    LinkedListNode node8 = new LinkedListNode(8);
    LinkedListNode node9 = new LinkedListNode(9);
    l.insertBeforeHead(node1);
    l.insertBeforeHead(node2);
    l.insertBeforeHead(node3);
    l.insertBeforeHead(node4);
    l.insertBeforeHead(node5);
    l.insertBeforeHead(node6);
    l.insertBeforeHead(node7);
    l.insertBeforeHead(node8);
    l.insertBeforeHead(node9);
    assertFalse(LinkedListUtils.detectLoop(l));
  }

  @Test
  public void testLoopDetectionEmpty() {
    LinkedList l = new LinkedList();
    assertFalse(LinkedListUtils.detectLoop(l));
  }

  @Test
  public void testLinkedListLength() {
    LinkedList l = new LinkedList();

    LinkedListNode node1 = new LinkedListNode(1);
    LinkedListNode node2 = new LinkedListNode(2);
    LinkedListNode node3 = new LinkedListNode(3);
    LinkedListNode node4 = new LinkedListNode(4);
    LinkedListNode node5 = new LinkedListNode(5);
    LinkedListNode node6 = new LinkedListNode(6);
    LinkedListNode node7 = new LinkedListNode(7);
    LinkedListNode node8 = new LinkedListNode(8);
    LinkedListNode node9 = new LinkedListNode(9);
    l.insertBeforeHead(node1);
    l.insertBeforeHead(node2);
    l.insertBeforeHead(node3);
    l.insertBeforeHead(node4);
    l.insertBeforeHead(node5);
    l.insertBeforeHead(node6);
    l.insertBeforeHead(node7);
    l.insertBeforeHead(node8);
    l.insertBeforeHead(node9);

    assertEquals(9, LinkedListUtils.findLength(l));
  }

  @Test
  public void testLinkedListLengthNullList() {

    assertEquals(0, LinkedListUtils.findLength(null));
  }

  @Test
  public void testListReverse() {
    LinkedList l = new LinkedList();

    LinkedListNode node1 = new LinkedListNode(1);
    LinkedListNode node2 = new LinkedListNode(2);
    LinkedListNode node3 = new LinkedListNode(3);
    LinkedListNode node4 = new LinkedListNode(4);
    LinkedListNode node5 = new LinkedListNode(5);
    LinkedListNode node6 = new LinkedListNode(6);
    LinkedListNode node7 = new LinkedListNode(7);
    LinkedListNode node8 = new LinkedListNode(8);
    LinkedListNode node9 = new LinkedListNode(9);
    l.insertBeforeHead(node1);
    l.insertBeforeHead(node2);
    l.insertBeforeHead(node3);
    l.insertBeforeHead(node4);
    l.insertBeforeHead(node5);
    l.insertBeforeHead(node6);
    l.insertBeforeHead(node7);
    l.insertBeforeHead(node8);
    l.insertBeforeHead(node9);

    LinkedListUtils.printList(l);
    LinkedListUtils.reverse(l);
    LinkedListUtils.printList(l);
    int i = 1;
    for (LinkedListNode current = l.getHead(); current != null; current = current.getNext()) {
      assertEquals(i, current.getData());
      i++;
    }
  }
}
