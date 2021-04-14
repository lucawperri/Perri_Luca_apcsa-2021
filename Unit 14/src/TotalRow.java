//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> example = new ArrayList<Integer>(); 
    	int sum = 0;
    	for(int k = 0; k<m.length; k++) {    		
    		for(int i = 0; i<m[k].length; i++) {
    			sum = sum + m[k][i];    		
    		}
    		example.add(sum);
    		sum = 0;
    	}
		return example;
    }
}
