//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] ray = new int[size];
		for(int i = 0; i<size; i++) {
		ray[i] = (int) ((int) 10 * Math.random());
		}
		return ray;
	}
	public static void shiftEm(int[] array)
	{
		int temp;
		for(int i = 0; i<array.length; i++) {
			if(i>0 && array[i] == 7) {
				for(int k = i; k>0; k--) {
					if(!(array[k-1] == 7 || k == 0)) {
						temp = array[k-1];
						array[k-1] = array[k];
						array[k] = temp;
					}
				}
			}
		}
	}
}