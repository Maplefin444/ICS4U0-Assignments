interface Room{
   Item getItem();
   int getGold();
   
   String getRoomName();
   void setRoomName(String name);
   
   int retrieveGold(Player c);
   Item retrieveItem(Player c);
}