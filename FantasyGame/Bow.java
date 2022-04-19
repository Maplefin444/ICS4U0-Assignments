/*
* James Huynh, Daniel Ye
* April 18, 2022
* Ms. Krasteva
* This class implements a Bow in the fantasy game
*/

/**
* An item in the game
*/
public class Bow implements Item{
   /**
   * The amount of damage dealt by this bow
   */
   private int damage;
   
   /**
   * Class Constructor for a bow
   * @param damage The amount of damage dealt by the bow
   */
   public Bow(int damage){
      this.damage = damage;
   }

   /**
   * uses the item
   * @return a String describing the action of the item
   */
   public String useItem(Player c){
      return "Bow deals " + damage + " damage!";
   }
}