public class Player{
   private String name;
   private int health;
   private int maxHealth;
   private int gold;
   private int maxGold;
   
   private Room room;
   
   public Player(String name, int health,int maxgold){
      this.name = name; 
      this.health = health;
      this.maxGold = maxgold;
      gold = 0;
   }
   
   public String getName(){
      return name;
   }
   public int getHealth(){
      return health;
   }
   public int getGold(){
      return gold;
   }
   public int getMaxGold(){
      return maxGold;
   }
   public Room getRoom(){
      return room;
   }
   
   public void setRoom(Room room){
      this.room = room;
   }
   public void setName(String name){
      this.name = name;
   }
   public boolean editGold(int amt){
      if(gold + amt > maxGold || gold + amt < 0) 
         return false;
      gold += amt;
      return true;
   }
   public int editHealth(int amt){
      if(health + amt > maxHealth) 
         return 0;
      else if(health + amt < 0) 
         return -1;
      health += amt;
      return 1;
   }
   public boolean changeMaxGold(int n){
      if(n < 0) 
         return false;
      maxGold = n;
      return true;
   }
   public boolean changeMaxHealth(int n){
      if(n < 0) 
         return false;
      maxHealth = n;
      return true;
   }
}