package com.fox.anagram;

import java.util.Scanner;

/** Task 1
 * Write an application that reverses all the words of input text:

	  E.g. "abcd efgh" => "dcba hgfe"

	All non-letter symbols should stay on the same places:

	  E.g. "a1bcd efg!h" => "d1cba hgf!e"

	Use Latin alphabet for test only.
	
	Task 2
	Write JUnit tests for the previous application.

	JUnit 5 should be used.

	In the future, all tasks are done with the Unit tests
	
	Task 3
	Convert your previous project to a maven project. 

	Add Sonar lint plugin support to your IDE.

	Add Editorconfig support to your project.

	In the future, all java projects should be created as maven projects. 
	Every time before you a create merge request you should check your code with Sonar Lint. 
	It won’t show all the problems but it can check a lot.
	
*/

public class Main {

	public static void main(String[] args) {
		 Scanner scannerInput = new Scanner(System.in);
		 System.out.println("Enter some string: ");
		 String text = scannerInput.nextLine();
		 
		 Anagram anagram = new Anagram();
		 String result = anagram.permuteWords(text);
		 System.out.println(result);
	}
}
