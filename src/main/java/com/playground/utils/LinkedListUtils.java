package com.playground.utils;

import com.playground.datastructures.LinkedList;
import com.playground.datastructures.LinkedListNode;
/** This class contains utility functions for a linked list data structure */
public class LinkedListUtils {
  /**
   * This function is used to detect a loop in a given linked LinkedList
   *
   * @param pLinkedList Input Linked list
   * @return true if there is a loop, false if there is no loop
   */
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

  /**
   * This function is used to find the length of a linked list
   *
   * @param pLinkedList The LinkedList whose length is to be found.
   * @return The length of the linked list
   */
  public static int findLength(LinkedList pLinkedList) {
    int length = 0;
    if (pLinkedList != null) {
      for (LinkedListNode current = pLinkedList.getHead();
          current != null;
          current = current.getNext(), length++) {}
    }
    return length;
  }

  /**
   * This function is used to reverse a linked list
   *
   * @param pLinkedList The linked list to reverse
   */
  public static void reverse(LinkedList pLinkedList) {
    LinkedListNode first = pLinkedList.getHead();
    if (first.getNext() != null) {
      LinkedList rest = new LinkedList();
      rest.setHead(first.getNext());
      reverse(rest);
      pLinkedList.setHead(rest.getHead());
      first.getNext().setNext(first);
      first.setNext(null);
    } else {
      return;
    }
  }
  /**
   * This function is used to print a linked list
   *
   * @param linkedList The linked list to print
   */
  public static void printList(LinkedList linkedList) {
    LinkedListNode current = linkedList.getHead();
    do {
      System.out.print(current.getData() + "-->");
      current = current.getNext();
    } while (current != null);
    System.out.println("null");
  }
  /**
   * This function is used to count the occurences of a given element in the linked list
   *
   * @param pLinkedList The linked list
   * @param pElement The element whose count is needed
   * @return occurence count of the given element
   */
  public static int getOccurenceCount(LinkedList pLinkedList, Object pElement) {
    int occurenceCount = 0;
    for (LinkedListNode current = pLinkedList.getHead();
        current != null;
        current = current.getNext()) {
      if (current.getData().equals(pElement)) occurenceCount++;
    }
    return occurenceCount;
  }
  /**
   * This function is used to find the middle of a linked list.
   *
   * @param linkedList The linked list, whose middle element is to be found.
   * @return The middle element of the linked list.
   */
  public static LinkedListNode getMiddleElement(LinkedList linkedList) {
    LinkedListNode middle = linkedList.getHead();
    LinkedListNode last = linkedList.getHead();
    while (last != null) {
      last = last.getNext();
      if (last != null) {
        last = last.getNext();
        middle = middle.getNext();
      }
    }
    return middle;
  }
}
