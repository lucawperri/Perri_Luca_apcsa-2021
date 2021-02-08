//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		Discount price = new Discount();
		out.print(price.getDiscountedBill(amt));
		
		out.print("\nEnter the original bill amount :: ");
		amt = keyboard.nextDouble();

		out.print(price.getDiscountedBill(amt) + "\n");
		
		out.print("\nEnter the original bill amount :: ");
		amt = keyboard.nextDouble();

		out.print(price.getDiscountedBill(amt) + "\n");
		
		out.print("\nEnter the original bill amount :: ");
		amt = keyboard.nextDouble();

		out.print(price.getDiscountedBill(amt) + "\n");
		
		out.print("\nEnter the original bill amount :: ");
		amt = keyboard.nextDouble();

		out.print(price.getDiscountedBill(amt) + "\n");
	}
}