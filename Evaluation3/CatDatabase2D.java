import java.util.*;
import java.io.*;

public class CatDatabase2D{
   private String[][] data;
   public final int amt;
   
   public CatDatabase2D(int amt){
      this.amt = amt;
      data = new String[5][amt];
   }
   public String getName(int ind){
      if(ind >= amt || ind < 0){
         return "No such index!";
      }
      return data[0][ind];
   }
   public String getBreed(int ind){
      if(ind >= amt || ind < 0){
         return "No such index!";
      }
      return data[1][ind];
   }
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
   
   
   public void setName(String in, int ind){
      if(ind < amt && ind >= 0){
         data[0][ind] = in;
      }
   }
   public void setBreed(String in, int ind){
      if(ind < amt && ind >= 0){
         data[1][ind] = in;
      }
   }
   public void setAge(int in, int ind){
      if(ind < amt && ind >= 0){
         data[2][ind] = Integer.toString(in);
      }
   }
   public void setWeight(double in, int ind){
      if(ind < amt && ind >= 0){
         data[3][ind] = Double.toString(in);
      }
   }
   public void setNiceness(int in, int ind){
      if(ind < amt && ind >= 0){
         data[4][ind] = Integer.toString(in);
      }
   }
   
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
               if(line > 0){
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
}