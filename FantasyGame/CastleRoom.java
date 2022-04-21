/*
* James Huynh, Daniel Ye
* April 18, 2022
* Ms. Krasteva
* This class implements one of the Rooms in the Fantasy Game
*/

// imports
import java.util.*;

/**
* A normal room in the Castle. Implements the Room Interface.
*/
public class CastleRoom implements Room {
   
   /**
   * The item currently in the room
   */
   private Item item;
   /**
   * The amount of gold in this room
   */
   private int gold;
   /**
   * The name of the room
   */
   private String name;
   /**
   * whether or not the room is currently trapped
   */
   private boolean trapped;
   /**
   * A description of the Room
   */
   private String description;
   
   /**
   * Constructor for CastleRoom
   * @param name the name of the room
   * @param description the description of the room
   * @param gold the amount of gold in the room
   * @param item the item in the room
   * @param trapped whether or not the room is trapped
   */
   public CastleRoom(String name, String description, int gold, Item item, boolean trapped){
      this.description = description;
      this.name = name;
      this.gold = gold;
      this.item = item;
      this.trapped = trapped;
   }
   
   /**
   * returns a description of the room
   * @return a description of the room
   */
   public String getDescription(){
      return description;
   }
   
   /**
   * sets the description of the room
   * @param desc the description to set the room to
   */
   public void setDescription(String desc){
      this.description = desc;
   }
   
   /**
   * Returns the Item currently in the Room
   * @return the item in the room
   */
   public Item getItem(){
      return item;
   }
   
   /**
   * Returns the amount of Gold in the current Room
   * @return the amount of gold currently in the room
   */
   public int getGold(){
      return gold;
   }
   
   /**
   * Returns the name of the room
   * @return the name of the room
   */
   public String getRoomName(){
      return name;
   }
   
   /**
   * sets the room's name
   * @param name The name to set the room's name to
   */
   public void setRoomName(String name){
      this.name = name;
   }
   
   /**
   * gives the player all the gold in the room, emptying it; and damaging the player if the room is trapped
   * @param c the player to give the gold to
   */
   public void retrieveGold(Player c){
      // if trapped, damage the player
      if(trapped){
         c.editHealth(-20);
         trapped = false;
      }
      c.editGold(gold);
      gold = 0;
   }
   
   /**
   * Gives the player the item currently in the room, and damaging the player if the room is trapped
   * @param c the player to give the item to
   * @return the Item received by the Player
   */
   public Item retrieveItem(Player c){
      // if trapped, damage the player
      if(trapped){
         c.editHealth(-20);
         trapped = false;
      }
      Item tmp = item;
      item = null;
      return tmp;
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
      return "\nRoom " + name + "\n   " + description + ".\n   Gold: " + gold + "\n   Trapped: " + trapped;
   }
}