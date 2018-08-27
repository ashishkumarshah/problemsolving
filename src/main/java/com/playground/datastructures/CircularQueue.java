package com.playground.datastructures;

/** This class has an implementation of a circular queue. */
public class CircularQueue {
  private int rear;
  private int front;
  private Object[] elements;
  private int capacity;

  /**
   * Constructor for Circular Queue
   *
   * @param pCapacity Capacity of the Queue
   */
  public CircularQueue(int pCapacity) {
    capacity = pCapacity;
    rear = front = -1;
    elements = new Object[capacity];
  }

  /**
   * This function is used to check if the queue is full
   *
   * @return true if the queue is full, false otherwise
   */
  private boolean isFull() {
    return ((front == 0 && rear == capacity - 1) || (front == rear + 1));
  }

  /**
   * This function is used to check if the queue is empty
   *
   * @return true if the queue is empty, false otherwise
   */
  public boolean isEmpty() {
    return (front == -1);
  }

  /**
   * This function is used to enqueue an element in the queue.
   *
   * @param pElement The Element to be queued
   * @throws QueueOverflowException QueueOverflowException if the queue is full
   */
  public void enqueue(Object pElement) throws QueueOverflowException {
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
  public Object deQueue() throws EmptyQueueException {
    Object element = 0;
    if (isEmpty()) {
      throw new EmptyQueueException();
    } else {
      element = elements[front];
      // time to adjust the front
      // also we may have to adjust rear, if we are dequeueing the only element in the queue.
      if (front == rear) {
        // This is the scenario where we have only one element in the queue and we are dequeueing
        // the only element, so time to reset the queue.
        front = rear = -1;
      } else {
        front = (front + 1) % capacity;
      }
    }
    return element;
  }
}
