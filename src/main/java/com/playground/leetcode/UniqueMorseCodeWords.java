package com.playground.leetcode;

import java.util.*;

/**
 * Please refer the <a href=
 * "https://leetcode.com/problems/unique-morse-code-words/description/">leetcode problem
 * statement</a>. This class is used to calculate the number of unique morse code representations of
 * a given array of words.
 *
 * @author Ashish Kumar Shah
 */
public class UniqueMorseCodeWords {
  private UniqueMorseCodeWords() {}

  /**
   * This method is used to retreive the unique morse code representations for the given array of
   * strings.
   *
   * @param pWords Array of words
   * @return unique count of the morse code representations.
   */
  public static int getUniqueMorseCodeCount(String[] pWords) {
    HashSet<String> morseCodes = new HashSet<String>();
    for (String s : pWords) {
      String morseCode = MorseCodeGenerator.generateMorse(s);
      morseCodes.add(morseCode);
    }
    return morseCodes.size();
  }
}
