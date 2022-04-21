/**
* An alternate location for the characters
*/
public class Sewer extends Location{

   /**
   * Initializes the Sewer
   * @param r the first location
   */
   public Sewer(Room r){
      super(r);
      r.setTrapped(true);
   }
   
   /**
   * Adds a room to the location.
   * @param r The room to be added
   */
   public void addRoom(Room r){
      r.setTrapped(true);
      super.addRoom(r);
   }
   
   /**
   * Makes a printable string for the current location
   * @return The printable string
   */
   public String toString(){
      return "This is a Sewer. All of its rooms are trapped. It currently has " + getRoomAmt() + " rooms.";
   }
}