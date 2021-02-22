//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('A');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		char letterLocal = letter;
		int count = amount;
		char templetter = letter;
		int tempcount = count;
		String output="";
		for(int a = 0; a < count ; a++) {
			for(int i = 0; i < tempcount  ; i++) {
				for(int j = 0; j < count ; j++) {
					if(templetter == 'Z') {
						templetter = (char)('Z' - (26 * i));
					} 
					output = output + ((char) (templetter + i));	
				};
				output = output + (" ");
				count = count - 1;
				
			};
			output = output + "\n";
			tempcount = tempcount - 1;
			count = amount;
			templetter = letterLocal;
		}
		return output;
	}
}