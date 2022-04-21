/**
* This class simulates a paladin, and inherits property from class Player
* Made by James H. and Daniel Y. for ICS4U0, Ms. Krasteva on 21/04/2022
*/
class Paladin extends Player{
   
   /**
   * Professional Prefix for the Paladin's title
   */
   private String prefix;
   
   /**
   * Class Constructor
   * @param name the name of the paladin
   * @param health the health of the paladin
   * @param maxGold the maximum gold the paladin can hold
   * @param prefix the title of the paladin
   */
   public Paladin(String name, int health, int maxGold, String prefix){
      super(name, health, maxGold);
      this.prefix = prefix;
   }
   
   /**
   * Return the name of the paladin
   */
   public String getName(){
      return prefix + " " + super.getName();
   }
   
   /**
   * Return the prefix of the paladin
   * @return the prefix of the paladin
   */
   public String getPrefix(){
      return prefix;
   }
   
   /**
   * set the prefix of the paladin
   * @param prefix to prefix to set the current prefix to
   */
   public void setPrefix(String prefix){
      this.prefix = prefix;
   }
 
   /**
   * Returns a String representation of the paladin
   * @return a user-friendly String representation of the paladin
   */
   public String toString(){
      if(getRoom() == null) return "Paladin\nName: " + getName() + "\nHealth: " + getHealth() + "\nGold: " + getGold() + "\nMaxGold: " + getMaxGold() + "\nRoom: NO CURRENT ROOM";
      return "Paladin\nName: " + getName() + "\nHealth: " + getHealth() + "\nGold: " + getGold() + "\nMaxGold: " + getMaxGold() + "\nRoom: " + getRoom().toString();
   }

}