/*
James Huynh Pradyumn Jha
Mar 7 2022
ICS4U0 Ms. Krasteva ArrayList Evaluation
This program handles the running of the MacsBook class.
*/

import java.util.*;
import java.io.*;

/**
* This class is the driver to the MacsBook class.
*/
public class MacsBookDriver{
   public static void main(String[] args){
      MacsBook a = null;
      while(true){
         System.out.println("The MacsBook");
         System.out.println("1. Create new MacsBook");
         System.out.println("2. View all saved data");
         System.out.println("3. View specific student's data");
         System.out.println("4. Change specific marks");
         System.out.println("5. Save to file");
         System.out.println("6. Exit");
         try{
            Scanner inp = new Scanner(System.in);
            String choice = inp.nextLine();
            System.out.println();
            int num = Integer.parseInt(choice);
            if(num < 1 || num > 6) throw new IllegalArgumentException();
            
            if(num == 1){
               while(true){
                  try{
                     System.out.println("1. Read from file");
                     System.out.println("2. Create new");
                     System.out.println("3. Back");
                     choice = inp.nextLine();
                     num = Integer.parseInt(choice);
                     if(num < 1 || num > 3) throw new IllegalArgumentException();
                     
                     if(num == 1){
                        BufferedReader file = new BufferedReader(new FileReader("data.txt"));
                     }
                     else if(num == 2){
                        a = new MacsBook();
                        a.initialize();
                     }
                     else if(num == 3){
                        break;
                     }
                  }
                  catch(Exception e){System.out.println("Oops! That's not a valid input!");}
               }
            }
            else if(num == 2){
               if(a == null){
                  System.out.println("Create a MacsBook first!");
               }
               else{
                  for(int i = 0; i < a.getLength();i++){
                     System.out.println("Name:" + a.getName(i) + "   Student Number:" + a.getStudentNum(i) + "   Assignment Mark:" + a.getAssignment(i) + "   Test Mark:" + a.getTest(i) + "   Final Project Mark:" + a.getFinal(i));
                  }
               }
            }
            else if(num == 6) 
               break;
         }
         catch(Exception e){System.out.println("Oops! That's not a valid input!");}
      }
      System.out.println("Thank you for using the MacsBook system.");
   }
}