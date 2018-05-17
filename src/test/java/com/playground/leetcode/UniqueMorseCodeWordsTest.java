package com.playground.leetcode;

import com.playground.leetcode.UniqueMorseCodeWords;

import org.junit.Test;
import static org.junit.Assert.*;

public class UniqueMorseCodeWordsTest {
	@Test
	public void testUniqueMorseCodeWords() {
		String[] input1 = { "gin", "zen", "gig", "msg" };
		assertEquals(UniqueMorseCodeWords.getUniqueMorseCodeCount(input1), 2);
	}
}
