//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a name ");
		String name = keyboard.next();
		System.out.println("Enter a size ");
		int size = keyboard.nextInt();
		//instantiate monster one
		Skeleton monsterOne = new Skeleton(name, size);
		
		//ask for name and size
		System.out.println("Enter a name ");
		String n = keyboard.next();
		System.out.println("Enter a size ");
		int s = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton monsterTwo = new Skeleton(n, s);
		
		System.out.println(monsterOne);
		System.out.println(monsterTwo);
	}
}