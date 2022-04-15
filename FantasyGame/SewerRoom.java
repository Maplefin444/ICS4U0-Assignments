import java.util.*;

public class SewerRoom implements Room{
   private String name;
   private int gold;
   private boolean trapped;
   private Item item;
   public SewerRoom(String name, int gold, boolean trapped, Item item){
      this(name,gold,trapped);
      this.item = item;
   }
   public SewerRoom(String name, int gold, boolean trapped){
      this.name = name;
      this.gold = gold;
      this.trapped = trapped;
   }
   public Item getItem(){
      return item;
   }
   public int getGold(){
      return gold;
   }
   
   public String getRoomName(){
      return name;
   }
   public void setRoomName(String name){
      this.name = name;
   }
   
   public int retrieveGold(Player c){
      int temp = gold;
      gold = 0;
      if(trapped){
         c.editHealth(-10);
         trapped = false;
      }
      return temp;
   }
   public Item retrieveItem(Player c){
      Item temp = item;
      item = null;
      if(trapped){
         c.editHealth(-10);
         trapped = false;
      }
      return temp;
   }
   public String toString(){
      return "Room\nName: " + name + "\nGold: " + gold + "\nTrapped: " + trapped;
   }
}