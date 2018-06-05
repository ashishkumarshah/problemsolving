package com.playground.datastructures;
/** This class implements the Stack Datastructure */
public class Stack {
  private LinkedList linkedList;
  /** Constructor to create the Stack Object */
  Stack() {
    linkedList = new LinkedList();
  }
  /**
   * Function to push an object into the Stack
   *
   * @param pObject The object to be pushed into the Stack
   */
  public void push(Object pObject) {
    LinkedListNode node = new LinkedListNode(pObject);
    linkedList.insertBeforeHead(node);
  }
  /**
   * Function to pop an object from the Stack
   *
   * @return The popped object from the Stack.
   */
  public Object pop() {
    LinkedListNode poppedNode = linkedList.deleteAtHead();
    Object retval = null;
    if (poppedNode != null) {
      retval = poppedNode.getData();
    }
    return retval;
  }

  /**
   * Function to peek into the Stack
   *
   * @return The top of the Stack
   */
  public Object peek() {
    LinkedListNode top = linkedList.getHead();
    Object topValue = null;
    if (top != null) {
      topValue = top.getData();
    }
    return topValue;
  }
}
