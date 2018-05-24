/** This class has an implementation of the Linked List data structure. */
package com.playground.datastructures;

public class LinkedList {
  private LinkedListNode head;

  LinkedList() {}
  /**
   * This function is used to set the head of a linked list
   *
   * @param pHead Head of the linked list.
   */
  public void setHead(LinkedListNode pHead) {
    head = pHead;
  }
  /**
   * This function is used to get the head of the linked list.
   *
   * @return The head of the linked list
   */
  public LinkedListNode getHead() {
    return head;
  }

  /**
   * This function is used to add a node before the current head.
   *
   * @param pNode The node to add.
   */
  public void insertBeforeHead(LinkedListNode pNode) {
    if (pNode != null) {
      pNode.setNext(head);
      setHead(pNode);
    }
  }
  /**
   * This function is used to add a node after the current head.
   *
   * @param pNode The node to add.
   */
  public void insertAfterHead(LinkedListNode pNode) {
    if (pNode != null) {
      if (head != null) {
        pNode.setNext(head.getNext());
        head.setNext(pNode);
      } else {
        head = pNode;
      }
    }
  }
  /**
   * This function is used to delete the node after the head in the linked list.
   *
   * @return The deleted node from the linked list
   */
  public LinkedListNode deleteAfterHead() {
    LinkedListNode deletedNode = null;
    if (head != null) {
      deletedNode = head.getNext();
      if (deletedNode != null) {
        head.setNext(deletedNode.getNext());
      }
    }
    return deletedNode;
  }
  /**
   * This function is used to delete the node at the head and re-assign a head node if possible.
   *
   * @return The deleted node from the Linked List
   */
  public LinkedListNode deleteAtHead() {
    LinkedListNode deletedNode = null;
    if (head != null) {
      deletedNode = head;
      LinkedListNode newHead = null;
      if (head.getNext() != null) {
        newHead = head.getNext();
      }
      setHead(newHead);
    }
    return deletedNode;
  }
}
