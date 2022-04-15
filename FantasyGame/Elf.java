public class Elf extends Player{
   private boolean poisoned;
   
   public Elf(String name, int health,int maxgold){
      super(name,health,maxgold);
   }
   public boolean cleanse(){
      if(!poisoned) 
         return false;
      poisoned = false;
      return true;
   }
   public boolean poison(){
      if(poisoned) 
         return false;
      poisoned = true;
      return true;
   }
   public boolean poisonTick(){
      int res = editHealth((int) (getHealth() * -0.9));
      if(res == 1) 
         return true;
      if(res == -1) 
         return false;
      if(res == 0) throw new IllegalArgumentException();
      return false;
   }
   public String toString(){
      if(getRoom() == null) return "Elf\nName: " + getName() + "\nHealth: " + getHealth() + "\nGold: " + getGold() + "\nMaxGold: " + getMaxGold() + "\nRoom: NO CURRENT ROOM";
      return "Elf\nName: " + getName() + "\nHealth: " + getHealth() + "\nGold: " + getGold() + "\nMaxGold: " + getMaxGold() + "\nRoom: " + getRoom().toString();
   }
}