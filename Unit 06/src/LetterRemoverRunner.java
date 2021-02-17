//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		//add test cases	
		System.out.println("Enter a sentence  :: ");
		String sentence = keyboard.nextLine();
		System.out.println("Enter a character to remove :: ");
		char remove = keyboard.nextLine().charAt(0);
		LetterRemover myLetterRemover = new LetterRemover(sentence, remove);
		System.out.println(myLetterRemover.removeLetters());
		
		
		System.out.println("Enter a sentence  :: ");
		sentence = keyboard.nextLine();
		System.out.println("Enter a character to remove :: ");
		remove = keyboard.nextLine().charAt(0);
		myLetterRemover.setRemover(sentence, remove);
		System.out.println(myLetterRemover.removeLetters());
		
		System.out.println("Enter a sentence  :: ");
		sentence = keyboard.nextLine();
		System.out.println("Enter a character to remove :: ");
		remove = keyboard.nextLine().charAt(0);
		myLetterRemover.setRemover(sentence, remove);
		System.out.println(myLetterRemover.removeLetters());
		
		System.out.println("Enter a sentence  :: ");
		sentence = keyboard.nextLine();
		System.out.println("Enter a character to remove :: ");
		remove = keyboard.nextLine().charAt(0);
		myLetterRemover.setRemover(sentence, remove);
		System.out.println(myLetterRemover.removeLetters());	
		
		System.out.println("Enter a sentence  :: ");
		sentence = keyboard.nextLine();
		System.out.println("Enter a character to remove :: ");
		remove = keyboard.nextLine().charAt(0);
		myLetterRemover.setRemover(sentence, remove);
		System.out.println(myLetterRemover.removeLetters());	
	}
}