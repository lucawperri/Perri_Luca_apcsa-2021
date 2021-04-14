//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] stringTest = {"a","x","2","f"};
		Grid test = new Grid(10,10, stringTest);
		System.out.println(test);
		System.out.println(test.findMax(stringTest));
	}
}