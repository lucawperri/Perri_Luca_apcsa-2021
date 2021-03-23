//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		
		ArrayList<String> finalized = new ArrayList<String>();
		int size = file.nextInt();
		finalized.add(file.nextLine());
		do {
			Word nextLine = new Word(file.nextLine());
			for(int i =0; i<finalized.size(); i++) {
				if(nextLine.compareTo(new Word(finalized.get(i))) == 1) {
						finalized.add(nextLine.getWord());
						break;
				}
					
			}
		} 
		while(file.hasNextLine());
		System.out.println(finalized);
	}
}