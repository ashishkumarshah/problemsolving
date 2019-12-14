package com.playground.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

/** Class to test the implementation of SortedLinkedList */
public class SortedLinkedListTest {
  @Test
  public void testSortedLinkedList1() {
    SortedLinkedList l = new SortedLinkedList();
    SortedLinkedListNode node1 = new SortedLinkedListNode(1);
    SortedLinkedListNode node2 = new SortedLinkedListNode(2);
    SortedLinkedListNode node3 = new SortedLinkedListNode(300);
    SortedLinkedListNode node4 = new SortedLinkedListNode(-200);

    l.insert(node2);
    assertEquals(2, l.getHead().getData());
    l.insert(node1);
    assertEquals(1, l.getHead().getData());
    l.insert(node3);
    assertEquals(1, l.getHead().getData());
    l.insert(node4);

    assertEquals(-200, l.getHead().getData());
    assertEquals(1, l.getHead().getNext().getData());
    assertEquals(2, l.getHead().getNext().getNext().getData());
    assertEquals(300, l.getHead().getNext().getNext().getNext().getData());
  }

  @Test
  public void testSortedLinkedList2() {
    SortedLinkedList l = new SortedLinkedList();
    SortedLinkedListNode node1 = new SortedLinkedListNode(1);
    SortedLinkedListNode node2 = new SortedLinkedListNode(2);
    SortedLinkedListNode node3 = new SortedLinkedListNode(300);
    SortedLinkedListNode node4 = new SortedLinkedListNode(-200);

    l.insert(node4);
    l.insert(node1);
    l.insert(node2);
    l.insert(node3);

    assertEquals(-200, l.getHead().getData());
    assertEquals(1, l.getHead().getNext().getData());
    assertEquals(2, l.getHead().getNext().getNext().getData());
    assertEquals(300, l.getHead().getNext().getNext().getNext().getData());
  }

  @Test
  public void testSortedLinkedList3() {
    SortedLinkedList l = new SortedLinkedList();
    SortedLinkedListNode node1 = new SortedLinkedListNode(1);
    SortedLinkedListNode node2 = new SortedLinkedListNode(2);
    SortedLinkedListNode node3 = new SortedLinkedListNode(300);
    SortedLinkedListNode node4 = new SortedLinkedListNode(-200);

    l.insert(node3);
    l.insert(node2);
    l.insert(node1);
    l.insert(node4);

    assertEquals(-200, l.getHead().getData());
    assertEquals(1, l.getHead().getNext().getData());
    assertEquals(2, l.getHead().getNext().getNext().getData());
    assertEquals(300, l.getHead().getNext().getNext().getNext().getData());
  }
}
