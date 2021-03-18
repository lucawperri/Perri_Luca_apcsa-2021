//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sorry = new Toy("sorry");
		sorry.setCount(1);
		System.out.println(sorry);
		Toy joe = new Toy("gi joe");
		joe.setCount(5);
		System.out.println(joe);
	}
}