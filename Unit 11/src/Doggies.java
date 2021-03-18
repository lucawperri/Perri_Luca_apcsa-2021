//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		if(spot<pups.length) pups[spot] = new Dog(age, name);	
	}

	public String getNameOfOldest()
	{
		Dog largest = new Dog(0,"");
		for(int i = 0; i<pups.length; i++) {
			if(pups[i].getAge()>largest.getAge()) {
				largest = pups[i];
			}
		}
		return largest.getName();
	}

	public String getNameOfYoungest()
	{
		Dog smallest = pups[0];
		for(int i = 0; i<pups.length; i++) {
			if(pups[i].getAge()<smallest.getAge()) {
				smallest = pups[i];
			}
		}
		return smallest.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}