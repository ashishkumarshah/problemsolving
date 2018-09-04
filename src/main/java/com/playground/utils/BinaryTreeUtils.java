package com.playground.utils;

import com.playground.datastructures.BinaryTree;
import com.playground.datastructures.BinaryTreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * This class has an implementation for common problems related to binary trees
 *
 * @author ashish
 */
public class BinaryTreeUtils {
  /**
   * Function to determine the deepest path of a binary tree
   *
   * @param bt The Binary Tree
   * @return the deepest path in the binary tree
   */
  public static LinkedList<BinaryTreeNode<?>> findDeepestPath(BinaryTree<?> bt) {
    return findDeepestPathInternal(bt.getRoot());
  }

  /**
   * Private Internal Function to find the deepest path of a subtree under a node.
   *
   * @param pNode The node of the tree under which the deepest path has to be found
   * @return The deepest path under the node in the sub tree
   */
  private static LinkedList<BinaryTreeNode<?>> findDeepestPathInternal(BinaryTreeNode<?> pNode) {
    LinkedList<BinaryTreeNode<?>> deepestPath = new LinkedList<BinaryTreeNode<?>>();
    deepestPath.add(pNode);
    LinkedList<BinaryTreeNode<?>> leftDeepestPath = new LinkedList<BinaryTreeNode<?>>();
    if (pNode.getLeft() != null) {
      leftDeepestPath = findDeepestPathInternal(pNode.getLeft());
    }
    LinkedList<BinaryTreeNode<?>> rightDeepestPath = new LinkedList<BinaryTreeNode<?>>();
    if (pNode.getRight() != null) {
      rightDeepestPath = findDeepestPathInternal(pNode.getRight());
    }
    if (leftDeepestPath.size() > rightDeepestPath.size()) {
      deepestPath.addAll(leftDeepestPath);
    } else {
      deepestPath.addAll(rightDeepestPath);
    }
    return deepestPath;
  }

  /**
   * Function to find the depth of the tree
   *
   * @param bt The binary tree
   * @return The depth of the tree
   */
  public static int findMaxDepth(BinaryTree<?> bt) {

    return findMaxDepthInternal(bt.getRoot());
  }

  /**
   * Private function to find the depth corresponding to a node in a binary tree
   *
   * @param pNode The node corresponding to which depth has to be found
   * @return depth relative to the node
   */
  private static int findMaxDepthInternal(BinaryTreeNode<?> pNode) {
    int depth = 0;
    int leftDepth = 0;
    int rightDepth = 0;
    if (pNode.getLeft() != null) {
      leftDepth = findMaxDepthInternal(pNode.getLeft());
      depth = leftDepth;
    }
    if (pNode.getRight() != null) {
      rightDepth = findMaxDepthInternal(pNode.getRight());
      if (depth < rightDepth) {
        depth = rightDepth;
      }
    }
    return depth + 1;
  }

  /**
   * Function to find the maximum element in the binary tree
   *
   * @param bt The binary tree whose maximum value element is to be determined
   * @return Maximum value in the tree
   */
  public static int findMax(BinaryTree<Integer> bt) {
    return findMaxInternal(bt.getRoot());
  }

  /**
   * Function to find the maximum value relative to a given node
   *
   * @param pNode Node relative to which maximum value has to be found
   * @return the maximum value
   */
  private static int findMaxInternal(BinaryTreeNode<Integer> pNode) {
    int maxVal = pNode.getData();
    maxVal = pNode.getData();
    if (pNode.getLeft() != null) {
      int maxValLeft = findMaxInternal(pNode.getLeft());
      maxVal = maxValLeft;
    }
    if (pNode.getRight() != null) {
      int maxValRight = findMaxInternal(pNode.getRight());
      if (maxValRight > maxVal) {
        maxVal = maxValRight;
      }
    }
    return maxVal;
  }

  /**
   * Function to depth first search an element in the binary tree
   *
   * @param pData data to search
   * @return true if present, false if absent
   */
  public static boolean peformDepthFirstSearch(BinaryTree<Integer> bt, int pData) {
    return performDepthFirstSearchInternal(bt.getRoot(), pData);
  }

