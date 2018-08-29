package com.playground.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBinarySearchTree {

  @Test
  public void test() {
    BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(0);
    bst.insert(1);
    bst.insert(2);
    assertEquals(new Integer(0), bst.getRoot().getData());
    assertNull(bst.getRoot().getLeft());
    assertNotNull(bst.getRoot().getRight());
    assertEquals(new Integer(1), bst.getRoot().getRight().getData());
    assertNull(bst.getRoot().getRight().getLeft());
    assertNotNull(bst.getRoot().getRight().getRight());
    assertEquals(new Integer(2), bst.getRoot().getRight().getRight().getData());
    bst.insert(-2);
    bst.insert(-1);
    bst.insert(-3);
    assertEquals(new Integer(0), bst.getRoot().getData());
    assertNotNull(bst.getRoot().getRight());
    assertEquals(new Integer(1), bst.getRoot().getRight().getData());
    assertNull(bst.getRoot().getRight().getLeft());
    assertNotNull(bst.getRoot().getRight().getRight());
    assertEquals(new Integer(2), bst.getRoot().getRight().getRight().getData());
    assertNotNull(bst.getRoot().getLeft());
    assertEquals(new Integer(-2), bst.getRoot().getLeft().getData());
    assertNotNull(bst.getRoot().getLeft().getRight());
    assertNotNull(bst.getRoot().getLeft().getLeft());
    assertEquals(new Integer(-1), bst.getRoot().getLeft().getRight().getData());
    assertEquals(new Integer(-3), bst.getRoot().getLeft().getLeft().getData());
  }
}
