package com.playground.datastructures;
/**
 * This class represent a node in a sorted linked list. This class requires that the data in the
 * node implements the comparable interface to ensure ordering.
 */
public class SortedLinkedListNode {
  private Comparable data;
  private SortedLinkedListNode next;
  /**
   * This method is the constructor
   *
   * @param pData Data to be added part of the node
   */
  public SortedLinkedListNode(Comparable pData) {
    setData(pData);
  }
  /**
   * This method is used to get the data in the node.
   *
   * @return Data in the node
   */
  public Comparable getData() {
    return data;
  }
  /**
   * This method is used to set the data in the node.
   *
   * @param pData Data in the node
   */
  public void setData(Comparable pData) {
    data = pData;
  }
  /**
   * This method is used to get the next node
   *
   * @return The next node
   */
  public SortedLinkedListNode getNext() {
    return next;
  }
  /**
   * This function is used to set the next node.
   *
   * @param pNode The next node.
   */
  public void setNext(SortedLinkedListNode pNode) {
    next = pNode;
  }
}
