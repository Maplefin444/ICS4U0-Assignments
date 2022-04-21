/*
* James Huynh, Daniel Ye
* April 18, 2022
* Ms. Krasteva
* This class implements one of the rooms in the game
*/

// imports
import java.util.*;
/**
* This class is a room for the sewers area, implements Room interface
* Made by James H. and Daniel Y. for ICS4U0, Ms. Krasteva on 15/04/2022
*/
public class SewerRoom implements Room{
   /**
   * Stores name of the room
   */
   private String name;
   /**
   * Stores the gold in the room
   */
   private int gold;
   /**
   * Stores whether or not the room is trapped
   */
   private boolean trapped;
   /**
   * Stores the item in the room
   */
   private Item item;
   /**
   * Constructor for SewerRoom
   * @param name The name
   * @param gold The amount of gold in the room
   * @param trapped If the room is trapped or not
   * @param item The item in the room
   */
   public SewerRoom(String name, int gold, boolean trapped, Item item){
      this(name,gold,trapped);
      this.item = item;
   }
   /**
   * Constructor for SewerRoom
   * @param name The name
   * @param gold The amount of gold in the room
   * @param trapped If the room is trapped or not
   */
   public SewerRoom(String name, int gold, boolean trapped){
      this.name = name;
      this.gold = gold;
      this.trapped = trapped;
   }
   /**
   * Returns the item in the room
   * @return Item in the room
   */
   public Item getItem(){
      return item;
   }
   /**
   * Returns the gold in the room
   * @return Gold in the room
   */
   public int getGold(){
      return gold;
   }
   /**
   * Returns the room name
   * @return Room name
   */
   public String getRoomName(){
      return name;
   }
   /**
   * Sets the room name
   * @param name New name
   */
   public void setRoomName(String name){
      this.name = name;
   }
   /**
   * Takes a character, gives them the gold, and if it is trapped, then poisons them and does 10 damage
   * @param c Player that retrieves the gold
   */
   public void retrieveGold(Player c){
      int temp = gold;
      gold = 0;
      if(trapped){
         c.editHealth(-10);
         c.poison();
         trapped = false;
      }
      c.editGold(temp);
   }
   /**
   * Takes a character, does damage to them if the room is trapped, and returns the Item.
   * @param c Player that retrieves the item
   * @return The item retrieved
   */
   public Item retrieveItem(Player c){
      Item temp = item;
      item = null;
      if(trapped){
         c.editHealth(-10);
         c.poison();
         trapped = false;
      }
      return temp;
   }
   
   /**
   * Set whether or not the room is trapped
   * @param trapped whether or not the room is trapped
   */
   public void setTrapped(boolean trapped){
      this.trapped = trapped;
   }
   
   /**
   * Makes a printable string for the current room
   * @return The printable string
   */
   public String toString(){
      return "\nRoom " + name + "\n   Gold: " + gold + "\n   Trapped: " + trapped;
   }
}