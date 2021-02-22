//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double[] nums =  new double[] {one,two,three,four};
		double max = nums[0];
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		return max;
	}

	public String toString()
	{
	   return "The numbers are " + one + ", " + two + ", " + three + ", " + four;
	}
}