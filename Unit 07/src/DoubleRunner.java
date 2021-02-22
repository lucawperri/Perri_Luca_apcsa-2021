//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		run.setDoubles(34.3, 32.3, 8.65, 9.56);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run.setDoubles(14.3, 31.3, 8.65, 23.56);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run.setDoubles(324.3, 3.3, 92.65, 3.45);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		//add more test cases
				
	}
}