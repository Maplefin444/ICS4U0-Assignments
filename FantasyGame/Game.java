/*
* James Huynh, Daniel Ye
* April 18, 2022
* Ms. Krasteva
* The main class that handles the game simulation
*/

// imports
import java.util.*;

/**
* The main game Simulator
*/
public class Game{
   /**
   * A list of all players in the party
   */
   private ArrayList<Player> party;
   
   /**
   * Default Class Constructor
   */
   public Game(){
      party = new ArrayList<Player>();
   }
   
   /**
   * Tests the Program, running a sample simulation
   */
   public void test(){
      // fill in our party
      party.add(new Elf("Jimmy", 100, 10));
      party.add(new Elf("Timmy", 1000, 100));
      party.add(new Elf("Tommy", 1, 1));
      SewerRoom room = new SewerRoom("ewww", 10,false);
//       for(Player i : party){
//          i.setRoom(room);
//       }
      printParty();
   }
   
   /**
   * Prints the party
   */
   private void printParty(){
      for(Player i : party){
         System.out.println(i+"\n");
      }
   }
}