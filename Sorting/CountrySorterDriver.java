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