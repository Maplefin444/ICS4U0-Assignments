/*
    Programmers: Pradyumn Jha, James Huynh
    Teacher: Ms. Krasteva
    Date: February 25th, 2022 (2022-02-25)
    Assignment: Evaluation 3
    Purpose: Store cat details in a database (2d arrays).
*/

// Import statements
import java.util.*;
import java.io.*;

// The "CatDatabase2D" class.
public class CatDatabase2D{

   // Variables for attributes
   private String[][] data;
   public final int amt;
   
   // Constructor
   public CatDatabase2D(int amt){
      this.amt = amt;
      data = new String[5][amt];
   }
   
   // This greatestAge() method identifies the cat in database with the greatest age
   public int greatestAge(){
      int gage = -1;
      int ind = -1;
      for(int i = 0 ; i < amt; i++){
         if(Integer.parseInt(data[2][i]) > gage){
            ind = i;
            gage = Integer.parseInt(data[2][i]);
         }
      }
      return ind;
   }
   
   // This greatestWeight() method identifies the cat in database with the greatest weight
   public int greatestWeight(){
      double gwg = -1;
      int ind = -1;
      for(int i = 0 ; i < amt; i++){
         if(Double.parseDouble(data[3][i]) > gwg){
            ind = i;
            gwg = Double.parseDouble(data[3][i]);
         }
      }
      return ind;
   }
   
   // This greatestNiceness() method identifies the cat in database with the greatest niceness 'level'
   public int greatestNiceness(){
      int gnice = -1;
      int ind = -1;
      for(int i = 0 ; i < amt; i++){
         if(Integer.parseInt(data[4][i]) > gnice){
            ind = i;
            gnice = Integer.parseInt(data[4][i]);
         }
      }
      return ind;
   }
   
   // This getName() method gets the name of cat from specified index after checking for validity
   public String getName(int ind){
      if(ind >= amt || ind < 0){
         return "No such index!";
      }
      return data[0][ind];
   }
   
   // This getBreed() method gets the breed of cat from specified index after checking for validity
   public String getBreed(int ind){
      if(ind >= amt || ind < 0){
         return "No such index!";
      }
      return data[1][ind];
   }
   
   // This getAge() method gets the age of cat from specified index after checking for validity
   public int getAge(int ind){
      if(ind >= amt || ind < 0){
         return -1;
      }
      try{
         return Integer.parseInt(data[2][ind]);
      }
      catch(Exception e){}
      return -1;
   }
   
   // This getWeight() method gets the weight of cat from specified index after checking for validity
   public double getWeight(int ind){
      if(ind >= amt || ind < 0){
         return -1;
      }
      try{
         return Double.parseDouble(data[3][ind]);
      }
      catch(Exception e){}
      return -1;
   }
   
   // This getNiceness() method gets the niceness 'level' of cat from specified index after checking for validity
   public int getNiceness(int ind){
      if(ind >= amt || ind < 0){
         return -1;
      }
      try{
         return Integer.parseInt(data[4][ind]);
      }
      catch(Exception e){}
      return -1;
   }
   
   // This setName() method sets the name of cat via user specified input after checking for validity
   public void setName(String in, int ind){
      if(ind < amt && ind >= 0 && !in.equals("")){
         data[0][ind] = in;
      }
   }
   
   // This setBreed() method sets the breed of cat via user specified input after checking for validity
   public void setBreed(String in, int ind){
      if(ind < amt && ind >= 0 && !in.equals("")){
         data[1][ind] = in;
      }
   }
   
   // This setAge() method sets the age of cat via user specified input after checking for validity
   public void setAge(int in, int ind){
      if(ind < amt && ind >= 0 && in > 0){
         data[2][ind] = Integer.toString(in);
      }
   }
   
   // This setWeight() method sets the weight of cat via user specified input after checking for validity
   public void setWeight(double in, int ind){
      if(ind < amt && ind >= 0 && in > 0){
         data[3][ind] = Double.toString(in);
      }
   }
   
