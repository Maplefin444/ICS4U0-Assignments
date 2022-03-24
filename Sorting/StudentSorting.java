/*
* Programmers: James Huynh, Pradyumn Jha, Daniel Ye
* Date: March 23, 2022
* Teacher: Ms. Krasteva
* Description: The data parser and processor for the StudentSorting class, in which the students described in A7-1.txt are parsed and processed. This class also sorts these students and prints them.
*/

// imports
import java.util.*;
import java.io.*;

/**
* The StudentSorting class parses the students described in A7-1.txt and can sort them by name (increasing lexicographic) or by mark (decreasing). Also provides functionality to print sorted students.
*/
public class StudentSorting{
   /**
   * The mark of a student
   */
   private int[] marks = new int[35];
   /**
   * The name of a student
   */
   private String[] names = new String[35];
   
   /**
   * Class Constructor
   */
   public StudentSorting(){
      // read students from A7-1.txt, throwing an error if something goes wrong
      try{
         // initialize readaer
         BufferedReader in = new BufferedReader(new FileReader("A7-1.txt"));
         
         // for each pair of lines, the first line is the name and the second line is their mark
         for(int i = 0; i < marks.length; i++){
            names[i] = in.readLine();
            marks[i] = Integer.parseInt(in.readLine());
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
   
   /**
   * Swaps two students' positions in the array
   * @param i the index of the first student
   * @param j the index of the second student
   */
   private void swap(int i, int j){
      // temporary arrays for the i-th and j-th student
      int tempMark = marks[j];
      String tempName = names[j];
      
      // reassign the j-th student
      marks[j] = marks[i];
      names[j] = names[i];
      
      // reassign the i-th student to the original values of the j-th student
      marks[i] = tempMark;
      names[i] = tempName;
   }
   
   /**
   * Internally sorts the students by their name
   */
   public void sortNames(){
      // run a selection sort algorithm
      for(int i = 0; i < names.length-1;i++){
         // minimum index starting from i
         int mindex = i;
         
         // loop through each student, updating mindex to the minimum student
         for(int j = i+1; j < names.length; j++){
            if(names[j].compareToIgnoreCase(names[mindex]) < 0) {
               mindex = j;
            }
         }
         
         // swap the i-th student with the minimum one after it
         swap(i, mindex);
      }
   }
   
   /**
   * sorts the students by their mark
   */
   public void sortByMark(){
      // run an insertion sort algorithm
      for(int i = 1; i < names.length; i++){
         // while the current element is larger than the previous element, swap it
         for(int j = i; j > 0 && marks[j-1] < marks[j]; --j){
            swap(j-1, j);
         }
      }
   }
   
   /**
   * print the students in a user-friendly manner
   */
   public void printStudents(){
      for(int i = 0; i < marks.length; i++){
         System.out.println(names[i] + " " + marks[i]);
      }
   }
}