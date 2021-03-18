//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		String response = "Y";
		while(response.equals("Y")) {
			Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word :: ");
		String str = keyboard.nextLine();
		TriangleWord.printTriangle(str);
		
		System.out.println("Do you want to enter more sample inputs ?");
		response = keyboard.nextLine().toUpperCase();
		}
	}
}