import java.util.*;
import java.io.*;

public class StudentSorting{
   private int[] marks = new int[35];
   private String[] names = new String[35];
   
   public StudentSorting(){
      try{
         BufferedReader in = new BufferedReader(new FileReader("A7-1.txt"));
         for(int i = 0; i < marks.length; i++){
            names[i] = in.readLine();
            marks[i] = Integer.parseInt(in.readLine());
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
   public void sortNames(){
      for(int i = 0; i < names.length-1;i++){
         int mindex = i;
         for(int j = i+1; j < names.length; j++){
            if(names[j].compareTo(names[mindex]) < 0) {
               mindex = j;
            }
         }
         int temp = marks[mindex];
         String temp2 = names[mindex];
            
         marks[mindex] = marks[i];
         names[mindex] = names[i];
            
         marks[i] = temp;
         names[i] = temp2;
      }
      
      String[] array = {"z", "a", "b"};
      for ( int j=0; j < array.length-1; j++ )
      {
      
         int min = j;
         for ( int k=j+1; k < array.length; k++ )
            if ( array[k].compareTo( array[min] ) < 0 ) min = k;  
      
      // Swap the reference at j with the reference at min 
         String temp = array[j];
         array[j] = array[min];
         array[min] = temp;
      }
      for(int i = 0; i < array.length;i++){
         System.out.println(array[i]);
      }
   }
   
   public void printStudents(){
      for(int i = 0; i < marks.length; i++){
         System.out.println(names[i] + " " + marks[i]);
      }
   }
}