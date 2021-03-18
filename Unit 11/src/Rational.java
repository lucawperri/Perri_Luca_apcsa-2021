import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int num;
	private int den;
	//add two instance variables

	
	//write two constructors
	public Rational() {
		setNum(1);
		setDen(1);
	}
	public Rational(int top, int bot) {
		setNum(top);
		setDen(bot);
	}


	//write a setRational method
	public void setRational(int top, int bot) {
		num = top;
		den = bot;
	}
	

	//write  a set method for numerator and denominator
	public void setNum(int top) {
		num = top;
	}
	public void setDen(int bot) {
		den = bot;
	}
	
	public void add(Rational  other)
	{
		num = (num * other.returnDen()) + (other.returnNum() * den);
		den = den * other.returnDen();
		this.reduce();
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{
		int big = num;
		if(den>num)
			big = den;
		for(int i = 1; i<=big; i++) {
			if(num%i == 0 && den%i == 0) {
				num = num/i;
				den = den/i;
			}
		}


	}

	private int gcd(int numOne, int numTwo)
	{
		if(numOne>numTwo)
			return numOne;
		if(numOne == numTwo)
			return 1;
		return numTwo;

		
	}

	public Rational clone ()
	{
		return new Rational(num , den);
	}


	//ACCESSORS
	public int returnNum() {
		return num;
	}
	public int returnDen() {
		return den;
	}
	//write get methods for numerator and denominator
	public String returnRational() {
		return "" + num + "\t" + den;
	}
	
	public boolean equals( Object obj)
	{
		
		this.reduce();
		if(obj == this)
			return true;
		return false;

	
	}

	public int compareTo(Rational other)
	{
		double decimal1 = 0;
		double decimal2 = 0;
		decimal1 = (double) num/den;
		decimal2 = (double) other.returnNum()/other.returnDen();
		if(decimal1 > decimal2)
			return 1;
		else if (decimal2 > decimal1) 
			return -1;
		else
			return 0;
	}


	public String toString() {
		return num + "/" + den;
	}
	
	//write  toString() method
	
	
}