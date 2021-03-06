package com.playground.leetcode;

/** This class is used to generate Morse Code for a given String */
class MorseCodeGenerator {
  private static String[] morseCodeConversionTable = {
    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
    "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
  };

  /**
   * This method is used to generate morse code for the given String
   *
   * @param pInput The input String
   * @return Morse Code representation of the String
   */
  public static String generateMorse(String pInput) {
    StringBuilder morseCodeBuilder = new StringBuilder();
    String lowerCaseInput = pInput.toLowerCase();
    for (int i = 0; i < lowerCaseInput.length(); i++) {
      String charMorseCode = getMorseCodeForAlphabet(lowerCaseInput.charAt(i));
      morseCodeBuilder.append(charMorseCode);
    }
    return morseCodeBuilder.toString();
  }

  /**
   * This method is used to generate morse code for the given Character
   *
   * @param pAlphabet The input Character
   * @return Morse Code representation of the Character
   */
  private static String getMorseCodeForAlphabet(char pAlphabet) {
    int index = Character.getNumericValue(pAlphabet) - Character.getNumericValue('a');
    return morseCodeConversionTable[index];
  }
}
