import java.util.*;
import java.io.*;

public class CatDatabase{
   private String[] name;
   private String[] breed;
   private int[] age;
   private double[] weight;
   private int[] length;
   public final int amt;
   
   public CatDatabase(int amt){
      this.amt = amt;
      name = new String[amt];
      breed = new String[amt];
      age = new int[amt];
      weight = new double[amt];
      length = new int[amt];
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
   public int getLength(int ind){
      if(ind >= amt){
         return -1;
      }
      return length[ind];
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
   public void setLength(int in, int ind){
      if(ind < amt){
         length[ind] = in;
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
   public double avgLength(){
      double sum = 0;
      for(int i = 0; i < amt; i++){
         sum += (double) length[i];
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
            System.out.print("Enter the length of cat #" + i + ": ");
            try{
               int line = Integer.parseInt(in.nextLine());
               if(line > 0){
                  length[i] = line;
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
            p.println(name[i] + " " + breed[i] + " " + age[i] + " " + weight[i] + " " + length[i]);
         }
         p.close();
      }
      catch(Exception e){
      }
   }
}