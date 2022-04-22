/**
* An interface for what a Room should have
*/
interface Room{
   /**
   * Getter method for the item in the room.
   * @return The item
   */
   Item getItem();
      /**
   * Getter method for the amount of gold in the room.
   * @return The amount of gold
   */
   int getGold();
   
   /**
   * Getter method for the name of the room.
   * @return The name
   */
   String getRoomName();
   /**
   * Setter method for the name of the room.
   * @param name The new name
   */
   void setRoomName(String name);
   
   /**
   * The player in the parameters is set out to retrieve the gold.
   * @param c The player set to retrieve the gold
   */
   void retrieveGold(Player c);
   /**
   * The player in the parameters is set out to retrieve the item.
   * @param c The player set to retrieve the item
   * @return The item retrieved, is returned so you can make a choice whether you want to keep or throw away the item
   */
   Item retrieveItem(Player c);
   
   /**
   * Setter method for the trap status of the room
   * @param trapped The new status of the room
   */
   void setTrapped(boolean trapped);
}