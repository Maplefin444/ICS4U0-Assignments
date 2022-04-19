/**
* An interface for what a Room should have
*/
interface Room{
   Item getItem();
   int getGold();
   
   String getRoomName();
   void setRoomName(String name);
   
   void retrieveGold(Player c);
   Item retrieveItem(Player c);
   
   void setTrapped(boolean trapped);
}