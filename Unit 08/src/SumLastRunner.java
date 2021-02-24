//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{	
		RaySumLast test = new RaySumLast();
		int[] nums = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println("The Array is :: -99,1,2,3,4,5,6,7,8,9,10,5");
		System.out.println("The wanted sum is " + test.go(nums));
	}
}