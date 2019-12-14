package com.playground.datastructures;

/**
 * This class contains the implementation for a MaxHeap
 *
 * @author ashish
 * @param <T> The type of the data to be stored in the max heap
 */
public class MaxHeap<T extends Comparable<T>> {
  private T[] elements;
  private int stop;

  /**
   * This constructor is used to initialize the Max Heap
   *
   * @param elements The Elements to initialize the Heap
   */
  public MaxHeap(T[] pElements) {
    this.elements = pElements;
    stop = pElements.length;

    max_heapify();
  }

  /** This method is used to build the initial max heap */
  private void max_heapify() {
    for (int i = stop / 2; i >= 0; i--) {
      heapify(i);
    }
  }

  /**
   * This method is used to build the heap at the given position
   *
   * @param pRootPosition The position to build the heap at
   */
  private void heapify(int pRootPosition) {
    T root = elements[pRootPosition];
    int leftChildPosition = pRootPosition * 2 + 1;
    int rightChildPosition = pRootPosition * 2 + 2;

    T left = null;
    T right = null;

    if (leftChildPosition < stop) {
      left = elements[leftChildPosition];
      if (root.compareTo(left) < 0) {
        T t = elements[leftChildPosition];
        elements[leftChildPosition] = elements[pRootPosition];
        elements[pRootPosition] = t;
        root = elements[pRootPosition];
        heapify(leftChildPosition);
      }
    }
    if (rightChildPosition < stop) {
      right = elements[rightChildPosition];
      if (root.compareTo(right) < 0) {
        T t = elements[rightChildPosition];
        elements[rightChildPosition] = elements[pRootPosition];
        elements[pRootPosition] = t;
        root = elements[pRootPosition];
        heapify(rightChildPosition);
      }
    }
  }

  /**
   * This method is used to pop an element out of the max heap
   *
   * @return current maximum element in the heap
   */
  public T popOut() {
    T maximum = null;
    if (stop > 0) {
      stop--;
      maximum = elements[0];
      T t = elements[stop];
      elements[0] = t;
      elements[stop] = maximum;
      heapify(0);
    }
    return maximum;
  }
}
