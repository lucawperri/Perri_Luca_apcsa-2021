//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		while(!player.equals("Q")){
			out.println("Choose Rock, Paper, or Scissors [R,P,S] (Type Q to Quit) :: ");
			player = keyboard.nextLine();
			//read in the player value
		if(player.equals("R") || player.equals("P") || player.equals("S")) {
			RockPaperScissors game = new RockPaperScissors(player);	
			out.println(game);
		}
		}
	}
}
