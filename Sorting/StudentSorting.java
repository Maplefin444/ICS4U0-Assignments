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
   private void swap(int i, int j){
      int tempMark = marks[j];
      String tempName = names[j];
      marks[j] = marks[i];
      names[j] = names[i];
      marks[i] = tempMark;
      names[i] = tempName;
   }
   public void sortNames(){
      for(int i = 0; i < names.length-1;i++){
         int mindex = i;
         for(int j = i+1; j < names.length; j++){
            if(names[j].compareTo(names[mindex]) < 0) {
               mindex = j;
            }
         }
         swap(i, mindex);
      }
   }
   public void sortByMark(){
      for(int i = 1; i < names.length; i++){
         for(int j = i; j > 0 && marks[j-1] < marks[j]; --j){
            swap(j-1, j);
         }
      }
   }
   
   public void printStudents(){
      for(int i = 0; i < marks.length; i++){
         System.out.println(names[i] + " " + marks[i]);
      }
   }
}