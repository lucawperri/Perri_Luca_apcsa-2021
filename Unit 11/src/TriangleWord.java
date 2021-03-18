//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		int a = word.length();
		for(int i = 1; i<=a; i++) {
			for(int k =0; k<i; k++) {
				System.out.print(word.substring(0,i));
			}
			System.out.print("\n");
		}
	}
}