 import java.util.ArrayList;

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0; i<cols; i++) {
			for(int k = 0; k<rows; k++) {
				grid[k][i] = vals[(int) (Math.random()*(vals.length))];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		ArrayList<Integer> word = new ArrayList<Integer>();
		boolean mostCommon = true;
		String commonWord = "nothing yet";
		for(int i = 0; i<grid.length; i++) {
			for(int k = 0; k<grid[i].length; k++) {
				word.add(countVals(grid[i][k]));
				for(int j = 0; j<word.size(); j++) {
					if(word.get(j)>word.get(word.size()-1)) {
						mostCommon = false;
					}
				}
				if(mostCommon)
					commonWord = grid[i][k];
			}
		}
		return commonWord + " appears the most";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(int i = 0; i< grid.length; i++) {
			for(int k = 0; k<grid[i].length; k++) {
				if(grid[i][k].equals(val)) {
					count = count + 1;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int i = 0; i< grid.length; i++) {
			for(int k = 0; k<grid[i].length; k++) {
				output = output + " " + grid[i][k];
			}
		}
		return output;
	}
}