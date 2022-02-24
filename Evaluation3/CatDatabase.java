import java.util.*;
import java.io.*;

public class CatDatabase{
   private String[] name;
   private String[] breed;
   private int[] age;
   private double[] weight;
   private int[] niceness;
   public final int amt;
   
   public CatDatabase(int amt){
      this.amt = amt;
      name = new String[amt];
      breed = new String[amt];
      age = new int[amt];
      weight = new double[amt];
      niceness = new int[amt];
   }
   public String getName(int ind){
      if(ind >= amt){
         return "No such index!";
      }
      return name[ind];
   }
   public String getBreed(int ind){
      if(ind >= amt){
         return "No such index!";
      }
      return breed[ind];
   }
   public int getAge(int ind){
      if(ind >= amt){
         return -1;
      }
      return age[ind];
   }
   public double getWeight(int ind){
      if(ind >= amt){
         return -1;
      }
      return weight[ind];
   }
   public int getNiceness(int ind){
      if(ind >= amt){
         return -1;
      }
      return niceness[ind];
   }
   
   
   public void setName(String in, int ind){
      if(ind < amt){
         name[ind] = in;
      }
   }
   public void setBreed(String in, int ind){
      if(ind < amt){
         breed[ind] = in;
      }
   }
   public void setAge(int in, int ind){
      if(ind < amt){
         age[ind] = in;
      }
   }
   public void setWeight(Double in, int ind){
      if(ind < amt){
         weight[ind] = in;
      }
   }
   public void setNiceness(int in, int ind){
      if(ind < amt){
         niceness[ind] = in;
      }
   }
   
   public double avgAge(){
      double sum = 0;
      for(int i = 0; i < amt; i++){
         sum += (double) age[i];
      }
      return sum/amt;
   }
   public double avgWeight(){
      double sum = 0;
      for(int i = 0; i < amt; i++){
         sum += (double) weight[i];
      }
      return sum/amt;
   }
   public double avgNiceness(){
      double sum = 0;
      for(int i = 0; i < amt; i++){
         sum += (double) niceness[i];
      }
      return sum/amt;
   }
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
               if(line > 0){
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
}