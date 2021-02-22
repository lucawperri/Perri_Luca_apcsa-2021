//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice=player;
	}

	public String determineWinner()
	{
		String winner="";
		int computer = (int) (3 * Math.random());
		if(computer == 2) {
			compChoice = "S";
		}
		else if(computer == 1) {
			compChoice = "P";
		}
		else {
			compChoice = "R";
		}
		if((playChoice.equals("R") && compChoice.equals("S")) || (playChoice.equals("P") && compChoice.equals("R")) || (playChoice.equals("S") && compChoice.equals("P"))) {
			winner = "You Win";
		}
		else if ((playChoice.equals("R") && compChoice.equals("R")) || (playChoice.equals("S") && compChoice.equals("S")) || (playChoice.equals("P") && compChoice.equals("P"))) {
			winner = "You Tied";
		}
		else if((playChoice.equals("S") && compChoice.equals("R")) || (playChoice.equals("P") && compChoice.equals("S")) || (playChoice.equals("R") && compChoice.equals("P"))) {
			winner = "You Lost";
		}
		
		return winner;
	}

	public String toString()
	{
		String output= "" +  determineWinner() + " You chose " + playChoice + ", and your opponent chose " + compChoice;
		return output;
	}
}