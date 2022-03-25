/*
* Programmers: Pradyumn Jha, Jamues Huynh, Daniel Ye
* Teacher: Ms. Krasteva
* Date: March 25, 2022
* Description: Run by CountrySorterDriver.java, this class reads in countries from a file, sorts them, and prints them out again.
*/

// imports
import java.util.*;
import java.text.*;
import java.io.*;

/**
* CountrySorter provides various methods for processing a list of countries, including sorting by the country name, sorting by country population, and writing countries to a file.
*/
public class CountrySorter{
   /**
   * The name of the country
   */
   private ArrayList<String> countryName = new ArrayList<String>();
   /**
   * The name of the capital
   */
   private ArrayList<String> capital = new ArrayList<String>();
   /**
   * the land area of the country
   */
   private ArrayList<Double> area = new ArrayList<Double>();
   /**
   * The population of the country
   */
   private ArrayList<Integer> population = new ArrayList<Integer>();
   
   /**
   * This method reads a list of countries and parses the data from Countries-Population.txt into the 4 internal parallel arraylists. 
   */
   public void readFile(){
      // these two lines handle exceptions where there are more than 4 words in a line - in this case, we cannot poinpoint the number of words that belong to the country or city
      // for any i, lines[i] is the line for which the number of words in the country is not clear. wordamt[i] is the number of words that belong to the country in line number line[i]
      int[] lines = {50,53,54,57,67,68,76,89,90,91,105,109,111,112,116,120,125,133, 3, 5, 6, 15, 20, 21,24,26,28,31,32,33,37,38,39,40,41,45,49, 134, 144, 145, 146, 148, 149, 150, 154, 158, 160, 162, 175, 181, 182, 183, 184, 188, 191};
      int[] wordamt = {2,2,2,1,1,1,1,2,2,1,1,2,1,1,1,2,2,1,1,3,1,1,1,3,1,2,1,2,3,1,1,3,5,2,2,2,2, 3, 4, 2, 5, 2, 4, 2, 2, 2, 2, 2, 3, 1, 2, 2, 2, 2, 2};
      
      try{
         // initialize a reader for the default input file
         BufferedReader br = new BufferedReader(new FileReader("Countries-Population.txt"));
         
         // the current line number
         int count = 0;
         
         while(true){
            // get the next line
            String a = br.readLine();
            
            // if we reached the end of the file, break
            if(a == null) 
               break;
              
            // split the line
            String[] line = a.split(" ");
            
            // with 4 words, the data is unambiguous: "[countryName] [city name] [area] [population]"
            if(line.length == 4){
               countryName.add(line[0]);
               capital.add(line[1]);
               area.add(Double.parseDouble(line[2].replaceAll(",","")));
               population.add(Integer.parseInt(line[3].replaceAll(",","")));
            }
            
            // search through our exceptions
            for(int i = 0 ; i < lines.length; i++){
               // if the lines coincide
               if(count == lines[i]){
                  // country name
                  String cname = "";
                  // the first wordamt[i] words are part of the country; add each word joined by a space
                  for(int j = 0; j < wordamt[i];j++){
                     if(j == wordamt[i]-1){
                        cname += line[j];
                     }
                     else{
                        cname += line[j] + " ";
                     }
                  }
                  
                  // capital name
                  String capname = "";
                  // of the remaining line, 2 are for area and population, the rest are for capital
                  // add the remaining words, joined by a space
                  for(int j = 0 ; j < line.length - wordamt[i] - 2;j++){
                     if(j == line.length - wordamt[i] - 3){
                        capname += line[j+wordamt[i]];
                     }
                     else{
                        capname += line[j+wordamt[i]] + " ";
                     }
                  }
                  
                  // add each name, trimming their spaces
                  countryName.add(cname.trim());
                  capital.add(capname.trim());
                  // parse the area and population, replacing commas with blanks to make it easier to parse
                  area.add(Double.parseDouble(line[line.length-2].replaceAll(",","")));
                  population.add(Integer.parseInt(line[line.length-1].replaceAll(",","")));
               }
            }
            // update the current line
            count++;
         }
      }
      catch(Exception e){
         // catch errors
         e.printStackTrace();
      }
   }
   /**
   * This method internally sorts the 4 parallel arraylists for the list of countries using a mergesort algorithm
   * @param l this is used for the recursive mergesort - the left bound of the segment this method call will sort
   * @param r this is used for the recursive mergesort - the right bound of the segment this method call will sort
   */
   private void sortByPopulation(int l, int r){
      // if the length of the segment is 1, then no changes are needed
      if(l == r) 
         return;
      
      
      // temporary arrays for the country, capital, area, and population, which will later be copied into the original
      ArrayList<String> countTmp = new ArrayList<String>();
      ArrayList<String> capTmp = new ArrayList<String>();
      ArrayList<Double> areaTmp = new ArrayList<Double>();
      ArrayList<Integer> popTmp = new ArrayList<Integer>();
      
      // calculate the middle and recursively sort both halves (instance variables are updated)
      int mid = (l + r) / 2;
      sortByPopulation(l, mid);
      sortByPopulation(mid + 1, r);
      
      // maintain pointers for the "beginning" of the two arrays - this makes deleting as simple as incrementing one of the pointers
      int lefP=l, rigP=mid + 1;
      
      // add the [r-l+1] elements in sorted order
      while(countTmp.size() < r - l + 1){
         // if the left pointer goes beyond mid (meaning that the left list is empty), or the right list is not empty and the first value in the right list is < the first value in the left list
         if(lefP > mid || (rigP <= r && population.get(rigP) < population.get(lefP))){
            // then add the current element to our temporary countries lists
            countTmp.add(countryName.get(rigP));
            capTmp.add(capital.get(rigP));
            areaTmp.add(area.get(rigP));
            popTmp.add(population.get(rigP));
            
            // remove the element in the right list (equivalent to incrementing the pointer)
            ++rigP;
         } else {
            // otherwise, we add the first element in the left list to the temporary countries list
            countTmp.add(countryName.get(lefP));
            capTmp.add(capital.get(lefP));
            areaTmp.add(area.get(lefP));
            popTmp.add(population.get(lefP));
            
            // remove the element in the left list (equal to incrementing the pointer)
            ++lefP;
         }
      }
      
      // replace each element in the range [l, r] with their corresponding element in the temporary lists
      for(int i = 0; i < r - l + 1; ++i){
         countryName.set(l + i, countTmp.get(i));
         capital.set(l + i, capTmp.get(i));
         area.set(l + i, areaTmp.get(i));
         population.set(l + i, popTmp.get(i));
      }
   }
   
