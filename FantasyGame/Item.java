/**
* An interface for all Items in the game
*/
interface Item{
   /**
   * A method to use the item.
   * @param c The player to use it on.
   * @return A string describing what the item did.
   */
   String useItem(Player c);
}