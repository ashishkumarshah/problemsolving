package com.playground.datastructures;

/**
 * This class represents the node of a Binary Tree.
 *
 * @author ashish
 */
public class BinaryTreeNode<T> {
  private T data;
  private BinaryTreeNode<T> left;
  private BinaryTreeNode<T> right;

  /**
   * Function to get the data of the node
   *
   * @return data of the node
   */
  public T getData() {
    return data;
  }

  /**
   * Function to set the data of the node
   *
   * @param pData data of the node
   */
  public void setData(T pData) {
    data = pData;
  }

  /**
   * Function to get the left node
   *
   * @return left node
   */
  public BinaryTreeNode<T> getLeft() {
    return left;
  }

  /**
   * Function to set the left node
   *
   * @param pLeft left node
   */
  public void setLeft(BinaryTreeNode<T> pLeft) {
    left = pLeft;
  }

  /**
   * Function to get the right node
   *
   * @return right node
   */
  public BinaryTreeNode<T> getRight() {
    return right;
  }

  /**
   * Function to set the right node
   *
   * @param pRight right node
   */
  public void setRight(BinaryTreeNode<T> pRight) {
    right = pRight;
  }

  /**
   * Constructor for the Binary Tree Node.
   *
   * @param pData Data to initialize the node with
   * @param pRight The right child
   * @param pLeft The left child
   */
  public BinaryTreeNode(T pData, BinaryTreeNode<T> pRight, BinaryTreeNode<T> pLeft) {
    setData(pData);
    setRight(pRight);
    setLeft(pLeft);
  }
}