  /**
   * Private function to perfrom depth first search
   *
   * @param pNode The node under which search has to be performed
   * @param pData data to search
   * @return true if present, false if absent
   */
  private static boolean performDepthFirstSearchInternal(BinaryTreeNode<Integer> pNode, int pData) {
    if (pNode == null) {
      return false;
    }

    if (pNode.getData().equals(pData)) {
      return true;
    } else {
      if (performDepthFirstSearchInternal(pNode.getLeft(), pData)) {
        return true;
      } else if (performDepthFirstSearchInternal(pNode.getRight(), pData)) {
        return true;
      } else {
        return false;
      }
    }
  }

  /**
   * Function to find the sum of leaf nodes in the binary tree.
   *
   * @param bt The binary tree whose sum of leaf nodes is to be found.
   * @return The sum of leaf nodes
   */
  public static int findLeafNodeSum(BinaryTree<Integer> bt) {
    Queue<BinaryTreeNode<Integer>> nodes = new LinkedList<BinaryTreeNode<Integer>>();
    int currentLevelSum = 0;
    // LinkedList<Integer> currentLevelData = new LinkedList<Integer>();
    nodes.add(bt.getRoot());
    nodes.add(null);
    while (!nodes.isEmpty()) {
      BinaryTreeNode<Integer> temp = nodes.remove();
      if (temp == null) {
        if (!nodes.isEmpty()) {
          // switching over to next level
          nodes.add(temp);
          currentLevelSum = 0;
          // currentLevelData.clear();
        } else {
          // No more levels, so not enqueing
        }
      } else {
        currentLevelSum = currentLevelSum + temp.getData();
        // currentLevelData.add(temp.getData());
        if (temp.getLeft() != null) {
          nodes.add(temp.getLeft());
        }
        if (temp.getRight() != null) {
          nodes.add(temp.getRight());
        }
      }
    }
    return currentLevelSum;
  }

  /**
   * Function to perform breadth first search
   *
   * @param bt The binary tree in which the element has to be searched
   * @param pData Data to be searched
   * @return true if found, false if not found
   */
  public static boolean performBreadthFirstSearch(BinaryTree<Integer> bt, Integer pData) {
    Queue<BinaryTreeNode<Integer>> nodes = new LinkedList<BinaryTreeNode<Integer>>();
    nodes.add(bt.getRoot());
    while (!nodes.isEmpty()) {
      BinaryTreeNode<Integer> temp = nodes.remove();
      if (temp.getData() == pData) {
        return true;
      } else {
        if (temp.getLeft() != null) {
          nodes.add(temp.getLeft());
        }
        if (temp.getRight() != null) {
          nodes.add(temp.getRight());
        }
      }
    }
    return false;
  }

  /**
   * Function to find the diameter of a binary tree
   *
   * @param bt The binary tree whose diameter is to be found
   * @return The diameter of the Binary Tree
   */
  public static int findDiameter(BinaryTree<?> bt) {
    return findDiameterInternal(bt.getRoot());
  }

  /**
   * Private Function to determine the diameter at the subtree of a binary tree under a given node
   *
   * @param pNode The node of a Binary Tree
   * @return The dimater of the subtree under the given node
   */
  private static int findDiameterInternal(BinaryTreeNode<?> pNode) {
    int lDepth = 0;
    if (pNode.getLeft() != null) {
      lDepth = findMaxDepthInternal(pNode.getLeft());
    }
    int rDepth = 0;
    if (pNode.getRight() != null) {
      rDepth = findMaxDepthInternal(pNode.getRight());
    }
    int diameterIncludingCurrentNode = 1 + lDepth + rDepth;
    int leftTreeDiameter = 0;
    if (pNode.getLeft() != null) {
      leftTreeDiameter = findDiameterInternal(pNode.getLeft());
    }
    int rightTreeDiameter = 0;
    if (pNode.getRight() != null) {
      rightTreeDiameter = findDiameterInternal(pNode.getRight());
    }
    return Integer.max(
        diameterIncludingCurrentNode, Integer.max(leftTreeDiameter, rightTreeDiameter));
  }
}
