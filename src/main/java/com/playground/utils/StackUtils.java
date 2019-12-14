package com.playground.utils;

import java.util.Stack;

/**
 * This class has methods which solve common problems on stack.
 *
 * @author ashish
 */
public class StackUtils {
  /**
   * Function to reverse a stack
   *
   * @param stack The stack to reverse
   */
  @SuppressWarnings("rawtypes")
  public static void reverseStack(Stack stack) {
    if (!stack.isEmpty()) {
      Object topElement = stack.pop();
      reverseStack(stack);
      insertAtBottom(stack, topElement);
    }
  }

  /**
   * Function to insert an element at the bottom of the stack
   *
   * @param stack The stack in which an element has to be inserted at bottom
   * @param topElement The element to be inserted at bottom
   */
  @SuppressWarnings({"rawtypes", "unchecked"})
  public static void insertAtBottom(Stack stack, Object topElement) {
    if (stack.isEmpty()) {
      stack.push(topElement);
      return;
    } else {
      Object tos = stack.pop();
      insertAtBottom(stack, topElement);
      stack.push(tos);
    }
  }

  public static void sortStack(Stack<Integer> stack) {
    if (!stack.isEmpty()) {
      Integer top = stack.pop();
      sortStack(stack);
      insertElementIntoSortedStack(stack, top);
    }
  }

  /**
   * Function to insert an element into a sorted stack
   *
   * @param stack
   * @param top
   */
  private static void insertElementIntoSortedStack(Stack<Integer> stack, Integer pElement) {
    if (stack.isEmpty()) {
      stack.push(pElement);
    } else {
      // If element to be inserted is greater than top of stack, push it to top of stack.
      if (stack.peek().compareTo(pElement) < 0) {
        stack.push(pElement);
      } else {
        // Now the element to be inserted is greater than the top, it will still have to be top
        // So pop, insert the element into the rest of the stack.
        Integer top = stack.pop();
        insertElementIntoSortedStack(stack, pElement);
        // Restore back the top
        stack.push(top);
      }
    }
  }

  /**
   * Function to determine the stock span
   *
   * @param closingStockPrices an array containing the closing stock prices
   * @return array containing span values for the corresponding days
   */
  public static int[] getStockSpan(int[] closingStockPrices) {
    Stack<Integer> higherPriceIndices = new Stack<Integer>();
    int[] stockSpan = new int[closingStockPrices.length];
    higherPriceIndices.push(0);
    stockSpan[0] = 1;
    for (int i = 1; i < closingStockPrices.length; i++) {
      // pop out until, the top refers to an index, whose price is greater than the current stock
      // price
      while (!higherPriceIndices.empty()
          && closingStockPrices[higherPriceIndices.peek()] <= closingStockPrices[i])
        higherPriceIndices.pop();

      // If stack becomes empty, then price[i] is greater than all elements
      // on left of it, i.e., price[0], price[1],..price[i-1]. Else price[i]
      // is greater than elements after top of stack
      stockSpan[i] = (higherPriceIndices.empty()) ? (i + 1) : (i - higherPriceIndices.peek());

      // Push this element to stack
      higherPriceIndices.push(i);
    }
    return stockSpan;
  }
}
