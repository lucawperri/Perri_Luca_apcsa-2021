import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES); 
		System.out.print("Luca Perri, Period 3, 4/13/21");
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if (selectedCards.size()==2)
		{
			boolean hasJack = false;
			boolean hasQueen = false;
			boolean hasKing = false;
			for (Integer card : selectedCards)
			{
				Card atIndex = cardAt(card);
				if (atIndex.rank().equals("king"))
				{
					hasKing=true;
				}
				if (atIndex.rank().equals("queen"))
				{
					hasQueen=true;
				}
				if (atIndex.rank().equals("jack"))
				{
					hasJack=true;
				}
			}
			return hasKing==hasQueen==hasJack==true;
		}
		else if (selectedCards.size()==3)
		{
			int sum = 0;
			for (Integer card : selectedCards)
			{
				Card atIndex=cardAt(card);
				sum+=atIndex.pointValue();
			}
			return sum==11;
		}
		return false;
    }

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	 public boolean anotherPlayIsPossible() {
		boolean possible=false;
        List<Integer> selection = new ArrayList<Integer>();
        for (int card1=0; card1<BOARD_SIZE; card1++) 
        {
            selection.add(card1);
            for (int card2=card1+1; card2<BOARD_SIZE; card2++)
            {
                selection.add(card2);
                possible=(containsJQK(selection));
                if (possible) break;
                selection.remove(1);
            }
            if (possible) break;
            for (int card2=card1+1; card2<BOARD_SIZE; card2++)
            {
                selection.add(card2);
                for (int card3=card2+1; card3<BOARD_SIZE; card3++)
                {
                    selection.add(card3);
                    possible=(containsPairSum11(selection));
                    if (possible) break;
                    selection.remove(2);
                }
                if (possible) break;
                selection.remove(1);
            }
            if (possible) break;
            selection.remove(0);
        }
        return possible;
    }

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if (selectedCards.size()==3) {
            int sum = 0;
            for (int card: selectedCards) {
                if (!cardAt(card).rank().equals("Jack") && !cardAt(card).rank().equals("Queen") && !cardAt(card).rank().equals("King") && !cardAt(card).rank().equals("Ace")) {
                sum += cardAt(card).pointValue();
                }
                if (cardAt(card).rank().equals("Ace")) {
                sum += 1;
                }
            }
            return sum==11;
        }
        else return false;
    }

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int J = 0;
		int Q = 0;
		int K = 0;
		for(int i = 0; i<selectedCards.size(); i++) {
			if (cardAt(selectedCards.get(i)).rank() == "jack") {
	            J += 1;
	        }
			else if (cardAt(selectedCards.get(i)).rank() == "queen") {
				Q += 1;
			}
			else if ( cardAt(selectedCards.get(i)).rank() == "king") {
				K += 1;
			}
		}
		if((K == 2)||(J == 2)||(Q == 2)) {
			return true;
		}
		return false;
	}
}