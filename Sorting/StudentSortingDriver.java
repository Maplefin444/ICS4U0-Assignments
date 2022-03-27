/*
* Programmers: James Huynh, Pradyumn Jha, Daniel Ye
* Date: March 23, 2022
* Teacher: Ms. Krasteva
* Description: The Driver for the StudentSorting program, in which the students described in A7-1.txt are sorted and printed out.
*/

/**
* StudentSortingDriver displays the students described in A7-1.txt in sorted order to the console, both by name and by mark
*/
public class StudentSortingDriver{
   public static void main(String[] args){
      // declare StudentSorting
      StudentSorting a = new StudentSorting();
      
      // print out students sorted by name (increasing lexicographic)
      System.out.println("---------- SORTED BY NAME --------------------");
      a.sortNames();
      a.printStudents();
      a.writeStudents("A7-1-sorted-by-name.txt");
      
      // print out students sorted by mark (descending)
      System.out.println();
      System.out.println("---------- SORTED BY MARK --------------------");
      a.sortByMark();
      a.printStudents();
      a.writeStudents("A7-1-sorted-by-mark.txt");
   }
}