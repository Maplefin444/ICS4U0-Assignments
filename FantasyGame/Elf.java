/**
* This class simulates an elf, and inherits property from class Player
* Made by James H. and Daniel Y. for ICS4U0, Ms. Krasteva on 15/04/2022
*/

public class Elf extends Player{
   
   /**
   * Constructor for elf.
   * @param name The elf's name
   * @param health The starting health
   * @param maxgold The maximum gold that can be held
   */
   public Elf(String name, int health,int maxgold){
      super(name,health,maxgold);
   }
   /**
   * Returns a string describing the elf
   * @return A string to be printed
   */
   public String toString(){
      if(getRoom() == null) return "Elf\nName: " + getName() + "\nHealth: " + getHealth() + "\nGold: " + getGold() + "\nMaxGold: " + getMaxGold() + "\nRoom: NO CURRENT ROOM";
      return "Elf\nName: " + getName() + "\nHealth: " + getHealth() + "\nGold: " + getGold() + "\nMaxGold: " + getMaxGold() + "\nRoom: " + getRoom().toString();
   }
}