//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the toys :: ");
		String toys = keyboard.nextLine();
		ToyStore test = new ToyStore();
		test.loadToys(toys);
		System.out.println(test);
		System.out.println(test.getMostFrequentToy());
		System.out.println(test.getThatToy("train"));
	}
}