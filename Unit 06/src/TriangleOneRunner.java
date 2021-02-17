//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOneRunner
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main ( String[] args )
	{
		System.out.println("Enter a word :: ");
		String word = keyboard.nextLine();
		TriangleOne test = new TriangleOne(word);
		test.print();
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		test.setWord(word);
		test.print();
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		test.setWord(word);
		test.print();
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		test.setWord(word);
		test.print();
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		test.setWord(word);
		test.print();
		//add test cases		
	}
}