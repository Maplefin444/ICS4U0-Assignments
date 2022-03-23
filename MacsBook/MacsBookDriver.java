/*
James Huynh Pradyumn Jha
Mar 7 2022
ICS4U0 Ms. Krasteva ArrayList Evaluation
This program handles the running of the MacsBook class.
*/

import java.util.*;
import java.io.*;

/**
* This class is the driver to the MacsBook class.
*/
public class MacsBookDriver{
   /**
   * The main method where everything is run.
   * @param args The command line arguments
   */
   public static void main(String[] args){
      MacsBook a = null;
      while(true){
         System.out.println("The MacsBook");
         System.out.println("1. Create new MacsBook");
         System.out.println("2. View all saved data");
         System.out.println("3. View specific student's data");
         System.out.println("4. Change specific aspects");
         System.out.println("5. Save to file");
         System.out.println("6. Calculate class average");
         System.out.println("7. Calculate student average");
         System.out.println("8. Add new student(s)");
         System.out.println("9. Exit");
         try{
            Scanner inp = new Scanner(System.in);
            String choice = inp.nextLine();
            System.out.println();
            int num = Integer.parseInt(choice);
            if(num < 1 || num > 9) throw new IllegalArgumentException();
            
            if(num == 1){
               while(true){
                  try{
                     System.out.println("1. Read from file");
                     System.out.println("2. Create new");
                     System.out.println("3. Back");
                     choice = inp.nextLine();
                     num = Integer.parseInt(choice);
                     if(num < 1 || num > 3) throw new IllegalArgumentException();
                     
                     if(num == 1){
                        BufferedReader re = new BufferedReader(new FileReader("data.txt"));
                        boolean bad = false;
                        int length = 0;
                        while(true){
                           try{
                              String line = re.readLine();
                              if(line == null) 
                                 break;
                              String[] data = line.split(" ");
                              if(data[0].equals("")){
                                 bad = true;
                                 break;
                              }
                              if(data[1].length() != 9){
                                 bad = true;
                                 break;
                              }
                              if(Integer.parseInt(data[2]) < 0 || Integer.parseInt(data[2]) > 200){
                                 bad = true;
                                 break;
                              }
                              if(Integer.parseInt(data[3]) < 0 || Integer.parseInt(data[3]) > 200){
                                 bad = true;
                                 break;
                              }
                              if(Integer.parseInt(data[4]) < 0 || Integer.parseInt(data[4]) > 200){
                                 bad = true;
                                 break;
                              }
                              length++;
                           }
                           catch(Exception e){
                              bad = true;
                              break;
                           }
                        }
                        if(bad) System.out.println("Error reading from the file.");
                        else{
                           re = new BufferedReader(new FileReader("data.txt"));
                           a = new MacsBook();
                           for(int i = 0 ; i < length; i++){
                              String[] data = re.readLine().split(" ");
                              a.addName(data[0]);
                              a.addStudentNum(Integer.parseInt(data[1]));
                              a.addAssignment(Integer.parseInt(data[2]));
                              a.addTest(Integer.parseInt(data[3]));
                              a.addFinal(Integer.parseInt(data[4]));
                           }
                           System.out.println("Finished reading!");
                           try{Thread.sleep(2000);}
                           catch(Exception e){}
                        }
                     }
                     else if(num == 2){
                        a = new MacsBook();
                        a.initialize();
                     }
                     else if(num == 3)
                        break;
                  }
                  catch(Exception e){System.out.println("Oops! That's not a valid input!");}
               }
               try{Thread.sleep(2000);}
               catch(Exception e){}
            }
            else if(num == 2){
               if(a == null){
                  System.out.println("Create a MacsBook first!");
               }
               else{
                  for(int i = 0; i < a.getLength();i++){
                     System.out.println("Name:" + a.getName(i) + "   Student Number:" + a.getStudentNum(i) + "   Assignment Mark:" + a.getAssignment(i) + "   Test Mark:" + a.getTest(i) + "   Final Project Mark:" + a.getFinal(i));
                  }
               }
               try{Thread.sleep(2000);}
               catch(Exception e){}
            }
            else if(num == 3){
               if(a == null){
                  System.out.println("Create a MacsBook first!");
               }
               else{
                  while(true){
                     try{
                        System.out.println("1. Search by name");
                        System.out.println("2. Search by student number");
                        System.out.println("3. Back");
                        choice = inp.nextLine();
                        num = Integer.parseInt(choice);
                        if(num < 1 || num > 3) throw new IllegalArgumentException();
                        
                        if(num == 1){
                           System.out.print("Enter the name you want to search for: ");
                           String name = inp.nextLine();
                           for(int i = 0; i < a.getLength();i++){
                              if(a.getName(i).equals(name)) System.out.println("Name:" + a.getName(i) + "   Student Number:" + a.getStudentNum(i) + "   Assignment Mark:" + a.getAssignment(i) + "   Test Mark:" + a.getTest(i) + "   Final Project Mark:" + a.getFinal(i));
                           }
                        }
                        
                        if(num == 2){
                           while(true){
                              try{
                                 System.out.print("Enter the student number you want to search for: ");
                                 String line = inp.nextLine();
                                 int stnum = Integer.parseInt(line);
                                 for(int i = 0; i < a.getLength();i++){
                                    if(a.getStudentNum(i) == stnum) System.out.println("Name:" + a.getName(i) + "   Student Number:" + a.getStudentNum(i) + "   Assignment Mark:" + a.getAssignment(i) + "   Test Mark:" + a.getTest(i) + "   Final Project Mark:" + a.getFinal(i));
                                 }
                                 break;
                              }
                              catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                           }
                        } 
                        
                        if(num == 3) 
                           break;
                        
                     }
                     catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                  }
               }
               try{Thread.sleep(2000);}
               catch(Exception e){}
            }
            else if(num == 4){
               if(a == null) System.out.println("Create a MacsBook first!");
               else{
                  while(true){
                     System.out.println("1. Edit name");
                     System.out.println("2. Edit student number");
                     System.out.println("3. Edit assignment mark");
                     System.out.println("4. Edit test mark");
                     System.out.println("5. Edit final project mark");
                     System.out.println("6. Back");
                     int nu = 0;
                     try{
                        nu = Integer.parseInt(inp.nextLine());
                        if(nu < 1 || nu > 6) throw new IllegalArgumentException();
                     }
                     catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                     if(nu == 6) 
                        break;
                     int pl = 0;
                     while(true){
                        try{
                           System.out.println("There are currently " + a.getLength() + " student(s) in the system.");
                           System.out.print("Enter which student you want to edit: ");
                           pl = Integer.parseInt(inp.nextLine());
                           if(pl < 1 || pl > a.getLength()) throw new IllegalArgumentException();
                           break;
                        }
                        catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                     
                     }
                     while(true){
                        if(nu == 1) System.out.print("Enter the new name: ");
                        if(nu == 2) System.out.print("Enter the new student number: ");
                        if(nu == 3) System.out.print("Enter the new assignment mark: ");
                        if(nu == 4) System.out.print("Enter the new test mark: ");
                        if(nu == 5) System.out.print("Enter the new final project mark: ");
                        
                        
                        if(nu == 1){
                           try{
                              String line = inp.nextLine();
                              if(line.equals("")) throw new IllegalArgumentException();
                              a.setName(pl-1, line);
                              break;
                           }
                           catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                        }
                        else if(nu == 2){
                           try{
                              int line = Integer.parseInt(inp.nextLine());
                              if(Integer.toString(line).length() != 9) throw new IllegalArgumentException();
                              a.setStudentNum(pl-1, line);
                              break;
                           }
                           catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                        }
                        
                        else if(nu == 3){
                           try{
                              int line = Integer.parseInt(inp.nextLine());
                              if(line < 0 || line > 200) throw new IllegalArgumentException();
                              a.setAssignment(pl-1, line);
                              break;
                           }
                           catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                        }
                        
                        else if(nu == 4){
                           try{
                              int line = Integer.parseInt(inp.nextLine());
                              if(line < 0 || line > 200) throw new IllegalArgumentException();
                              a.setTest(pl-1, line);
                              break;
                           }
                           catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                        }
                        
                        else if(nu == 5){
                           try{
                              int line = Integer.parseInt(inp.nextLine());
                              if(line < 0 || line > 200) throw new IllegalArgumentException();
                              a.setFinal(pl-1, line);
                              break;
                           }
                           catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                        }
                     }
                     break;
                  }
                  
               }
               
               try{Thread.sleep(2000);}
               catch(Exception e){}
            }
            else if(num == 5){ 
               if(a == null){
                  System.out.println("Create a MacsBook first!");
               }
               else{
                  PrintWriter wr = new PrintWriter(new FileWriter("data.txt"));
                  for(int i = 0; i < a.getLength();i++){
                     wr.println(a.getName(i) + " " + a.getStudentNum(i) + " " + a.getAssignment(i) + " " + a.getTest(i) + " " + a.getFinal(i));
                  }
                  wr.close();
                  System.out.println("Saved!");
               }
            }
            else if(num == 6){
               if(a == null) System.out.println("Create a MacsBook first!");
               else{
                  System.out.printf("The assignment average is: %.2f\n", a.avgAssignment());
                  
                  System.out.printf("The test average is: %.2f\n", a.avgTest());
                  System.out.printf("The final project average is: %.2f\n", a.avgFinal());
                  System.out.printf("The class average is: %.2f\n", a.classAvg());
               }
               try{Thread.sleep(2000);}
               catch(Exception e){}
            }
            else if(num == 7){
               if(a == null){
                  System.out.println("Create a MacsBook first!");
               }
               else{
                  while(true){
                     try{
                        System.out.println("There are currently " + a.getLength() + " student(s) in the system.");
                        System.out.print("Enter which student average you want to view: ");
                        int pl = Integer.parseInt(inp.nextLine());
                        if(pl < 1 || pl > a.getLength()) throw new IllegalArgumentException();
                        System.out.println("The student's current average is: " + a.avgMark(pl));
                        break;
                     }
                     catch(Exception e){System.out.println("Oops! That's not a valid input!");}
                  }
               }
               try{Thread.sleep(2000);}
               catch(Exception e){}
            }
            else if(num == 8){
               if(a == null){
                  System.out.println("Create a MacsBook first!");
               }
               else{
                  a.initialize();
               }
               try{Thread.sleep(2000);}
               catch(Exception e){}
            }
            else if(num == 9) 
               break;
         }
         catch(Exception e){
            System.out.println("Oops! That's not a valid input!");
            try{Thread.sleep(2000);}
            catch(Exception b){}}
      }
      System.out.println("Thank you for using the MacsBook system.");
   }
}