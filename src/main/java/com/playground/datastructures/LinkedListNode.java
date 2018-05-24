package com.playground.datastructures;
/**
 * This class represents the node of LinkedList. It extends Node to add additional feilds to
 * indicate the next feild.
 */
public class LinkedListNode extends Node {
  private LinkedListNode next;
  /**
   * Constructor to create a linked list node.
   *
   * @param pObject Object to be stored in the node.
   */
  public LinkedListNode(Object pObject) {
    super(pObject);
  }

  /**
   * This function is used to retreive the next feild of a linked list.
   *
   * @return The next node of the current node
   */
  public LinkedListNode getNext() {
    return next;
  }
  /**
   * This function is used to set the next node to the given node.
   *
   * @param pNext The next node to the given node.
   */
  public void setNext(LinkedListNode pNext) {
    next = pNext;
  }
}
