//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner; 


public class PerfectRunner
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main( String args[] )
	{
		System.out.println("Enter a number :: ");
		int number = keyboard.nextInt();
		Perfect test = new Perfect(number);
		//add test cases
		System.out.println(test);		
		
		System.out.println("Enter a number :: ");
		number = keyboard.nextInt();
		test.setNum(number);
		//add test cases
		System.out.println(test);	
		
		System.out.println("Enter a number :: ");
		number = keyboard.nextInt();
		test.setNum(number);
		//add test cases
		System.out.println(test);	
		
		System.out.println("Enter a number :: ");
		number = keyboard.nextInt();
		test.setNum(number);
		//add test cases
		System.out.println(test);	
		
		System.out.println("Enter a number :: ");
		number = keyboard.nextInt();
		test.setNum(number);
		//add test cases
		System.out.println(test);	
	}
}