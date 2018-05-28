package com.playground.datastructures;

public class SortedLinkedListNode {
  private Comparable data;
  private SortedLinkedListNode next;

  public SortedLinkedListNode(Comparable pData) {
    setData(pData);
  }

  public Comparable getData() {
    return data;
  }

  public void setData(Comparable pData) {
    data = pData;
  }

  public SortedLinkedListNode getNext() {
    return next;
  }

  public void setNext(SortedLinkedListNode pNode) {
    next = pNode;
  }
}
