package com.playground.utils;

import static org.junit.Assert.*;

import com.playground.datastructures.BinaryTree;
import com.playground.datastructures.BinaryTreeNode;
import org.junit.Test;

public class BinaryTreeUtilsTest {

  @Test
  public void test1() {
    BinaryTree<Integer> bt = new BinaryTree<Integer>(11);
    BinaryTreeNode<Integer> root = bt.getRoot();
    root.setLeft(new BinaryTreeNode<Integer>(12, null, null));
    root.setRight(new BinaryTreeNode<Integer>(13, null, null));
    root.getLeft().setLeft(new BinaryTreeNode<Integer>(14, null, null));
    root.getLeft().setRight(new BinaryTreeNode<Integer>(15, null, null));
    root.getRight().setLeft(new BinaryTreeNode<Integer>(16, null, null));
    root.getRight().setRight(new BinaryTreeNode<Integer>(17, null, null));
    assertEquals(BinaryTreeUtils.findMaxDepth(bt), 3);
    root.getRight().getRight().setRight(new BinaryTreeNode<Integer>(17, null, null));
    assertEquals(BinaryTreeUtils.findMaxDepth(bt), 4);
    root.getRight().getRight().getRight().setLeft(new BinaryTreeNode<Integer>(17, null, null));
    assertEquals(BinaryTreeUtils.findMaxDepth(bt), 5);
  }

  @Test
  public void test() {
    BinaryTree<Integer> bt = new BinaryTree<Integer>(11);
    assertEquals(11, BinaryTreeUtils.findMax(bt));
    BinaryTreeNode<Integer> root = bt.getRoot();
    root.setLeft(new BinaryTreeNode<Integer>(12, null, null));
    assertEquals(12, BinaryTreeUtils.findMax(bt));
    root.setRight(new BinaryTreeNode<Integer>(13, null, null));
    assertEquals(13, BinaryTreeUtils.findMax(bt));
    root.getLeft().setLeft(new BinaryTreeNode<Integer>(14, null, null));
    assertEquals(14, BinaryTreeUtils.findMax(bt));
    root.getLeft().setRight(new BinaryTreeNode<Integer>(15, null, null));
    assertEquals(15, BinaryTreeUtils.findMax(bt));
    root.getRight().setLeft(new BinaryTreeNode<Integer>(16, null, null));
    assertEquals(16, BinaryTreeUtils.findMax(bt));
    root.getRight().setRight(new BinaryTreeNode<Integer>(17, null, null));
    assertEquals(17, BinaryTreeUtils.findMax(bt));
    assertTrue(BinaryTreeUtils.peformDepthFirstSearch(bt, 11));
    assertTrue(BinaryTreeUtils.peformDepthFirstSearch(bt, 12));
    assertTrue(BinaryTreeUtils.peformDepthFirstSearch(bt, 13));
    assertTrue(BinaryTreeUtils.peformDepthFirstSearch(bt, 14));
    assertTrue(BinaryTreeUtils.peformDepthFirstSearch(bt, 15));
    assertTrue(BinaryTreeUtils.peformDepthFirstSearch(bt, 16));
    assertTrue(BinaryTreeUtils.peformDepthFirstSearch(bt, 17));
    assertFalse(BinaryTreeUtils.peformDepthFirstSearch(bt, 10));
  }

  @Test
  public void testLeafNodesSum() {
    BinaryTree<Integer> bt = new BinaryTree<Integer>(11);
    BinaryTreeNode<Integer> root = bt.getRoot();
    root.setLeft(new BinaryTreeNode<Integer>(12, null, null));
    root.setRight(new BinaryTreeNode<Integer>(13, null, null));
    root.getLeft().setLeft(new BinaryTreeNode<Integer>(14, null, null));
    root.getLeft().setRight(new BinaryTreeNode<Integer>(15, null, null));
    root.getRight().setLeft(new BinaryTreeNode<Integer>(16, null, null));
    root.getRight().setRight(new BinaryTreeNode<Integer>(17, null, null));
    assertEquals(62, BinaryTreeUtils.leafNodeSum(bt));
    root.getRight().getRight().setRight(new BinaryTreeNode<Integer>(18, null, null));
    assertEquals(18, BinaryTreeUtils.leafNodeSum(bt));
  }

  @Test
  public void testBFS() {
    BinaryTree<Integer> bt = new BinaryTree<Integer>(11);
    BinaryTreeNode<Integer> root = bt.getRoot();
    root.setLeft(new BinaryTreeNode<Integer>(12, null, null));
    root.setRight(new BinaryTreeNode<Integer>(13, null, null));
    root.getLeft().setLeft(new BinaryTreeNode<Integer>(14, null, null));
    root.getLeft().setRight(new BinaryTreeNode<Integer>(15, null, null));
    root.getRight().setLeft(new BinaryTreeNode<Integer>(16, null, null));
    root.getRight().setRight(new BinaryTreeNode<Integer>(17, null, null));
    root.getRight().getRight().setRight(new BinaryTreeNode<Integer>(18, null, null));
    assertTrue(BinaryTreeUtils.performBreadthFirstSearch(bt, 11));
    assertTrue(BinaryTreeUtils.performBreadthFirstSearch(bt, 12));
    assertTrue(BinaryTreeUtils.performBreadthFirstSearch(bt, 13));
    assertTrue(BinaryTreeUtils.performBreadthFirstSearch(bt, 14));
    assertTrue(BinaryTreeUtils.performBreadthFirstSearch(bt, 15));
    assertTrue(BinaryTreeUtils.performBreadthFirstSearch(bt, 16));
    assertTrue(BinaryTreeUtils.performBreadthFirstSearch(bt, 17));
    assertTrue(BinaryTreeUtils.performBreadthFirstSearch(bt, 18));
    assertFalse(BinaryTreeUtils.performBreadthFirstSearch(bt, 1));
    assertFalse(BinaryTreeUtils.performBreadthFirstSearch(bt, 2));
  }

  @Test
  public void testDiameter() {
    BinaryTree<Integer> bt = new BinaryTree<Integer>(11);
    BinaryTreeNode<Integer> root = bt.getRoot();
    root.setLeft(new BinaryTreeNode<Integer>(12, null, null));
    root.setRight(new BinaryTreeNode<Integer>(13, null, null));
    root.getLeft().setLeft(new BinaryTreeNode<Integer>(14, null, null));
    root.getLeft().setRight(new BinaryTreeNode<Integer>(15, null, null));
    root.getRight().setLeft(new BinaryTreeNode<Integer>(16, null, null));
    root.getRight().setRight(new BinaryTreeNode<Integer>(17, null, null));
    root.getRight().getRight().setRight(new BinaryTreeNode<Integer>(18, null, null));
    assertEquals(6, BinaryTreeUtils.findDiameter(bt));
  }
}
