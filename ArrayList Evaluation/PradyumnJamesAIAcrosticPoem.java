/*
   Programmers: Pradyumn Jha and James Huynh
   Teacher: Ms. Krasteva
   Date: March 2nd, 2022 (2022-03-02)
   Purpose: This program will generate a poem
 */
 
// Import statements
import java.util.*;

// The "PradyumnJamesAIAcrosticPoem" class.
public class PradyumnJamesAIAcrosticPoem
{
   
   
   public void poemGenerator()
   {
      Scanner sc = new Scanner(System.in);
      int numOfLetters = sc.nextInt();
      
      String[] startingLetters = new String[numOfLetters];
      
      for(int i = 0; i < numOfLetters; i++)
      {
         startingLetters[i] = sc.next();
      }
   
      ArrayList<String> letterA = new ArrayList<String>();
      letterA.add("Audacious");
      letterA.add("Ace");
      letterA.add("Adroit");
      
      ArrayList<String> letterB = new ArrayList<String>();
      letterB.add("Bold");
      letterB.add("Bedazzling");
      letterB.add("Benevolent");
      
      ArrayList<String> letterC = new ArrayList<String>();
      letterC.add("Charming");
      letterC.add("Collected");
      letterC.add("Candid");
      
      ArrayList<String> letterD = new ArrayList<String>();
      letterD.add("Dapper");
      letterD.add("Daring");
      letterD.add("Dynamic");
      
      ArrayList<String> letterE = new ArrayList<String>();
      letterE.add("Earnest");
      letterE.add("Efficacious");
      letterE.add("Elated");
      
      ArrayList<String> letterF = new ArrayList<String>();
      letterF.add("Factual");
      letterF.add("Fabulous");
      letterF.add("Fantastic");
      
      ArrayList<String> letterG = new ArrayList<String>();
      letterG.add("Gallant");
      letterG.add("Game-changing");
      letterG.add("Generous");
      
      ArrayList<String> letterH = new ArrayList<String>();
      letterH.add("Honorable");
      letterH.add("Hard-working");
      letterH.add("Humble");
      
      ArrayList<String> letterI = new ArrayList<String>();
      letterI.add("Industrious");
      letterI.add("Idyllic");
      letterI.add("Illustrious");
      
      ArrayList<String> letterJ = new ArrayList<String>();
      letterJ.add("Jovial");
      letterJ.add("Joy");
      letterJ.add("Jubilant");
      
      ArrayList<String> letterK = new ArrayList<String>();
      letterK.add("Kind");
      letterK.add("Keen");
      letterK.add("Key");
   
      ArrayList<String> letterL = new ArrayList<String>();
      letterL.add("Lavish");
      letterL.add("Loyal");
      letterL.add("Lustrous");
      
      ArrayList<String> letterM = new ArrayList<String>();
      letterM.add("Magnanimous");
      letterM.add("Magnificent");
      letterM.add("Mellow");
      
      ArrayList<String> letterN = new ArrayList<String>();
      letterN.add("Noble");
      letterN.add("Natural");
      letterN.add("Nice");
         
      ArrayList<String> letterO = new ArrayList<String>();
      letterO.add("Omniscient");
      letterO.add("Optimistic");
      letterO.add("Optimum");
      
      ArrayList<String> letterP = new ArrayList<String>();
      letterP.add("Patient");
      letterP.add("Philanthropic");
      letterP.add("Peaceful");
      
      ArrayList<String> letterQ = new ArrayList<String>();
      letterQ.add("Qualified");
      letterQ.add("Quintessential");
      
      ArrayList<String> letterR = new ArrayList<String>();
      letterR.add("Rad");
      letterR.add("Radiant");
      letterR.add("Resourceful");
      
      ArrayList<String> letterS = new ArrayList<String>();
      letterS.add("Safe");
      letterS.add("Simple");
      letterS.add("Sincere");
      
      ArrayList<String> letterT = new ArrayList<String>();
      letterT.add("Tactful");
      letterT.add("Talented");
      letterT.add("Tenacious");
      
      ArrayList<String> letterU = new ArrayList<String>();
      letterU.add("Ultimate");
      letterU.add("Upbeat");
      letterU.add("Ubiquitous");
      
      ArrayList<String> letterV = new ArrayList<String>();
      letterV.add("Valiant");
      letterV.add("valorous");
      letterV.add("Valiant");
      
      ArrayList<String> letterW = new ArrayList<String>();
      letterW.add("Wonderful");
      letterW.add("Well");
      
      ArrayList<String> letterX = new ArrayList<String>();
      letterX.add("Xenial");
      letterX.add("X-factor");
      
      ArrayList<String> letterY = new ArrayList<String>();
      letterY.add("Youthful");
      letterY.add("Yummy");
      
      ArrayList<String> letterZ = new ArrayList<String>();
      letterZ.add("Zealful");
      letterZ.add("Zazzy");
      letterZ.add("Zappy");
      
      
   
   }  
   
} // PradyumnJamesAIAcrosticPoem class