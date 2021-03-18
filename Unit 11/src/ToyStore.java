//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		boolean done = false;
		String part = "";
		String temp = toys;
		boolean exists = false;
		
		int cut;
		while(!done) {
			
		cut = temp.indexOf(" ");
		part = temp.substring(0,cut);
		temp = temp.substring(cut+1,temp.length());
		Toy test = new Toy(part);
		for(int i = 0; i<toyList.size(); i++) {
			if(toyList.get(i).getName().equals(part)) {
				toyList.get(i).setCount(toyList.get(i).getCount()+1);
				exists = true;
			}
			}
		if(!exists) {
		toyList.add(test);
		test.setCount(1);
		}
		if(temp.indexOf(" ") == -1)
			done = true;
		exists = false;
		}
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int i = 0; i<toyList.size(); i++) {
  			if(toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy max = toyList.get(0);
  		for(int i = 0; i<toyList.size(); i++) {
  			if(toyList.get(i).getCount()>max.getCount())
  				max = toyList.get(i);
  		}
  		return max.getName() + " Is the most frequent toy";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
		String output = "";
		for(int i = 0; i<toyList.size(); i++) {
			output = output + " " + toyList.get(i).getName() + toyList.get(i).getCount() + ", ";
		}
	   return output;
	}
}