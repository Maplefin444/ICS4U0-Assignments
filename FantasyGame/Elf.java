public class Elf extends Character{
   private boolean poisoned;
   
   public Elf(String name, int health,int gold){
      super(name,health,gold);
   }
   public boolean cleanse(){
      if(!poisoned) return false;
      poisoned = false;
      return true;
   }
   public boolean poison(){
      if(poisoned) return false;
      poisoned = true;
      return true;
   }
   public boolean poisonTick(){
      int res = editHealth((int) (getHealth() * -0.9));
      if(res == 1) return true;
      if(res == -1) return false;
      if(res == 0) throw new IllegalArgumentException();
      return false;
   }
}