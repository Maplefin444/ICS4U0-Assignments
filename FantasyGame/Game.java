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
      Player timmy = new Elf("Timmy", 1000, 100);
      Player tammy = new Elf("Tammy", 100, 10);
      Player tommy = new Elf("Tommy", 1, 1);
      
      System.out.println("We are setting out on a journey!");
      System.out.println(timmy.toString() + "\n");
      System.out.println(tammy.toString() + "\n");
      System.out.println(tommy.toString() + "\n");
      
      // initialize our two main locations
      Location sewer = new Sewer(new SewerRoom("Area 52", 12, false, new Sword(15)));
      sewer.addRoom(new SewerRoom("Treasure Room",100,true,new Bow(20)));
      sewer.addRoom(new SewerRoom("Exit Room",5,true,new Sword(1)));
      Location castle = new Castle(new CastleRoom("The Throne", "The place of ruling", 15, new Bow(10), false));
      castle.addRoom(new CastleRoom("Dining Room","Where the royals dine",2,new Sword(2), true));
      castle.addRoom(new CastleRoom("Hallway","A hallway",2,new Sword(5),true));
      
      timmy.setRoom(sewer.getRoom(0));
      tammy.setRoom(sewer.getRoom(0));
      tommy.setRoom(sewer.getRoom(0));
      
      System.out.println("The part enters the sewers...");
      System.out.println(timmy.toString() + "\n");
      System.out.println(tammy.toString() + "\n");
      System.out.println(tommy.toString() + "\n");
      
      
   }
}