   /**
   * This method prints the countries stored in this object to a file. Each country will be stored as "[countryName]\t\t\t[population]"
   * @param fileName the name of the file to write the countries to
   * @return true if the write was successful, and false otherwise.
   */
   public boolean printToFile(String fileName){
      // tool to format an integer, using commas to split every group of 3 digits
      NumberFormat formatter = NumberFormat.getIntegerInstance();
      try{
         // declare a printwriter
         PrintWriter pw = new PrintWriter(new FileWriter(fileName));
         
         // print out each country
         for(int i = 0; i < countryName.size(); i++){
            String out = "";
            out += countryName.get(i);
            int temp = 44 - countryName.get(i).length();
            for(int j = 0 ; j < temp/3;j++){
               out += "\t";
            }
            out += formatter.format(population.get(i));
            pw.println(out);
         }
         
         // close the printwriter
         pw.close();
         
         // return true as write was successful
         return true;
      } catch (IOException e){
         // return false as something went wrong
         return false;
      }
   }
   
   /**
   * This method internally sorts all of the countries by their population
   */
   public void sortByPopulation(){
      sortByPopulation(0, countryName.size() - 1);
   }
   
   /**
   * This method internally sorts the lists by their country name, lexicographically increasing
   */
   public void sortByCountry(){
      // the number of countries
      int len = countryName.size();
      
      // run a selection sort
      for(int i = 0; i < len - 1; i++){
         // the index of the country with the "smallest" name, loop through all values after i, storing the minimum in mIndex
         int mIndex = i;
         for(int j = i + 1; j < len; j++){
            if(countryName.get(j).compareToIgnoreCase(countryName.get(mIndex)) < 0){
               mIndex = j;
            }
         }
         
         // swap i and mIndex
         // temporary variables for mIndex
         String cTmp = countryName.get(mIndex);
         String caTmp = capital.get(mIndex);
         double aTmp = area.get(mIndex);
         int popTmp = population.get(mIndex);
         
         // set the country at mIndex to the country at i
         countryName.set(mIndex, countryName.get(i));
         capital.set(mIndex, capital.get(i));
         area.set(mIndex, area.get(i));
         population.set(mIndex, population.get(i));
         
         // set the country at i to the country originally at mIndex
         countryName.set(i, cTmp);
         capital.set(i, caTmp);
         area.set(i, aTmp);
         population.set(i, popTmp);
      }
   }
}