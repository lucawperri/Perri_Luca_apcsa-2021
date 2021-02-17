//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int p = 1;
		for(int i = 0; i< str.length(); i++) {
			if(p<str.length()) {
				if((str.charAt(i) == str.charAt(p))) {
					count = 1 + count;
				}
			}
			p = p+ 1;
			
		}
		return count;
	}
}