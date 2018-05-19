package com.playground.recursion;

/**
 * This class is used to calculate the factorial for a given number. This output of this class is
 * limited only to the long range. So it cannot support factorials for large numbers.
 */
public class Factorial {
  private Factorial() {}

  /**
   * This method is used to calculate the factorial of a given number
   *
   * @param pNumber The input number
   * @return The factorial of the given number
   */
  public static long factorial(int pNumber) {
    if (pNumber == 0 || pNumber == 1) {
      return 1;
    } else if (pNumber > 1) {
      return pNumber * factorial(pNumber - 1);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
