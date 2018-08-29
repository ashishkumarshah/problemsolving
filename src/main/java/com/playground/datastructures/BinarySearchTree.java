package com.playground.datastructures;

/**
 * This class implements the Binary Search Tree data structure
 *
 * @author ashish
 * @param <T> The type of data to be stored in the binary search tree
 */
public class BinarySearchTree<T extends Comparable<T>> {
  private BinaryTreeNode<T> root;

  /**
   * Function to get the root of the binary search tree
   *
   * @return root of the binary search tree
   */
  public BinaryTreeNode<T> getRoot() {
    return root;
  }

  /**
   * Constructor for the binary search tree
   *
   * @param pRootData data to be inserted at the root
   */
  public BinarySearchTree(T pRootData) {
    root = new BinaryTreeNode<T>(pRootData, null, null);
  }

  /**
   * Function to insert data into the binary search tree
   *
   * @param pData data to be inserted
   */
  public void insert(T pData) {
    insertInternal(root, pData);
  }

  /**
   * Internal function to insert data into the binary search tree
   *
   * @param pNode Node under which data is to be inserted
   * @param pData Data to be inserted
   */
  private void insertInternal(BinaryTreeNode<T> pNode, T pData) {
    if (pData.compareTo(pNode.getData()) < 0) {
      if (pNode.getLeft() != null) {
        insertInternal(pNode.getLeft(), pData);
      } else {
        pNode.setLeft(new BinaryTreeNode<T>(pData, null, null));
      }
    } else {
      if (pNode.getRight() != null) {
        insertInternal(pNode.getRight(), pData);
      } else {
        pNode.setRight(new BinaryTreeNode<T>(pData, null, null));
      }
    }
  }
}
