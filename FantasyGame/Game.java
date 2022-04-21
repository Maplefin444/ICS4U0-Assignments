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
   * Default Class Constructor
   */
   public Game(){
   }
   
   /**
   * Tests the Program, running a sample simulation
   */
   public void test(){
      // fill in our party
      Player jimmy = new Elf("Jimmy", 100, 10);
      Player timmy = new Elf("Timmy", 1000, 100);
      Player tommy = new Elf("Tommy", 1, 1);
      
      System.out.println("We are setting out on a journey!");
      System.out.println(jimmy.toString() + "\n");
      System.out.println(timmy.toString() + "\n");
      System.out.println(tommy.toString() + "\n");
      
      // initialize our two main locations
      Location sewer = new Sewer(new SewerRoom("Area 45", 12, false, new Sword(15)));
      Location castle = new Castle(new CastleRoom("The Throne", "The place of ruling", 15, new Bow(10), false));
      
      
   }
}