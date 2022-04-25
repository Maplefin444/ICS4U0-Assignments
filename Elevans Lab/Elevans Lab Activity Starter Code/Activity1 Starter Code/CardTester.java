/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card qh = new Card("Queen","Hearts",18);
      Card kd = new Card("King","Diamonds",19);
      Card as = new Card("Ace","Spades",20);
      System.out.println("Does Ace of Spades match Ace of Spades? : " + as.matches(as));
      System.out.println("King of Diamonds point value : " + kd.pointValue());
      System.out.println("Queen of Hearts rank : " + qh.rank());
      System.out.println("Ace of Spades suit : " + as.suit());
      System.out.println("King of Diamonds toString : " + kd.toString());
      System.out.println("Does Ace of Spades match King of Diamonds? : " + as.matches(kd));
	}
}
