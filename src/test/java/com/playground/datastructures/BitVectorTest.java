package com.playground.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitVectorTest {

  @Test
  public void test() {
    BitVector bv = new BitVector(5000);
    for (int i = 0; i < 5000; i++) {
      assertTrue(!bv.isPresent(i));
      bv.addInteger(i);
      assertTrue(bv.isPresent(i));
      bv.removeInteger(i);
      assertTrue(!bv.isPresent(i));
    }
  }
}
