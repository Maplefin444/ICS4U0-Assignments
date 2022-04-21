/*
* James Huynh, Daniel Ye
* April 18, 2022
* Ms. Krasteva
* This class implements a sword in the fantasy game
*/

/**
* An item in the game
*/
public class Sword implements Item{
   /**
   * The amount of damage dealt by this sword
   */
   private int damage;
   
   /**
   * Class Constructor for a sword
   * @param the amount of damage dealt by the sword
   */
   public Sword(int damage){
      this.damage = damage;
   }

   /**
   * uses the item
   * @return a String describing the action of the item
   */
   public String useItem(Player c){
      return "Sword deals " + damage + " damage!";
   }
}