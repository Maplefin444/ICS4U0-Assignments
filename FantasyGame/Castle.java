import java.util.*;

public class Castle{
   private ArrayList<Room> rooms;
	private String roomName;
   public Castle(String name)
   {
      rooms = new ArrayList<Room>();
      
   }
	/**
	 * Adds a DarkRoom to the Castle level
	 * @param room
	 */
   public void addRoom(Room room)
   {
      rooms.add(room);
   }
	
	/**
	 * Occurs when an Elf enters a DarkRoom
	 * @param elf The Elf
	 * @param room The DarkRoom
	 */
   public void enterRoom(Elf elf, Room room)
   {
   	
      System.out.println(elf.getName() + " enters a room");
   }
	
	/**
	 * Occurs when an Elf leaves a DarkRoom.
	 * @param elf The Elf.
	 * @param room The DarkRoom
	 */
   public void exitRoom(Elf elf, Room room)
   {		
      System.out.println(elf.getName() + " leaves the room");
   }
	
	/**
	 * Returns the number of DarkRooms.
	 * @return The number of DarkRooms.
	 */
   public int getRoomCount()
   {
      return rooms.size();
   }

	/**
	 * Returns a DarkRoom according to index.
	 * @param index
	 * @return
	 */
   public Room getRoom(int index) {
      return rooms.get(index);
   }
}
