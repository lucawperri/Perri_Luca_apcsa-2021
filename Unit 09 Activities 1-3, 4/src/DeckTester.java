/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = new String[] {"Ace","King","Seven","Two"};
		String[] cardSuits = new String[] {"Clubs","Diamonds","Hearts","Clubs"};
		int[] values = new int[] {1,10,7,2};
		Deck test = new Deck(ranks, cardSuits,values);
		System.out.println(test.isEmpty());
		System.out.println(test.deal().toString());
		int size = test.size();
		System.out.println("The Deck Size is " + size);
		System.out.println(test.deal().toString());
		size = test.size();
		System.out.println("The Deck Size is " +size);
		System.out.println("\n" + "New Deck\n");
		
		
		ranks = new String[] {"Three","Jack","Queen","Two", "Eight"};
		cardSuits = new String[] {"Clubs","Diamonds","Hearts","Clubs", "Diamonds"};
		values = new int[] {3,10,10,2,8};
		Deck test2 = new Deck(ranks, cardSuits,values);
		System.out.println(test2.isEmpty());
		System.out.println(test2.deal().toString());
		size = test2.size();
		System.out.println("The Deck Size is " +size);
		System.out.println("\n" + "New Deck\n");
		
		ranks = new String[] {"Four","Queen","King","Jack", "Eights"};
		cardSuits = new String[] {"Diamonds","Hearts","Clubs","Hearts", "Clubs"};
		values = new int[] {4,10,10,10,8};
		Deck test3 = new Deck(ranks, cardSuits,values);
		System.out.println(test3.isEmpty());
		System.out.println(test3.deal().toString());
		size = test3.size();
		System.out.println("The Deck Size is " +size);
		test3.shuffle();
		System.out.println("Before Shuffling the first card is");
		System.out.println(test3.getFirst());
		test3.shuffle();
		System.out.println("After Shuffling the first card is");
		System.out.println(test3.getFirst());
		
	}
}