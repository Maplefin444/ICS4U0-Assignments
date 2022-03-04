/*
James Huynh Pradyumn Jha
Mar 7 2022
ICS4U0 Ms. Krasteva ArrayList Evaluation
This program handles the MaCSBook program, storing student data in arraylists.
*/

import java.util.*;

/**
* A MaCSBook program handler, that stores data in arraylists.
* This was created for ICS4U0, Ms. Krasteva's, ArrayList Evaluation
*/
public class MacsBook{
   /**
   * This private arraylist stores the names of the students in the system.
   */
   private ArrayList<String> names = new ArrayList<String>(0);
   /**
   * This private arraylist stores the student numbers of the students in the system.
   */
   private ArrayList<Integer> stunum = new ArrayList<Integer>(0);
   /**
   * This private arraylist stores the assignment marks of the students in the system.
   */
   private ArrayList<Integer> assignment = new ArrayList<Integer>(0);
   /**
   * This private arraylist stores the test marks of the students in the system.
   */
   private ArrayList<Integer> test = new ArrayList<Integer>(0);
   /**
   * This private arraylist stores the final project marks of the students in the system.
   */
   private ArrayList<Integer> finalproj = new ArrayList<Integer>(0);
   
   /**
   * This method gets the length of the arraylists.
   * @return The length of the arraylists.
   */
   public int getLength(){
      return names.size();
   }
   
   /**
   * This method adds the value given to the end of the arraylist
   * @param val The value to be added.
   */
   public void addName(String val){
      try{
         names.add(val);
      }
      catch(Exception e){
      }
   }
   /**
   * This method adds the value given to the end of the arraylist
   * @param val The value to be added.
   */
   public void addStudentNum(int val){
      try{
         stunum.add(val);
      }
      catch(Exception e){
      }
   }
   /**
   * This method adds the value given to the end of the arraylist
   * @param val The value to be added.
   */
   public void addAssignment(int val){
      try{
         assignment.add(val);
      }
      catch(Exception e){
      }
   }
   /**
   * This method adds the value given to the end of the arraylist
   * @param val The value to be added.
   */
   public void addTest(int val){
      try{
         test.add(val);
      }
      catch(Exception e){
      }
   }
   /**
   * This method adds the value given to the end of the arraylist
   * @param val The value to be added.
   */
   public void addFinal(int val){
      try{
         finalproj.add(val);
      }
      catch(Exception e){
      }
   }
   /**
   * This method gets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @return Returns the student's name
   * @param ind The index to access
   */
   public String getName(int ind){
      try{
         return names.get(ind);
      }
      catch(Exception e){
         e.printStackTrace();
         return null;
      }
   }
   /**
   * This method gets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @return Returns the student's number
   * @param ind The index to access
   */
   public int getStudentNum(int ind){
      try{
         return stunum.get(ind);
      }
      catch(Exception e){
         e.printStackTrace();
         return -1;
      }
   }
   /**
   * This method gets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @return Returns the student's assignment mark
   * @param ind The index to access
   */
   public int getAssignment(int ind){
      try{
         return assignment.get(ind);
      }
      catch(Exception e){
         e.printStackTrace();
         return -1;
      }
   }
   /**
   * This method gets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @return Returns the student's test mark
   * @param ind The index to access
   */
   public int getTest(int ind){
      try{
         return test.get(ind);
      }
      catch(Exception e){
         e.printStackTrace();
         return -1;
      }
   }
   /**
   * This method gets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @return Returns the student's final project mark
   * @param ind The index to access
   */
   public int getFinal(int ind){
      try{
         return finalproj.get(ind);
      }
      catch(Exception e){
         e.printStackTrace();
         return -1;
      }
   }
   
