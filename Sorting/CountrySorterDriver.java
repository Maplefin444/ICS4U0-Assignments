/*
* Programmers: Pradyumn Jha, Jamues Huynh, Daniel Ye
* Teacher: Ms. Krasteva
* Date: March 25, 2022
* Description: This is a driver for the countrySorter class, which reads countries from a file and outputs them onto another file after sorting by population and country.
*/

public class CountrySorterDriver{
   public static void main(String[] args){
      // initialize the sorter & prompt it to read data from the file
      CountrySorter sorter = new CountrySorter();
      sorter.readFile();
      
      // sort by population & print out the result
      System.out.println("sorting by population... printing to sortedByPopulation.txt");
      sorter.sortByPopulation();
      sorter.printToFile("sortedByPopulation.txt");
      
      // sort by country name & print the result
      System.out.println("sorting by country name... printing to sortedByCountry.txt");
      sorter.sortByCountry();
      sorter.printToFile("sortedByCountry.txt");
   }
}