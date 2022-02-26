/*
    Programmers: James Huynh, Pradyumn Jha
    Teacher: Ms. Krasteva
    Date: February 25th, 2022 (2022-02-25)
    Assignment: Evaluation 3
    Purpose: Store cat details in a database (parallel arrays).
*/

// Import statements
import java.util.*;
import java.io.*;

// The "CatDatabase" class.
public class CatDatabase{

   // Variables for attributes
   private String[] name;
   private String[] breed;
   private int[] age;
   private double[] weight;
   private int[] niceness;
   public final int amt;
   
   // Constructor
   public CatDatabase(int amt){
      this.amt = amt;
      name = new String[amt];
      breed = new String[amt];
      age = new int[amt];
      weight = new double[amt];
      niceness = new int[amt];
   }
   
   // This greatestAge() method identifies the cat in database with the greatest age
   public int greatestAge(){
      int gage = -1;
      int ind = -1;
      for(int i = 0 ; i < amt; i++){
         if(age[i] > gage){
            ind = i;
            gage = age[i];
         }
      }
      return ind;
   }
   
   // This greatestWeight() method identifies the cat in database with the greatest weight
   public int greatestWeight(){
      double gwg = -1;
      int ind = -1;
      for(int i = 0 ; i < amt; i++){
         if(weight[i] > gwg){
            ind = i;
            gwg = weight[i];
         }
      }
      return ind;
   }
   
   // This greatestNiceness() method identifies the cat in database with the greatest niceness 'level'
   public int greatestNiceness(){
      int gnice = -1;
      int ind = -1;
      for(int i = 0 ; i < amt; i++){
         if(niceness[i] > gnice){
            ind = i;
            gnice = niceness[i];
         }
      }
      return ind;
   }
   
   // This getName() method gets the name of cat from specified index after checking for validity
   public String getName(int ind){
      if(ind >= amt || ind < 0){
         return "No such index!";
      }
      return name[ind];
   }
   
   // This getBreed() method gets the breed of cat from specified index after checking for validity   
   public String getBreed(int ind){
      if(ind >= amt || ind < 0){
         return "No such index!";
      }
      return breed[ind];
   }
   
   // This getAge() method gets the age of cat from specified index after checking for validity   
   public int getAge(int ind){
      if(ind >= amt || ind < 0){
         return -1;
      }
      return age[ind];
   }
   
   // This getWeight() method gets the weight of cat from specified index after checking for validity
   public double getWeight(int ind){
      if(ind >= amt || ind < 0){
         return -1;
      }
      return weight[ind];
   }
   
   // This getNiceness() method gets the niceness 'level' of cat from specified index after checking for validity
   public int getNiceness(int ind){
      if(ind >= amt || ind < 0){
         return -1;
      }
      return niceness[ind];
   }
   
   // This setName() method sets the name of cat via user specified input after checking for validity
   public void setName(String in, int ind){
      if(ind < amt && ind >= 0){
         name[ind] = in;
      }
   }
   
   // This setBreed() method sets the breed of cat via user specified input after checking for validity
   public void setBreed(String in, int ind){
      if(ind < amt && ind >= 0){
         breed[ind] = in;
      }
   }
   
   // This setAge() method sets the age of cat via user specified input after checking for validity
   public void setAge(int in, int ind){
      if(ind < amt && ind >= 0){
         age[ind] = in;
      }
   }
   
   // This setWeight() method sets the weight of cat via user specified input after checking for validity
   public void setWeight(Double in, int ind){
      if(ind < amt && ind >= 0){
         weight[ind] = in;
      }
   }
   
   // This setNiceness() method sets the niceness 'level' of cat via user specified input after checking for validity
   public void setNiceness(int in, int ind){
      if(ind < amt && (in >= 1 && in <= 10) && ind >= 0){
         niceness[ind] = in;
      }
   }
   
   // This avgAge() method calculates the average age of all cats in database
   public double avgAge(){
      double sum = 0;
      for(int i = 0; i < amt; i++){
         if(age[i] <= 0) 
            continue;
         sum += (double) age[i];
      }
      return sum/amt;
   }
   
   // This avgWeight() method calculates the average weight of all cats in database
   public double avgWeight(){
      double sum = 0;
      for(int i = 0; i < amt; i++){
         if(weight[i] <= 0) 
            continue;
         sum += (double) weight[i];
      }
      return sum/amt;
   }
   
   // This avgNiceness() method calculates the average niceness 'level' of all cats in database
   public double avgNiceness(){
      double sum = 0;
      for(int i = 0; i < amt; i++){
         if(niceness[i] <= 0) 
            continue;
         sum += (double) niceness[i];
      }
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
               name[i] = line;
               break;
            }
            System.out.println("Oops! That's not a valid input!");
         }
         while(true){
            System.out.print("Enter the breed of cat #" + i + ": ");
            String line = in.nextLine();
            if(!line.equals("")){
               breed[i] = line;
               break;
            }
            System.out.println("Oops! That's not a valid input!");
         }
         while(true){
            System.out.print("Enter the age of cat #" + i + ": ");
            try{
               int line = Integer.parseInt(in.nextLine());
               if(line > 0){
                  age[i] = line;
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
                  weight[i] = line;
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
               if(line >= 1 && line <= 10){
                  niceness[i] = line;
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
            p.println(name[i] + " " + breed[i] + " " + age[i] + " " + weight[i] + " " + niceness[i]);
         }
         p.close();
      }
      catch(Exception e){
      }
   }
} // CatDatabase class