/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("King", "Hearts", 13);
		Card card2 = new Card("Joker", "Hearts", 19);
		Card card3 = new Card("King", "Hearts", 13);
		System.out.println(card1.matches(card3));
		System.out.println(card1.matches(card2));
		System.out.println("Card 1 is " + card1);
	}
}
