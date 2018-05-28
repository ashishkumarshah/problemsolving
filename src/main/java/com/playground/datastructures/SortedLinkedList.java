package com.playground.datastructures;
/**
 * This class has an implementation of a sorted linked list. The sorted linked list maintains its
 * elements in a sorted order.
 */
public class SortedLinkedList {
  private SortedLinkedListNode head;
  /**
   * This function is used to get the head of a linked list.
   *
   * @return The head of the sorted linked list.
   */
  public SortedLinkedListNode getHead() {
    return head;
  }
  /**
   * This function is used to insert data into the sorted linked list
   *
   * @param pNode The node containing data which is to be inserted.
   */
  public void insert(SortedLinkedListNode pNode) {
    SortedLinkedListNode current = head;
    SortedLinkedListNode previous = null;
    while (current != null) {
      int relativePosition = current.getData().compareTo(pNode.getData());
      if (relativePosition >= 0) {
        break;
      } else {
        previous = current;
        current = current.getNext();
      }
    }
    inserAfter(previous, pNode);
  }
  /**
   * This function is used to insert data into a sorted linked list after a specific node. It is
   * assumed that the previous node being passed here as an argument has data whose value is lesser
   * than the node.
   *
   * @param pPreviousNode The node after which the data containing node is to be inserted.
   * @param pNode The data containing node which is to be inserted.
   */
  private void inserAfter(SortedLinkedListNode pPreviousNode, SortedLinkedListNode pNode) {
    if (pPreviousNode == null) {
      if (head != null) {
        pNode.setNext(head);
      }
      head = pNode;
    } else {
      pNode.setNext(pPreviousNode.getNext());
      pPreviousNode.setNext(pNode);
    }
  }
}
