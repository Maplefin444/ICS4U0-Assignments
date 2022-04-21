/*
* James Huynh, Daniel Ye
* April 18, 2022
* Ms. Krasteva
* The main class that handles the game simulation
* The story:
* Three adventurers, Timmy (an elf), Tammy (a paladin), and Tommy (an elf), decide to go on an adventure to infiltrate the castle.
* They enter the sewers, but find that it is trapped, but has lots of gold. Moving through the sewers, Tommy is struck by
* a trap, and dies. The party continues, and makes it out into the castle by moving through a sewer grate.
* They move through the castle and eventually meet the king, which they promptly fight. However, the entire party was struck
* by traps, and were poisoned. The king does not fall to their attacks, and the party dies to poison.
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
      Player timmy = new Elf("Timmy", 100, 100);
      Player tammy = new Paladin("Tammy", 100, 10, "sir");
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
      castle.addRoom(new CastleRoom("King's Bedroom","Where the king resides",2,new Sword(5),true));
      
      System.out.println("The party moves through (raids) the sewers.");
      Room cur = sewer.getRoom(0);
      timmy.setRoom(cur);
      tammy.setRoom(cur);
      tommy.setRoom(cur);
      
      System.out.println("In room 1:");
      System.out.println(timmy.toString() + "\n");
      System.out.println(tammy.toString() + "\n");
      System.out.println(tommy.toString() + "\n");
        
      System.out.println("Timmy retrieves the gold and item in the room.");
      cur.retrieveGold(timmy);
      timmy.setItem(cur.retrieveItem(timmy));
      System.out.println(timmy.toString() + "\n");
      
      System.out.println("The party moves on.");
      
      cur = sewer.getRoom(1);
      timmy.setRoom(cur);
      tammy.setRoom(cur);
      tommy.setRoom(cur);
      
      System.out.println("In room 2:");
      System.out.println(timmy.toString() + "\n");
      System.out.println(tammy.toString() + "\n");
      System.out.println(tommy.toString() + "\n");
      
      System.out.println("Tammy retrieves the gold and item in the room.");
      cur.retrieveGold(tammy);
      timmy.setItem(cur.retrieveItem(tammy));
      System.out.println(tammy.toString() + "\n");
      System.out.println("Tammy was poisoned! However, the party moves on.");
      
      cur = sewer.getRoom(2);
      timmy.setRoom(cur);
      tammy.setRoom(cur);
      tommy.setRoom(cur);
      
      System.out.println("In room 3:");
      System.out.println(timmy.toString() + "\n");
      System.out.println(tammy.toString() + "\n");
      System.out.println(tommy.toString() + "\n");
      
      System.out.println("Tommy retrieves the gold and item in the room.");
      cur.retrieveGold(tommy);
      timmy.setItem(cur.retrieveItem(tommy));
      System.out.println(tommy.toString() + "\n");
      System.out.println("Tommy was killed! However, the party moves on.");
      
      System.out.println("\nThe party enters the castle, through a sewer grate in the throne room.\n");
      
      cur = castle.getRoom(0);
      timmy.setRoom(cur);
      tammy.setRoom(cur);
      
      System.out.println("In room 1:");
      System.out.println(timmy.toString() + "\n");
      System.out.println(tammy.toString() + "\n");
      
      System.out.println("Timmy retrieves the gold and item in the room.");
      cur.retrieveGold(timmy);
      timmy.setItem(cur.retrieveItem(timmy));
      System.out.println(timmy.toString() + "\n");
      System.out.println("Timmy was poisoned! However, the party moves on.");
      System.out.println("Tammy's poison begins to kick in...");
      tammy.poisonTick();
      System.out.println(tammy.toString() + "\n");
      
      cur = castle.getRoom(1);
      timmy.setRoom(cur);
      tammy.setRoom(cur);
      
      System.out.println("In room 1:");
      System.out.println(timmy.toString() + "\n");
      System.out.println(tammy.toString() + "\n");
      
      
   }
}

