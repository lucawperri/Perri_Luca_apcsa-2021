//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		String str = word;
		
		for(int i = str.length(); str.length()>1; i--) {
			str = word.substring(0,i);
			System.out.println(str);
		}
	}
}