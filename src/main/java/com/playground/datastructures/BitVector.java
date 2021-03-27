package com.playground.datastructures;
/** This class represents the BitVector data structure */
public class BitVector {
  private int capacity;
  private int[] data;
  /**
   * Constructor to create an instance of the bit vector;
   *
   * @param capacity Capacity of the Bit Map
   */
  BitVector(int capacity) {
    setCapacity(capacity);
    initBitVector(getCapacity());
  }

  /**
   * Function to add an integer to the bit vector
   *
   * @param pVal Integer to add to the bit vector
   */
  public void addInteger(int pVal) {
    int arrayPosition = Math.floorDiv(pVal, 4 * 8);
    int bitPosition = pVal - arrayPosition * 4 * 8;
    setBit(arrayPosition, bitPosition);
  }

  /**
   * Function to remove an integer from the bit vector
   *
   * @param pVal Integer to remove from the bit vector
   */
  public void removeInteger(int pVal) {
    int arrayPosition = Math.floorDiv(pVal, 4 * 8);
    int bitPosition = pVal - arrayPosition * 4 * 8;
    clearBit(arrayPosition, bitPosition);
  }

  /**
   * Function to set the bit at a given position in the index at the array position
   *
   * @param arrayIndex index in the array
   * @param bitIndex bit position to set in the integer
   */
  private void setBit(int arrayIndex, int bitIndex) {
    int bitFilter = determineBitFilter(bitIndex);
    data[arrayIndex] = data[arrayIndex] | bitFilter;
  }

  /**
   * Function to clear the bit at a given position in the index at the array position
   *
   * @param arrayIndex index in the array
   * @param bitIndex bit position to clear in the integer
   */
  private void clearBit(int arrayIndex, int bitIndex) {
    int bitFilter = ~determineBitFilter(bitIndex);
    data[arrayIndex] = data[arrayIndex] & bitFilter;
  }

  /**
   * Function to determine if an integer is present in the bit vector
   *
   * @param pVal Value to check in the bit vector
   * @return true if the number is present in the bit vector, false otherwise
   */
  public boolean isPresent(int pVal) {
    int arrayPosition = Math.floorDiv(pVal, 4 * 8);
    int bitPosition = pVal - arrayPosition * 4 * 8;

    int bitFilter = determineBitFilter(bitPosition);
    return ((bitFilter & data[arrayPosition]) != 0x00000000);
  }

  /**
   * Function to return the bit filter representing an integer which has a set bit only at the bit
   * postion
   *
   * @param bitPosition position in the filter which has to be set
   * @return The bit filter
   */
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
   * This function is used to retreive the capacity of the bit vector
   *
   * @return The capacity of the bit vector
   */
  public int getCapacity() {
    return capacity;
  }

  /**
   * This function is used to set capacity of the bit vector
   *
   * @param pCapacity Capacity of the bit vector
   */
  private void setCapacity(int pCapacity) {
    capacity = pCapacity;
  }

  /**
   * Function to initialise the bit vector
   *
   * @param pCapacity Capacity of the bit vector
   */
  private void initBitVector(int pCapacity) {
    int arraySize = Math.floorDiv(pCapacity, 4 * 8) + 1;
    data = new int[arraySize];
  }
}
