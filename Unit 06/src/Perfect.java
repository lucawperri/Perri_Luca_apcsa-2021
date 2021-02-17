//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
   public Perfect() {
	   setNum(0);
   }
   
   public Perfect(int num) {
	   setNum(num);
   }
   
   public void setNum(int num) {
	   number = num;
   }

	//add constructors

	//add a set method

	public boolean isPerfect(){
		int sum = 0;
		for(int i = 1; i<number; i++) {
			if(number%i == 0){
				sum = i + sum;
			}
		}
		if(number == sum) {
			return true;
		}
		return false;
	}

	//add a toString	
	public String toString() {
		if(isPerfect()) {
			return number + " is perfect";
		}
		return number + " is not perfect";
	}
}