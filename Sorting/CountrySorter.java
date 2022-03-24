
// imports
import java.util.*;

/**
* CountrySorter provides various methods for processing a list of countries, including sorting by the country name, sorting by country population, and writing countries to a file.
*/
public class CountrySorter{
   /**
   * The name of the country
   */
   private ArrayList<String> countryName;
   /**
   * The name of the capital
   */
   private ArrayList<String> capital;
   /**
   * the land area of the country
   */
   private ArrayList<Integer> area;
   /**
   * The population of the country
   */
   private ArrayList<Integer> population;
   
   /**
   * This method internally sorts the 4 parallel arraylists for the list of countries using a mergesort algorithm
   * @param l this is used for the recursive mergesort - the left bound of the segment this method call will sort
   * @param r this is used for the recursive mergesort - the right bound of the segment this method call will sort
   */
   private void sortByPopulation(int l, int r){
      // if the length of the segment is 1, then no changes are needed
      if(l == r) return;
      
      // temporary arrays for the country, capital, area, and population, which will later be copied into the original
      ArrayList<String> countTmp = new ArrayList<String>();
      ArrayList<String> capTmp = new ArrayList<String>();
      ArrayList<Integer> areaTmp = new ArrayList<Integer>();
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
   * This method internally sorts all of the countries by their population
   */
   public void sortByPopulation(){
      sortByPopulation(0, countryName.size() - 1);
   }
}