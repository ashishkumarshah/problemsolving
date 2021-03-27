package com.playground.datastructures;
/**
 * This class represents the Base Node in Data Structures such as a LinkedList, Double Linked List,
 * Tree etc.
 */
public class BitVector {
  private int capacity;
  private int[] data;
  /**
   * Constructor to create an instance of the node;
   *
   * @param pObject Initial Value of the Object
   */
  BitVector(int capacity) {
    setCapacity(capacity);
    initBitVector(getCapacity());
  }

  public void addInteger(int pVal) {
    int arrayPosition = Math.floorDiv(pVal, 4 * 8);
    int bitPosition = pVal - arrayPosition * 4 * 8;
    setBit(arrayPosition, bitPosition);
  }

  public void removeInteger(int pVal) {
    int arrayPosition = Math.floorDiv(pVal, 4 * 8);
    int bitPosition = pVal - arrayPosition * 4 * 8;
    clearBit(arrayPosition, bitPosition);
  }

  private void setBit(int arrayIndex, int bitIndex) {
    int bitFilter = determineBitFilter(bitIndex);
    data[arrayIndex] = data[arrayIndex] | bitFilter;
  }

  private void clearBit(int arrayIndex, int bitIndex) {
    int bitFilter = ~determineBitFilter(bitIndex);
    data[arrayIndex] = data[arrayIndex] & bitFilter;
  }

  public boolean isPresent(int pVal) {
    int arrayPosition = Math.floorDiv(pVal, 4 * 8);
    int bitPosition = pVal - arrayPosition * 4 * 8;

    int bitFilter = determineBitFilter(bitPosition);
    return ((bitFilter & data[arrayPosition]) != 0x00000000);
  }

  private int determineBitFilter(int bitPosition) {
    int filter = 0x00000000;
    switch (bitPosition) {
      case 0:
        filter = 0x80000000;
        break;
      case 1:
        filter = 0x40000000;
        break;
      case 2:
        filter = 0x20000000;
        break;
      case 3:
        filter = 0x10000000;
        break;
      case 4:
        filter = 0x08000000;
        break;
      case 5:
        filter = 0x04000000;
        break;
      case 6:
        filter = 0x02000000;
        break;
      case 7:
        filter = 0x01000000;
        break;
      case 8:
        filter = 0x00800000;
        break;
      case 9:
        filter = 0x00400000;
        break;
      case 10:
        filter = 0x00200000;
        break;
      case 11:
        filter = 0x00100000;
        break;
      case 12:
        filter = 0x00080000;
        break;
      case 13:
        filter = 0x00040000;
        break;
      case 14:
        filter = 0x00020000;
        break;
      case 15:
        filter = 0x00010000;
        break;
      case 16:
        filter = 0x00008000;
        break;
      case 17:
        filter = 0x00004000;
        break;
      case 18:
        filter = 0x00002000;
        break;
      case 19:
        filter = 0x00001000;
        break;
      case 20:
        filter = 0x00000800;
        break;
      case 21:
        filter = 0x00000400;
        break;
      case 22:
        filter = 0x00000200;
        break;
      case 23:
        filter = 0x00000100;
        break;
      case 24:
        filter = 0x00000080;
        break;
      case 25:
        filter = 0x00000040;
        break;
      case 26:
        filter = 0x00000020;
        break;
      case 27:
        filter = 0x00000010;
        break;
      case 28:
        filter = 0x00000008;
        break;
      case 29:
        filter = 0x00000004;
        break;
      case 30:
        filter = 0x00000002;
        break;
      case 31:
        filter = 0x00000001;
        break;
    }
    return filter;
  }

  /**
   * This function is used to retreive the data from a Node
   *
   * @return The data in the Node
   */
  public int getCapacity() {
    return capacity;
  }
  /**
   * This function is used to set data in a node
   *
   * @param pObject Data to be set in the node
   */
  private void setCapacity(int pCapacity) {
    capacity = pCapacity;
  }

  private void initBitVector(int pCapacity) {
    int arraySize = Math.floorDiv(pCapacity, 4 * 8) + 1;
    data = new int[arraySize];
  }
}
