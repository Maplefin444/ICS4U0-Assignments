
import java.util.*;

public class CountrySorter{
   ArrayList<String> countryName;
   ArrayList<String> capital;
   ArrayList<Integer> area;
   ArrayList<Integer> population;
   
   private void sortByPopulation(int l, int r){
      if(l == r) return;
      
      ArrayList<String> countTmp = new ArrayList<String>();
      ArrayList<String> capTmp = new ArrayList<String>();
      ArrayList<Integer> areaTmp = new ArrayList<Integer>();
      ArrayList<Integer> popTmp = new ArrayList<Integer>();
      
      int mid = (l + r) / 2;
      sortByPopulation(l, mid);
      sortByPopulation(mid + 1, r);
      
      int lefP=l, rigP=mid + 1;
      while(countTmp.size() < r - l + 1){
         if(lefP > mid || (rigP <= mid && population.get(rigP) < population.get(lefP))){
            countTmp.add(countryName.get(rigP));
            capTmp.add(capital.get(rigP));
            areaTmp.add(area.get(rigP));
            popTmp.add(population.get(rigP));
            ++rigP;
         } else {
            countTmp.add(countryName.get(lefP));
            capTmp.add(capital.get(lefP));
            areaTmp.add(area.get(lefP));
            popTmp.add(population.get(lefP));
            ++lefP;
         }
      }
      
      for(int i = 0; i < r - l + 1; ++i){
         countryName.set(l + i, countTmp.get(i));
         capital.set(l + i, capTmp.get(i));
         area.set(l + i, areaTmp.get(i));
         population.set(l + i, popTmp.get(i));
      }
   }
}