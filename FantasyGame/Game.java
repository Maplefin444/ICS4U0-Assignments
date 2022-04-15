import java.util.*;

public class Game{
   private ArrayList<Player> party;
   public Game(){
      party = new ArrayList<Player>();
   }
   public void test(){
      party.add(new Elf("Jimmy", 100, 10));
      party.add(new Elf("Timmy", 1000, 100));
      party.add(new Elf("Tommy", 1, 1));
      SewerRoom room = new SewerRoom("ewww", 10,false);
//       for(Player i : party){
//          i.setRoom(room);
//       }
      printParty();
   }
   private void printParty(){
      for(Player i : party){
         System.out.println(i+"\n");
      }
   }
}