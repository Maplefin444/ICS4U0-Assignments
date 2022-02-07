/*
James Huynh
Ms. Krasteva IC4U0 String Manipulation
Feb 4 2022
This program will ask for a string and an index, then remove the character at the index.
*/

import java.util.*;

public class Main{
   public static String rem(String in, int ind){
      String out = "";
      for(int i = 0; i < in.length();i++)
         if(i != ind) out += in.charAt(i);
      return out;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      int index = Integer.parseInt(sc.nextLine());
      System.out.println(rem(input,index));
   }
}
