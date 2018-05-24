package com.playground.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
  @Test
  public void testLinkedList1() {
    LinkedList linkedList = new LinkedList();
    LinkedListNode node1 = new LinkedListNode(10);
    LinkedListNode node2 = new LinkedListNode(20);
    LinkedListNode node3 = new LinkedListNode(30);
    LinkedListNode node4 = new LinkedListNode(40);

    assertEquals(null, linkedList.getHead());
    linkedList.insertBeforeHead(null);
    assertEquals(null, linkedList.getHead());
    linkedList.insertAfterHead(null);
    assertEquals(null, linkedList.getHead());
    assertEquals(null, linkedList.deleteAfterHead());
    linkedList.insertAfterHead(node1);
    assertEquals(10, linkedList.getHead().getData());
    linkedList.insertBeforeHead(node2);
    assertEquals(20, linkedList.getHead().getData());
    linkedList.insertAfterHead(node3);
    assertEquals(20, linkedList.getHead().getData());
    assertEquals(20, linkedList.deleteAtHead().getData());
    assertEquals(10, linkedList.deleteAfterHead().getData());
    assertEquals(null, linkedList.deleteAfterHead());
    assertEquals(30, linkedList.getHead().getData());
  }
}
