/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck a = new Deck(new String[] {"A","B","C"},new String[] {"Cats","Dogs"},new int[] {100,200,300});
      Deck b = new Deck(new String[] {"C","B","A"},new String[] {"Something","Someone"},new int[] {1,2,3});
      Deck c = new Deck(new String[] {"D","E","F"},new String[] {"Animal","Person"},new int[] {3,2,1});
      for(int i = 0; i < 6;i++){
         a.deal();
      }
      System.out.println(a.toString());
      System.out.println(b.toString());
      System.out.println(c.toString());   
      System.out.println("Is deck A empty? : " + a.isEmpty());
      System.out.println("Size of deck B : " + b.size());
      System.out.println("Dealing a card from deck B : " + b.deal().toString());
	}
}
