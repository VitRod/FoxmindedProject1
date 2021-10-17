package com.fox.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnagramTest {

	Anagram anagram;

	@BeforeEach
	public void setUp() {
		anagram = new Anagram();
	}

	@Test
	@DisplayName("Permutation of letters")
	void givenLetters_whenPermuteWords_thenLettersReversed() {
		String input = "abcd efgh";
		String expected = "dcba hgfe";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Permutation of letters, numbers & symbols")
	void givenWordsWithLettersNumsSymbols_whenPermuteWords_thenLettersReversedButNotNumsOrSymbols() {
		String input = "a1bcd efg!h";
		String expected = "d1cba hgf!e";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Reversing a single  word")
	void givenSingleWord_whenPermuteWords_thenSingleWordReversed() {
		String input = "abc!d";
		String expected = "dcb!a";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("To test method remaining symbol unchanged")
	void givenNumsWithSymbol_whenPermuteWords_thenNumsAndSymbolRemainUnchanged() {
		String input = "01234!";
		String expected = "01234!";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("To test when input is null")
	void givenNull_whenPermuteWords_thenNullPointerException() {
		assertThrows(NullPointerException.class, () -> {
			anagram.permuteWords(null);
		});
	}

	@Test
	@DisplayName("To test  when spaces  remain unchanged")
	void givenSpaceOrSpaces_whenPermuteWords_thenSpacesRemainUnchanged() {
		String input = " ";
		String expected = "";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);

		input = "          ";
		expected = "";
		actual = anagram.permuteWords(input);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("To test when input is empty text")
	void givenEmptyText_whenPermuteWords_thenEmptyText() {
		String input = "";
		String expected = "";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("To test when input is  numbers")
	void givenNums_whenPermuteWords_thenNumsUnchanged() {
		String input = "1234 5678";
		String expected = "1234 5678";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("To test when input is  symbols")
	void givenSymbols_whenPermuteWords_thenSymbolsUnchanged() {
		String input = "!>. /$";
		String expected = "!>. /$";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("To test when input is letters and numbers")
	void givenLettersWithNums_whenPermuteWords_thenLettersReversedButNotNums() {
		String input = "b3eing happ2y";
		String expected = "g3nieb yppa2h";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("To test when input is letters and symbols")
	void givenLettersWithSymbols_whenPermuteWords_thenLettersReversedButNotSymbols() {
		String input = "bein!g ha$ppy";
		String expected = "gnie!b yp$pah";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("To test when input is numbers and symbols")
	void givenNumsWithSymbols_whenPermuteWords_thenNumsSymbolsUnchanged() {
		String input = "76543! /?.<";
		String expected = "76543! /?.<";
		String actual = anagram.permuteWords(input);
		assertEquals(expected, actual);
	}

}
