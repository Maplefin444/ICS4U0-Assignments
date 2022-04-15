/**
* This class is a parent class for all characters in the Fantasy game
* Made by James H. and Daniel Y. for ICS4U0, Ms. Krasteva on 15/04/2022
*/
public class Player{
   /**
   * Stores whether or not the elf is poisoned.
   */
   private boolean poisoned;
   /**
   * Stores the name of the character
   */
   private String name;
   /**
   * Stores the health value of the character
   */
   private int health;
   /**
   * Stores the maximum health of the character
   */
   private int maxHealth;
   /**
   * Stores the gold of the character
   */
   private int gold;
   /**
   * Stores the maximum gold of the character
   */
   private int maxGold;
   
   /**
   * Stores the room the character is in
   */
   private Room room;
   
   /**
   * Constructor for player
   * @param name Name of the player
   * @param health Health of the player
   * @param maxgold The max # of gold the character can have
   */
   public Player(String name, int health,int maxgold){
      this.name = name; 
      if(health < 0 || health > 100){
         this.health = 100;
      }
      else this.health = health;
      this.maxGold = maxgold;
      gold = 0;
      maxHealth = 100;
   }
   
   /**
   * Getter method for name
   * @return Name
   */
   public String getName(){
      return name;
   }
   /**
   * Getter method for health
   * @return Health
   */
   public int getHealth(){
      return health;
   }
   /**
   * Getter method for gold
   * @return Gold
   */
   public int getGold(){
      return gold;
   }
   /**
   * Getter method for max gold
   * @return Maxgold
   */
   public int getMaxGold(){
      return maxGold;
   }
   /**
   * Getter method for room
   * @return Room
   */
   public Room getRoom(){
      return room;
   }
   
   /**
   * Sets room
   * @param room Room to set to
   */
   public void setRoom(Room room){
      this.room = room;
   }
   /**
   * Sets name
   * @param name Name to set to
   */
   public void setName(String name){
      this.name = name;
   }
   /**
   * Increments/Decrements gold, does bound checks
   * @param amt The amount of gold to add, can be negative to subtract
   * @return Whether or the gold was edited
   */
   public boolean editGold(int amt){
      if(gold + amt > maxGold || gold + amt < 0) 
         return false;
      gold += amt;
      return true;
   }
   /**
   * Increments/decrements health, does bound checks
   * @param amt The amount of health to add, can be negative to subtract
   * @return An integer, 0 if goes over max health, -1 if it kills, and 1 if it was successful
   */
   public int editHealth(int amt){
      if(health + amt > maxHealth) 
         return 0;
      else if(health + amt < 0){
         health = 0;
         return -1;
      }
      health += amt;
      return 1;
   }
   /**
   * Changes the maximum amount of gold
   * @return If it was successful
   * @param n The amount to change to, cannot be 0 or lower
   */
   public boolean changeMaxGold(int n){
      if(n < 0) 
         return false;
      maxGold = n;
      return true;
   }
   /**
   * Changes the maximum amount of health
   * @return If it was successful
   * @param n The amount to change to, cannot be 0 or lower
   */
   public boolean changeMaxHealth(int n){
      if(n < 0) 
         return false;
      maxHealth = n;
      return true;
   }
      /**
   * If the character is not poisoned, will return false, but if is poisoned, will clear status effect and return true.
   * @return Returns whether or not the cleanse was successful
   */
   public boolean cleanse(){
      if(!poisoned) 
         return false;
      poisoned = false;
      return true;
   }
   /**
   * Poisons the character
   * @return Returns whether or not the poisoning was successful
   */
   public boolean poison(){
      if(poisoned) 
         return false;
      poisoned = true;
      return true;
   }
   /**
   * Deals damage to the character
   * @return returns whether or not the elf died
   */
   public boolean poisonTick(){
      int res = editHealth((int) (getHealth() * -0.9));
      if(res == 1) 
         return true;
      if(res == -1) 
         return false;
      if(res == 0) throw new IllegalArgumentException();
      return false;
   }
}