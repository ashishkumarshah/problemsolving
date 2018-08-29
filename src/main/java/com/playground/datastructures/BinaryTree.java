package com.playground.datastructures;

public class BinaryTree<T extends Comparable<T>> {
  private BinaryTreeNode<T> root;

  /**
   * Constructor for the Binary Tree
   *
   * @param pRoot of the Binary Tree
   */
  public BinaryTree(T pRootElementData) {
    setRoot(new BinaryTreeNode<T>(pRootElementData, null, null));
  }

  /**
   * Function to get the root of the binary tree
   *
   * @return root of the tree
   */
  public BinaryTreeNode<T> getRoot() {
    return root;
  }

  /**
   * Function to set the root of the binary tree
   *
   * @param root Root of the binary tree
   */
  public void setRoot(BinaryTreeNode<T> pRoot) {
    root = pRoot;
  }
}
