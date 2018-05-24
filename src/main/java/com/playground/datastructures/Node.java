package com.playground.datastructures;
/**
 * This class represents the Base Node in Data Structures such as a LinkedList, Double Linked List,
 * Tree etc.
 */
public class Node {
  private Object data;
  /**
   * Constructor to create an instance of the node;
   *
   * @param pObject Initial Value of the Object
   */
  Node(Object pObject) {
    setData(pObject);
  }
  /**
   * This function is used to retreive the data from a Node
   *
   * @return The data in the Node
   */
  public Object getData() {
    return data;
  }
  /**
   * This function is used to set data in a node
   *
   * @param pObject Data to be set in the node
   */
  public void setData(Object pObject) {
    data = pObject;
  }
}
