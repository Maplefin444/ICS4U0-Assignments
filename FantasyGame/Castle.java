/*
* James Huynh, Daniel Ye
* April 18, 2022
* Ms. Krasteva
* This class is the Castle that the characters are stationed in
*/

// imports
import java.util.*;

/**
* The setting that the Characters are stationed in.
*/
public class Castle{
   /**
   * A list of the rooms in the castle
   */
   private ArrayList<Room> rooms;
   
   /**
   * Class Constructor
   */
   public Castle(String name)
   {
      rooms = new ArrayList<Room>();
   }
   
	/**
	 * Adds a Room to the Castle level
	 * @param room the current room
	 */
   public void addRoom(Room room)
   {
      rooms.add(room);
   }
	
	/**
	 * Occurs when an Elf enters a Room
	 * @param elf The Elf
	 * @param room The Room
	 */
   public void enterRoom(Elf elf, Room room)
   {
   	
      System.out.println(elf.getName() + " enters a room");
   }
	
	/**
	 * Occurs when an Elf leaves a Room.
	 * @param elf The Elf.
	 * @param room The room
	 */
   public void exitRoom(Elf elf, Room room)
   {		
      System.out.println(elf.getName() + " leaves the room");
   }
	
	/**
	 * Returns the number of Room.
	 * @return The number of Room.
	 */
   public int getRoomCount()
   {
      return rooms.size();
   }

	/**
	 * Returns a Room according to index.
	 * @param index
	 * @return the room at the index
	 */
   public Room getRoom(int index) {
      return rooms.get(index);
   }
}
