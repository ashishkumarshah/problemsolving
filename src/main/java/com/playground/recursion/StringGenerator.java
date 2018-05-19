package com.playground.recursion;

/** This class is used to generate different types of strings */
public class StringGenerator {
  /**
   * This function is used to generate all the binary strings for a given length.
   *
   * @param pLength The number of bits for which we want to generate strings
   * @return Array of Strings containing the binary strings of the given length
   */
  public static String[] generateBinaryStrings(int pLength) {
    if (pLength <= 0) return new String[] {};
    else if (pLength == 1) return new String[] {"0", "1"};
    String[] previous = generateBinaryStrings(pLength - 1);
    String[] result = new String[previous.length * 2];
    for (int i = 0; i < previous.length; i++) {
      result[i] = "0" + previous[i];
      result[previous.length + i] = "1" + previous[i];
    }
    return result;
  }

  /**
   * This function is used to generate the possible permutations strings of a given length for a
   * given string.
   *
   * @param pString The String whose permutations have to be generated
   * @param pLength The length of the permutation strings to be generated
   * @return Array of Permutation Strings
   */
  public static String[] generatePermutations(String pString, int pLength) {
    return null;
  }
}
