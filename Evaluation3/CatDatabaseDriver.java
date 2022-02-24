import java.util.*;
public class CatDatabaseDriver{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int amt = Integer.parseInt(in.nextLine());
      CatDatabase a = new CatDatabase(amt);
      a.initialize();
   }
}