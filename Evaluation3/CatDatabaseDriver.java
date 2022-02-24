import java.util.*;
public class CatDatabaseDriver{
   public static void main(String[] args){
      CatDatabase a;
      Scanner in = new Scanner(System.in);
      while(true){
         int num = 0;
         System.out.println("The Cat Database");
         System.out.println("Enter the number to go to the specific menu.");
         System.out.println("1. New Database");
         System.out.println("2. View Current Database");
         System.out.println("3. Read Database From File");
         System.out.println("4. Tools");
         System.out.println("5. Exit");
         try{
            num = Integer.parseInt(in.nextLine());
            if(num < 1 || num > 5) throw new IllegalArgumentException();
         }
         catch(Exception e){
            System.out.println("That's not a valid input! Try again!");
         }
         if(num == 1){
            int amt = 0;
            while(true){
               System.out.print("Enter the amount of cats you intend to store: ");
               try{
                  amt = Integer.parseInt(in.nextLine());
                  if(amt <= 0) throw new IllegalArgumentException();
                  break;
               }
               catch(Exception e){
                  System.out.println("That's not a valid input! Try again!");
               }
            }
            a = new CatDatabase(amt);
            a.initialize();
         }
         
         if(num == 2){
         }
         
         if(num == 3){
         }
         
         if(num == 4){
            while(true){
               System.out.println("Cat Database Tools");
               System.out.println("1. Get Average Age");
               System.out.println("2. Get Average Weight");
               System.out.println("3. Get Average Length");
               break;
            }
         }
         
         if(num == 5){
            System.out.println("Thank you for using the Cat Database.");
            break;
         }
      }
   }
}