package com.playground.utils;

import com.playground.datastructures.LinkedList;
import com.playground.datastructures.LinkedListNode;

public class LinkedListUtils {

  public static boolean detectLoop(LinkedList pLinkedList) {
    LinkedListNode slow = pLinkedList.getHead();
    LinkedListNode fast = pLinkedList.getHead();

    do {
      if (slow == null || fast == null) {
        return false;
      }
      fast = fast.getNext();
      if (fast == null) {
        return false;
      }
      slow = slow.getNext();
      fast = fast.getNext();
    } while (slow != fast);
    return true;
  }
}
