public class WordSearch
{
    private String[][] m;
    private int length;
    public WordSearch( int size, String str )
    {	

    	int counter = 0;
    	length = size;
    	m = new String[size][size];
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			m[i][j] = str.substring(counter, counter + 1);
    			counter++;
    		}
    	}
    	
    }

    public boolean isFound( String word )
    {
      	boolean rightLeft = (checkRight(word, 0, 0) || checkLeft(word, length-1, length-1));
    	boolean upDown = (checkUp(word, length-1, length-1) || checkDown(word, length - 1, length - 1));
    	boolean diagUp = (checkDiagUpRight(word, length-1, 0)|| checkDiagUpLeft(word, length-1, length-1));
    	boolean diagDown = (checkDiagDownRight(word, 0, 0)|| checkDiagDownLeft(word, 0, length-1));
    	return rightLeft || upDown || diagUp || diagDown;
    }

	public boolean checkRight(String w, int r, int c)
   {	if ( w.length() > length - c) return false;
   		String temp = "";
   		int count = 0;
   		for ( int i = 0; i < w.length(); i++) {
   			temp = String.valueOf(w.charAt(i));
   			if ( temp.equals(m[r][c + i])) {
   				count ++;
   			}
   		}
   		if (count == w.length()) return true;
   		else return checkRight(w, r, c + 1);
	}

	public boolean checkLeft(String w, int r, int c)
	{	
		if ( w.length() > length - c) return false;
   		String temp = "";
   		int count = 0;
   		for ( int i = 0; i < w.length(); i++) {
   			temp = String.valueOf(w.charAt(i));
   			if ( temp.equals(m[r][c - i])) {
   				count ++;
   			}
   		}
   		if (count == w.length()) return true;
   		if (r == 0) return false;
   		else return checkLeft(w, r, c - 1);
	}

	public boolean checkUp(String w, int r, int c)
	{
		if (w.length() > length - r) return false;
		String temp = "";
   		int count = 0;
   		for ( int i = 0; i < w.length(); i++) {
   			temp = String.valueOf(w.charAt(i));
   			if ( temp.equals(m[r + i][c])) {
   				count ++;
   			}
   		}
   		if (count == w.length()) return true;
   		else return checkUp(w, r+1, c);
	}

	public boolean checkDown(String w, int r, int c)
   {	
		 if (w.length() > length - r) return false;
		String temp = "";
   		int count = 0;
   		for ( int i = 0; i < w.length(); i++) {
   			temp = String.valueOf(w.charAt(i));
   			if ( temp.equals(m[r - i][c])) {
   				count ++;
   			}
   		}
   		if (count == w.length()) return true;
   		if (r == 0 ) return false;
   		else return checkDown(w, r, c - 1);
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if (w.length() > length - r) return false;
		String temp = "";
   		int count = 0;
   		for ( int i = 0; i < w.length(); i++) {
   			temp = String.valueOf(w.charAt(i));
   			if ( temp.equals(m[r + i][c + i])) {
   				count ++;
   			}
   		}
   		if (count == w.length()) return true;
   		else return checkDiagUpRight(w, r + 1, c + 1);
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if (w.length() > length - r) return false;
		String temp = "";
   		int count = 0;
   		for ( int i = 0; i < w.length(); i++) {
   			temp = String.valueOf(w.charAt(i));
   			if ( temp.equals(m[r + i][c - i])) {
   				count ++;
   			}
   		}
   		if (count == w.length()) return true;
   		else return checkDiagUpLeft(w, r + 1, c - 1);
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		if (w.length() < length - r) return false;
		String temp = "";
   		int count = 0;
   		for ( int i = 0; i < w.length(); i++) {
   			temp = String.valueOf(w.charAt(i));
   			if ( temp.equals(m[length - 1 - i][c - i])) {
   				count ++;
   			}
   		}
   		if (count == w.length()) return true;
   		else return checkDiagDownLeft(w, r - 1, c - 1);
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if (w.length() < length - r) return false;
		String temp = "";
   		int count = 0;
   		for ( int i = 0; i < w.length(); i++) {
   			temp = String.valueOf(w.charAt(i));
   			if ( temp.equals(m[length - 1 - i][c + i])) {
   				count ++;
   			}
   		}
   		if (count == w.length()) return true;
   		else return checkDiagDownRight(w, r - 1, c + 1);
	}

    public String toString()
    {	String output = "";
    for (String[] row: m) {
		for(String letter: row) {
			output += letter;
		}
		output += "\n";
	}
 		return output;
    }
}