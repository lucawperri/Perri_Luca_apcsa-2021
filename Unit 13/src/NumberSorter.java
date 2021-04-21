public class NumberSorter
{
	private static int getNumDigits(int number)
	{
		int num = number;
		int count = 0;
		while(num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int num = number;
		int temp = 0;
		int[] sorted = new int[getNumDigits(number)];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = num % 10;
			num = num / 10;
		}
		for (int k = 0; k < sorted.length; k++) {
			for (int i = 0; i < sorted.length; i++) {
				if ( sorted[i] > sorted[k]) {
					temp = sorted[k];
					sorted[k] = sorted[i];
					sorted[i] = temp;
				}
			}
		}
		return sorted;
	}
}