package Chap9;
import java.util.*;
public class WordCount {
	private static final char BLANK = ' ';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		int index, wordCount, numberOfCharacters;
		System.out.println("Enter a sentence: ");
		String sentence = scanner.nextLine( );
		numberOfCharacters = sentence.length( );
		index = 0;
		wordCount = 0;
		while ( index < numberOfCharacters ) {
		//ignore blank spaces
		while (index < numberOfCharacters &&
		sentence.charAt(index) == BLANK) {
		index++;
		}
		//now locate the end of the word
		while (index < numberOfCharacters &&
		sentence.charAt(index) != BLANK) {
		index++;
		}
		//another word is found, so increment the counter
		wordCount++;
		}
		
		//display the result
		System.out.println( "\n input sentence: " + sentence );
		System.out.println( " Word count: " + wordCount + " words" );
		}
		
	}


