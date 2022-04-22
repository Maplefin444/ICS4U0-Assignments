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
public class Castle extends Location{
   /**
   * Constructor for Castle class, calls the superclass.
   * @param r The room to start with.
   */
   public Castle(Room r){
      super(r);
   }
   /**
   * Makes a printable string for the current room
   * @return The printable string
   */
   public String toString(){
      return "This is the castle. It currently has: " +  getRoomAmt() + " rooms.";
   }
}