   // This setNiceness() method sets the niceness 'level' of cat via user specified input after checking for validity
   public void setNiceness(int in, int ind){
      if(ind < amt && in >= 1 && in <= 10 && ind >= 0){
         data[4][ind] = Integer.toString(in);
      }
      else{
         System.out.println("ooof");
      }
   }
   
   // This avgAge() method calculates the average age of all cats in database
   public double avgAge(){
      double sum = 0;
      try{
         for(int i = 0; i < amt; i++){
            if(Double.parseDouble(data[2][i]) <= 0) 
               continue;
            sum += Double.parseDouble(data[2][i]);
         }
      }
      catch(Exception e){}
      return sum/amt;
   }
   
   // This avgWeight() method calculates the average weight of all cats in database
   public double avgWeight(){
      double sum = 0;
      try{
         for(int i = 0; i < amt; i++){
            if(Double.parseDouble(data[3][i]) <= 0) 
               continue;
            sum += Double.parseDouble(data[3][i]);
         }
      }
      catch(Exception e){}
      return sum/amt;
   }
   
   // This avgNiceness() method calculates the average niceness 'level' of all cats in database
   public double avgNiceness(){
      double sum = 0;
      try{
         for(int i = 0; i < amt; i++){
            if(Double.parseDouble(data[4][i]) <= 0) 
               continue;
            sum += Double.parseDouble(data[4][i]);
         }
      }
      catch(Exception e){}
      return sum/amt;
   }
   
   // This initialize() method takes user input and inputs it into database
   public void initialize(){
      Scanner in = new Scanner(System.in);
      for(int i = 0; i < amt; i ++){
         while(true){
            System.out.print("Enter the name of cat #" + i + ": ");
            String line = in.nextLine();
            if(!line.equals("")){
               data[0][i] = line;
               break;
            }
            System.out.println("Oops! That's not a valid input!");
         }
         while(true){
            System.out.print("Enter the breed of cat #" + i + ": ");
            String line = in.nextLine();
            if(!line.equals("")){
               data[1][i] = line;
               break;
            }
            System.out.println("Oops! That's not a valid input!");
         }
         while(true){
            System.out.print("Enter the age of cat #" + i + ": ");
            try{
               int line = Integer.parseInt(in.nextLine());
               if(line > 0){
                  data[2][i] = Integer.toString(line);
                  break;
               }
               throw new IllegalArgumentException();
            }
            catch (Exception e){
               System.out.println("Oops! That's not a valid input!");
            }
         }
         while(true){
            System.out.print("Enter the weight of cat #" + i + ": ");
            try{
               double line = Double.parseDouble(in.nextLine());
               if(line > 0){
                  data[3][i] = Double.toString(line);
                  break;
               }
               throw new IllegalArgumentException();
            }
            catch (Exception e){
               System.out.println("Oops! That's not a valid input!");
            }
         }
         while(true){
            System.out.print("Enter the niceness of cat #" + i + ": ");
            try{
               int line = Integer.parseInt(in.nextLine());
               if(line > 0 && line < 11){
                  data[4][i] = Integer.toString(line);
                  break;
               }
               throw new IllegalArgumentException();
            }
            catch (Exception e){
               System.out.println("Oops! That's not a valid input!");
            }
         }
         if(i != amt-1){
            System.out.println("Moving onto cat #" + (i+1) + "...");
         }
      }
   }
   
   // This writeToFile() method saves database onto file
   public void writeToFile(){
      try{
         PrintWriter p = new PrintWriter(new FileWriter("data.txt"));
         for(int i = 0; i < amt; i ++){
            p.println(data[0][i] + " " + data[1][i] + " " + data[2][i] + " " + data[3][i] + " " + data[4][i]);
         }
         p.close();
      }
      catch(Exception e){
      }
   }
} // CatDatabase2D class