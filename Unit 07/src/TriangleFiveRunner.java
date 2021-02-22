//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);  
	   System.out.println("Enter a Character :: ");
	   char letter = keyboard.nextLine().charAt(0);
	   System.out.println("Enter an Integer :: ");
	   int num = keyboard.nextInt();
	   TriangleFive test = new TriangleFive(letter,num);
	   System.out.println(test);
	}
}