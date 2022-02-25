import java.util.*;
import java.io.*;
public class CatDatabaseDriver2D{
   public static void main(String[] args){
      CatDatabase2D a = null;
      Scanner in = new Scanner(System.in);
      while(true){
         int num = 0;
         System.out.println();
         System.out.println("The Cat Database");
         System.out.println("Enter the number to go to the specific menu.");
         System.out.println("1. New Database");
         System.out.println("2. Search Current Database");
         System.out.println("3. Read Database From File");
         System.out.println("4. Tools");
         System.out.println("5. Print all cats");
         System.out.println("6. Save Database");
         System.out.println("7. Exit");
         try{
            num = Integer.parseInt(in.nextLine());
            if(num < 1 || num > 7) throw new IllegalArgumentException();
            if(num == 1){
               int amt = 0;
               while(true){
                  System.out.print("Enter the amount of cats you intend to store: ");
                  try{
                     amt = Integer.parseInt(in.nextLine());
                     if(amt <= 0) throw new IllegalArgumentException();
                     break;
                  }
                  catch(Exception e){
                     System.out.println("That's not a valid input! Try again!");
                  }
               }
               a = new CatDatabase2D(amt);
               a.initialize();
            }
         
            if(num == 2){
               if(a != null){
                  while(true){
                     int schoice = 0;
                     System.out.println("Search Tools");
                     System.out.println("1. Search using cat name");
                     System.out.println("2. Search using cat breed");
                     System.out.println("3. Back");
                     try{
                        schoice = Integer.parseInt(in.nextLine());
                        if(schoice < 1 || schoice > 4) throw new IllegalArgumentException();
                        if(schoice == 1){
                           System.out.println("Enter the name of the cat(s) you want to find: ");
                           String cat = in.nextLine();
                           boolean found = false;
                           System.out.println("Results: ");
                           for(int i = 0; i < a.amt; i++){
                              if(a.getName(i).equalsIgnoreCase(cat)){
                                 found = true;
                                 System.out.println("Name: " + a.getName(i) + " Breed: " + a.getBreed(i) + " Age: " + a.getAge(i) + " Weight: " + a.getWeight(i) + " niceness: " + a.getNiceness(i));
                              }
                           }
                           if(!found){
                              System.out.println("No results were found.");
                           }
                        }
                        if(schoice == 2){
                           System.out.println("Enter the breed of the cat(s) you want to find: ");
                           String cat = in.nextLine();
                           boolean found = false;
                           System.out.println("Results: ");
                           for(int i = 0; i < a.amt; i++){
                              if(a.getBreed(i).equalsIgnoreCase(cat)){
                                 found = true;
                                 System.out.println("Name: " + a.getName(i) + " Breed: " + a.getBreed(i) + " Age: " + a.getAge(i) + " Weight: " + a.getWeight(i) + " niceness: " + a.getNiceness(i));
                              }
                           }
                           if(!found){
                              System.out.println("No results were found.");
                           }
                        }
                        if(schoice == 3){
                           break;
                        }
                     }
                     catch(Exception e){
                        System.out.println("That's not a valid input! Try again!");
                     }
                  
                  }
               }
               else{
                  System.out.println("Create a database first!");
               }
            }
         
            if(num == 3){
               BufferedReader input = new BufferedReader(new FileReader("data.txt"));
               int length = 0;
               while(true){
                  try{
                     String line = input.readLine();
                     if(line == null) 
                        break;
                     else length++;
                  }
                  catch(Exception e){
                  }
               }
               input.close();
               input = new BufferedReader(new FileReader("data.txt"));
               a = new CatDatabase2D(length);
               for(int i = 0; i < length; i ++){
                  try{
                     String[] inp = input.readLine().split(" ");
                     if(inp[0].equals("") || inp[1].equals("") || inp[0] == null || inp[1] == null){
                        System.out.println("There was error reading line #" + i + " from the file.");
                        continue;
                     }
                     a.setName(inp[0], i);
                     a.setBreed(inp[1], i);
                     Integer.parseInt(inp[2]);
                     Double.parseDouble(inp[3]);
                     Integer.parseInt(inp[4]);
                     a.setAge(Integer.parseInt(inp[2]), i);
                     a.setWeight(Double.parseDouble(inp[3]), i);
                     a.setNiceness(Integer.parseInt(inp[4]), i);
                  }
                  catch(Exception e){
                     System.out.println("There was error reading line #" + i + " from the file.");
                     continue;
                  }
               }
               input.close();
               System.out.println("Finished reading.");
            }
         
            if(num == 4){
               if(a != null){
                  while(true){
                     int tchoice = 0;
                     System.out.println("Cat Database Tools");
                     System.out.println("1. Get Average Age");
                     System.out.println("2. Get Average Weight");
                     System.out.println("3. Get Average Niceness");
                     System.out.println("4. Back");
                     try{
                        tchoice = Integer.parseInt(in.nextLine());
                        if(tchoice < 1 || tchoice > 4) throw new IllegalArgumentException();
                        if(tchoice == 1){
                           System.out.println("The average age of the cats is: " + a.avgAge());
                        }
                        if(tchoice == 2){
                           System.out.println("The average weight of the cats is: " + a.avgWeight());
                        }
                        if(tchoice == 3){
                           System.out.println("The average niceness of the cats is: " + a.avgNiceness());
                        }
                        if(tchoice == 4){
                           break;
                        }
                     }
                     catch(Exception e){
                        System.out.println("That's not a valid input! Try again!");
                     }
                  
                  }
               }
               else{
                  System.out.println("Create a database first!");
               }
            }
            if(num == 5){
               if(a != null){
                  for(int i = 0; i < a.amt; i++){
                     System.out.println("Name: " + a.getName(i) + " Breed: " + a.getBreed(i) + " Age: " + a.getAge(i) + " Weight: " + a.getWeight(i) + " niceness: " + a.getNiceness(i));
                  }
               }
               else{
                  System.out.println("Create a database first!");
               }
            }
            if(num == 6){
               if(a != null){
                  a.writeToFile();
                  System.out.println("Database successfully saved.");
               }
               else{
                  System.out.println("Create a database first!");
               }
            }
            if(num == 7){
               System.out.println("Thank you for using the Cat Database.");
               break;
            }
         }
         catch(Exception e){
            System.out.println("That's not a valid input! Try again!");
         }
      }
   }
}