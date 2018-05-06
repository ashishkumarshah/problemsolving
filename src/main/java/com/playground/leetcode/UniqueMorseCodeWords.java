package com.playground.leetcode;
import java.util.*;
/**
* Please refer  the <a href="https://leetcode.com/problems/unique-morse-code-words/description/">leetcode problem statement</a>.
* This class is used to calculate the number of unique morse code representations of a given array of words.
*
* @author  Ashish Kumar Shah
*/
public class UniqueMorseCodeWords {
  private UniqueMorseCodeWords () {
  }
  /**
  * This class is used to generate Morse Code for a given String
  */
  private static class MorseCodeGenerator {
    private static String[] morseCodeConversionTable = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    /**
    * This method is used to generate morse code for the given String
    * @param input The input String
    * @return Morse Code representation of the String
    */
    public static String generateMorse (String input) {
      StringBuilder morseCodeBuilder = new StringBuilder();
      String lowerCaseInput = input.toLowerCase();
      for (int i =0; i< lowerCaseInput.length(); i++) {
        String charMorseCode = getMorseCodeForAlphabet(lowerCaseInput.charAt(i));
        morseCodeBuilder.append(charMorseCode);
      }
      return morseCodeBuilder.toString();
    }
    /**
    * This method is used to generate morse code for the given Character
    * @param c The input Character
    * @return Morse Code representation of the Character
    */
    private static String getMorseCodeForAlphabet (char c) {
      int index = Character.getNumericValue(c) - Character.getNumericValue('a');
      return morseCodeConversionTable[index];
    }
  }
  /**
  * This method is used to retreive the unique morse code representations for the given
  * array of strings.
  * @param words Array of words
  * @return unique count of the morse code representations.
  */
  public static int getUniqueMorseCodeCount (String[] words) {
    HashSet<String> morseCodes = new HashSet<String>();
    for(String s : words) {
      String morseCode = MorseCodeGenerator.generateMorse(s);
      morseCodes.add(morseCode);
    }
    return morseCodes.size();
  }
}
