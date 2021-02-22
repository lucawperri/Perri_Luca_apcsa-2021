//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int smallest;
		if(a<b && a<c)
			smallest = a;
			else if(b<a && c<c){
				smallest = b;
			}
			else
				smallest = c;
		
		for(int i = 1; i<= smallest; i++) {
			if(a%i == 0 && b%i == 0 && c%i == 0) {
					max = i;
			}
		}	
		return max;
	}

	public String toString()
	{
		String output="The numbers are \n";
		for(int A = 1; A< number; A++) {
			for (int B = 1; B< number; B++) {
				for (int C = 1; C< number; C++) {
					if(  ((A*A) + (B*B)) == (C*C) && (greatestCommonFactor(A, B, C) == 1) && ((A%2 == 0) && (B%2 == 1) || (A%2 ==1) && (B%2 == 0))    ) {
						output = output + A + ", " + B + ", " + C + "\n";
						
					}
				}
			}
		}
		return output+"\n";
	}
}