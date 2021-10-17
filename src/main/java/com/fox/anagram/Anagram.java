package com.fox.anagram;

import java.util.StringJoiner;

public class Anagram {
	
	private static final String SEPARATOR = " ";

	public String permuteWords(String phrase) {
		String[] words = phrase.split(SEPARATOR);
		StringJoiner joiner = new StringJoiner(SEPARATOR);

		for (String word : words) {
			joiner.add(permuteChars(word));
		}

		return joiner.toString();
	}

	private String permuteChars(String word) {
		char[] characters = word.toCharArray();

		for (int i = 0, j = characters.length - 1; i < j;) {

			if (!Character.isAlphabetic(characters[i])) {
				i++;
			} else if (!Character.isAlphabetic(characters[j])) {
				j--;
			} else {
				swapCharacters(i, j, characters);
				i++;
				j--;
			}
		}
		return String.valueOf(characters);
	}

	private void swapCharacters(int i, int j, char[] characters) {
		char temp = characters[i];
		characters[i] = characters[j];
		characters[j] = temp;
	}
}