   /**
   * This method sets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @param ind The index to access
   * @param val The value to set the index to
   */
   public void setName(int ind, String val){
      try{
         names.set(ind, val);
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
   
   /**
   * This method sets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @param ind The index to access
   * @param val The value to set the index to
   */
   public void setStudentNum(int ind, int val){
      try{
         stunum.set(ind, val);
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
   
   /**
   * This method sets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @param ind The index to access
   * @param val The value to set the index to
   */
   public void setAssignment(int ind, int val){
      try{
         assignment.set(ind, val);
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
   /**
   * This method sets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @param ind The index to access
   * @param val The value to set the index to
   */
   public void setTest(int ind, int val){
      try{
         test.set(ind, val);
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
   /**
   * This method sets the corresponding variable, or catches an exception that is caught by printing the stack trace.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @param ind The index to access
   * @param val The value to set the index to
   */
   public void setFinal(int ind, int val){
      try{
         finalproj.set(ind, val);
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
   /**
   * This public method averages the class's marks.
   * @return Returns the average mark.
   */
   public double classAvg(){
      double sum = 0;
      for(int i : assignment){
         sum += (double) i;
      }
      for(int i : test){
         sum += (double) i;
      }
      for(int i : finalproj){
         sum += (double) i;
      }
      return (sum/(double)(assignment.size() + test.size() + finalproj.size()));
   }
   /**
   * This public method averages the assignment marks.
   * @return Returns the average mark.
   */
   public double avgAssignment(){
      double sum = 0;
      for(int i : assignment){
         sum += (double) i;
      }
      return (sum/(double)assignment.size());
   }
   
   /**
   * This public method averages the test marks.
   * @return Returns the average mark.
   */
   public double avgTest(){
      double sum = 0;
      for(int i : test){
         sum += (double) i;
      }
      return (sum/(double) test.size());
   }
   
   /**
   * This public method averages the final project marks.
   * @return Returns the average mark.
   */
   public double avgFinal(){
      double sum = 0;
      for(int i : finalproj){
         sum += (double) i;
      }
      return (sum/(double)finalproj.size());
   }
   
   /**
   * This public method gets the average mark of the specified student.
   * The stack trace method was retrieved from https://www.educative.io/edpresso/what-is-the-printstacktrace-method-in-java
   * @param ind The index to calculate the mark of.
   * @return The average mark of the student. or -1 if the index is invalid
   */
   public double avgMark(int ind){
      try{
         double sum = 0;
         sum += (double) assignment.get(ind);
         sum += (double) test.get(ind);
         sum += (double) finalproj.get(ind);
         return sum/3;
      }
      catch(Exception e){
         e.printStackTrace();
         return -1;
      }
   }
   
   /**
   * This public method handles the creation of a new MacsBook object, or the adding of a new student, asking the user to input values.
   */
   public void initialize(){
      Scanner inp = new Scanner(System.in);
      int num = 0;
      while(true){
         System.out.print("How many students would you like to enter? ");
         String amt = inp.nextLine();
         try{
            num = Integer.parseInt(amt);
            break;
         }
         catch(Exception e){System.out.println("Oops! That's not a valid input!");}
      }
      
      for(int i = 0; i < num; i ++){
         System.out.println();
         System.out.println("Student #" + (i+1));
         while(true){
            System.out.print("Student's name: ");
            String name = inp.nextLine();
            if(name.equals("")) System.out.println("Oops! That's not a valid input!");
            else{
               names.add(name);
               break;
            }
            
         }
         while(true){
            System.out.print("Student's student number: ");
            String name = inp.nextLine();
            try{
               int temp = Integer.parseInt(name);
               if(Integer.toString(temp).length() != 9) throw new IllegalArgumentException();
               stunum.add(temp);
               break;
            }
            catch(Exception e){
               System.out.println("Oops! That's not a valid input!");
            }
         }
         
         while(true){
            System.out.print("Student's assignment mark: ");
            String name = inp.nextLine();
            try{
               int temp = Integer.parseInt(name);
               if(temp > 200 || temp < 0) throw new IllegalArgumentException();
               assignment.add(temp);
               break;
            }
            catch(Exception e){
               System.out.println("Oops! That's not a valid input!");
            }
         }
         
         while(true){
            System.out.print("Student's test mark: ");
            String name = inp.nextLine();
            try{
               int temp = Integer.parseInt(name);
               if(temp > 200 || temp < 0) throw new IllegalArgumentException();
               test.add(temp);
               break;
            }
            catch(Exception e){
               System.out.println("Oops! That's not a valid input!");
            }
         }
         
         while(true){
            System.out.print("Student's final project mark: ");
            String name = inp.nextLine();
            try{
               int temp = Integer.parseInt(name);
               if(temp > 200 || temp < 0) throw new IllegalArgumentException();
               finalproj.add(temp);
               break;
            }
            catch(Exception e){
               System.out.println("Oops! That's not a valid input!");
            }
         }
         System.out.println("Student #" + (i+1) + " is now done initializing, moving on...");
      }
   }
}