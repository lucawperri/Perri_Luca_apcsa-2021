//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String first = "" + a.charAt(0);
	   String last = "" + a.charAt(a.length()-1);
	   first = first.toUpperCase();
	   last = last.toUpperCase();
	   
	   if(first.equals("A") || first.equals("E") || first.equals("I") || first.equals("O") || first.equals("I")){
		   return "yes";
	   }
	   if(last.equals("A") || last.equals("E") || last.equals("I") || last.equals("O") || last.equals("I")){
		   return "yes";
	   }
		return "no";
	}
}