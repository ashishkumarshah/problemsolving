package com.playground.datastructures;

/** This class has an implementation of a circular queue. */
public class CircularQueue {
  private int rear;
  private int front;
  private int[] elements;
  private int capacity;

  /**
   * Constructor for Circular Queue
   *
   * @param pCapacity Capacity of the Queue
   */
  public CircularQueue(int pCapacity) {
    capacity = pCapacity;
    rear = front = -1;
    elements = new int[capacity];
  }

  /**
   * This function is used to check if the queue is full
   *
   * @return true if the queue is full, false otherwise
   */
  private boolean isFull() {
    if (front == 0 && rear == capacity - 1) {
      return true;
    }
    if (front == rear + 1) {
      return true;
    }
    return false;
  }

  /**
   * This function is used to check if the queue is empty
   *
   * @return true if the queue is empty, false otherwise
   */
  private boolean isEmpty() {
    if (front == -1) {
      return true;
    }
    return false;
  }

  /**
   * This function is used to enqueue an element in the queue.
   *
   * @param pElement The Element to be queued
   * @throws QueueOverflowException QueueOverflowException if the queue is full
   */
  public void enqueue(int pElement) throws QueueOverflowException {
    // check for front overwrite
    if (isFull()) {
      throw new QueueOverflowException();
    }
    if (front == -1) front = 0;
    rear = (rear + 1) % capacity;
    elements[rear] = pElement;
  }

  /**
   * This function is used to deQueue an element from the queue
   *
   * @return The dequeued element
   * @throws EmptyQueueException EmptyQueueException if the queue is empty
   */
  public int deQueue() throws EmptyQueueException {
    int element = 0;
    if (isEmpty()) {
      throw new EmptyQueueException();
    } else {
      element = elements[front];
      if (front == rear) {
        front = rear = -1;
      } else {
        front = (front + 1) % capacity;
      }
    }
    return element;
  }
}
