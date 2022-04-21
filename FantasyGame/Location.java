import java.util.*;
/**
* This class is a template for a location.
* Made by James H. and Daniel Y. for ICS4U0, Ms. Krasteva on 19/04/2022
*/
public abstract class Location{
   /**
   * This arraylist stores all the rooms in the location
   */
   private ArrayList<Room> rooms = new ArrayList<Room>();
   
   /**
   * Initializes a location.
   * @param r The first room.
   */
   public Location(Room r){
      rooms.add(r);
   }
   /**
   * Adds a room to the location.
   * @param r The room to be added
   */
   public void addRoom(Room r){
      rooms.add(r);
   }
   /**
   * Returns the room specified in the index
   * @param ind The index to get
   * @return The room specified
   */
   public Room getRoom(int ind){
      return rooms.get(ind);
   }
   /**
   * Returns the size of the rooms arraylist
   * @return The size of the rooms arraylist
   */
   public int getRoomAmt(){
      return rooms.size();
   }
   /**
   * Returns a string describing the location
   * @return A string describing the location
   */
   public abstract String toString();
}