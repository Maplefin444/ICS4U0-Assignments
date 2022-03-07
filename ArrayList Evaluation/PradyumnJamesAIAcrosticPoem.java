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
   
   //The Random class used to generate random values was retrieved from https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
   public void poemGenerator()
   {
      ArrayList<String> letterA = new ArrayList<String>();
      letterA.add("Audacious");
      letterA.add("Ace");
      letterA.add("Adroit");
      letterA.add("Aquatic");
      letterA.add("Adaptable");
      
      ArrayList<String> letterB = new ArrayList<String>();
      letterB.add("Bold");
      letterB.add("Bedazzling");
      letterB.add("Benevolent");
      letterB.add("Blue");
      letterB.add("Brave");
      
      ArrayList<String> letterC = new ArrayList<String>();
      letterC.add("Charming");
      letterC.add("Collected");
      letterC.add("Candid");
      letterC.add("Courageous");
      letterC.add("Clever");
            
      ArrayList<String> letterD = new ArrayList<String>();
      letterD.add("Dapper");
      letterD.add("Daring");
      letterD.add("Dynamic");
      letterD.add("Dependent");
      letterD.add("Dangerous");
      
      ArrayList<String> letterE = new ArrayList<String>();
      letterE.add("Earnest");
      letterE.add("Efficacious");
      letterE.add("Elated");
      letterE.add("Eager");
      letterE.add("Excited");
      
      ArrayList<String> letterF = new ArrayList<String>();
      letterF.add("Factual");
      letterF.add("Fabulous");
      letterF.add("Fantastic");
      letterF.add("Fierce");
      letterF.add("Festive");
      
      ArrayList<String> letterG = new ArrayList<String>();
      letterG.add("Gallant");
      letterG.add("Game-changing");
      letterG.add("Generous");
      letterG.add("Golden");
      letterG.add("Glistening");
      
      ArrayList<String> letterH = new ArrayList<String>();
      letterH.add("Honorable");
      letterH.add("Hard-working");
      letterH.add("Humble");
      letterH.add("Honest");
      letterH.add("Hypnotic");
      
      ArrayList<String> letterI = new ArrayList<String>();
      letterI.add("Industrious");
      letterI.add("Idyllic");
      letterI.add("Illustrious");
      letterI.add("Imported");
      letterI.add("Impressive");
      
      ArrayList<String> letterJ = new ArrayList<String>();
      letterJ.add("Jovial");
      letterJ.add("Joy");
      letterJ.add("Jubilant");
      letterJ.add("Jumbled");
      letterJ.add("Judicious");
      
      ArrayList<String> letterK = new ArrayList<String>();
      letterK.add("Kind");
      letterK.add("Keen");
      letterK.add("Key");
      letterK.add("Kindhearted");
      letterK.add("Keen");
   
      ArrayList<String> letterL = new ArrayList<String>();
      letterL.add("Lavish");
      letterL.add("Loyal");
      letterL.add("Lustrous");
      letterL.add("Living");
      letterL.add("Logical");
      
      ArrayList<String> letterM = new ArrayList<String>();
      letterM.add("Magnanimous");
      letterM.add("Magnificent");
      letterM.add("Mellow");
      letterM.add("Mute");
      letterM.add("Mysterious");
      
      ArrayList<String> letterN = new ArrayList<String>();
      letterN.add("Noble");
      letterN.add("Natural");
      letterN.add("Nice");
      letterN.add("Nebulous");
      letterN.add("Nifty");
         
      ArrayList<String> letterO = new ArrayList<String>();
      letterO.add("Omniscient");
      letterO.add("Optimistic");
      letterO.add("Optimum");
      letterO.add("Omniscient");
      letterO.add("Ordinary");
      
      ArrayList<String> letterP = new ArrayList<String>();
      letterP.add("Patient");
      letterP.add("Philanthropic");
      letterP.add("Peaceful");
      letterP.add("Prosperous");
      letterP.add("Perfect");
      
      ArrayList<String> letterQ = new ArrayList<String>();
      letterQ.add("Qualified");
      letterQ.add("Quintessential");
      letterQ.add("Quaint");
      letterQ.add("Quizzical");
      letterQ.add("Quixotic");
      
      ArrayList<String> letterR = new ArrayList<String>();
      letterR.add("Rad");
      letterR.add("Radiant");
      letterR.add("Resourceful");
      letterR.add("Rumbling");
      letterR.add("Round");
      
      ArrayList<String> letterS = new ArrayList<String>();
      letterS.add("Safe");
      letterS.add("Simple");
      letterS.add("Sincere");
      letterS.add("Spotless");
      letterS.add("Super");
      
      ArrayList<String> letterT = new ArrayList<String>();
      letterT.add("Tactful");
      letterT.add("Talented");
      letterT.add("Tenacious");
      letterT.add("True");
      letterT.add("Thankful");
      
      ArrayList<String> letterU = new ArrayList<String>();
      letterU.add("Ultimate");
      letterU.add("Upbeat");
      letterU.add("Ubiquitous");
      letterU.add("Useful");
      letterU.add("Unusual");
      
      ArrayList<String> letterV = new ArrayList<String>();
      letterV.add("Valiant");
      letterV.add("valorous");
      letterV.add("Valiant");
      letterV.add("Vague");
      letterV.add("Valuable");
      
      ArrayList<String> letterW = new ArrayList<String>();
      letterW.add("Wonderful");
      letterW.add("Well");
      letterW.add("Winning");
      letterW.add("Windy");
      letterW.add("Wacky");
      
      ArrayList<String> letterX = new ArrayList<String>();
      letterX.add("Xenial");
      letterX.add("X-factor");
      letterX.add("Xenon");
      letterX.add("Xerographically");
      letterX.add("Xylographical");
      
      ArrayList<String> letterY = new ArrayList<String>();
      letterY.add("Youthful");
      letterY.add("Yummy");
      letterY.add("Young");
      letterY.add("Yielding");
      letterY.add("Yellow");
      
      ArrayList<String> letterZ = new ArrayList<String>();
      letterZ.add("Zealful");
      letterZ.add("Zazzy");
      letterZ.add("Zappy");
      letterZ.add("Zoogeographical");
      letterZ.add("Zooplankton");
   
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the word you'd like to make an acrostic poem out of: ");
      String line = sc.nextLine();
      line = line.toLowerCase();
      System.out.println();
      for(int i = 0; i < line.length();i++){
         Random a = new Random();
         char ch = line.charAt(i);
         if(ch == 'a') System.out.println(letterA.get(a.nextInt(letterA.size())));
         else if(ch == 'b') System.out.println(letterB.get(a.nextInt(letterB.size())));
         else if(ch == 'c') System.out.println(letterC.get(a.nextInt(letterC.size())));
         else if(ch == 'd') System.out.println(letterD.get(a.nextInt(letterD.size())));
         else if(ch == 'e') System.out.println(letterE.get(a.nextInt(letterE.size())));
         else if(ch == 'f') System.out.println(letterF.get(a.nextInt(letterF.size())));
         else if(ch == 'g') System.out.println(letterG.get(a.nextInt(letterG.size())));
         else if(ch == 'h') System.out.println(letterH.get(a.nextInt(letterH.size())));
         else if(ch == 'i') System.out.println(letterI.get(a.nextInt(letterI.size())));
         else if(ch == 'j') System.out.println(letterJ.get(a.nextInt(letterJ.size())));
         else if(ch == 'k') System.out.println(letterK.get(a.nextInt(letterK.size())));
         else if(ch == 'l') System.out.println(letterL.get(a.nextInt(letterL.size())));
         else if(ch == 'm') System.out.println(letterM.get(a.nextInt(letterM.size())));
         else if(ch == 'n') System.out.println(letterN.get(a.nextInt(letterN.size())));
         else if(ch == 'o') System.out.println(letterO.get(a.nextInt(letterO.size())));
         else if(ch == 'p') System.out.println(letterP.get(a.nextInt(letterP.size())));
         else if(ch == 'q') System.out.println(letterQ.get(a.nextInt(letterQ.size())));
         else if(ch == 'r') System.out.println(letterR.get(a.nextInt(letterR.size())));
         else if(ch == 's') System.out.println(letterS.get(a.nextInt(letterS.size())));
         else if(ch == 't') System.out.println(letterT.get(a.nextInt(letterT.size())));
         else if(ch == 'u') System.out.println(letterU.get(a.nextInt(letterU.size())));
         else if(ch == 'v') System.out.println(letterV.get(a.nextInt(letterV.size())));
         else if(ch == 'w') System.out.println(letterW.get(a.nextInt(letterW.size())));
         else if(ch == 'x') System.out.println(letterX.get(a.nextInt(letterX.size())));
         else if(ch == 'y') System.out.println(letterY.get(a.nextInt(letterY.size())));
         else if(ch == 'z') System.out.println(letterZ.get(a.nextInt(letterZ.size())));
      }      
      
   
   }  
   public static void main(String[] args){   
      PradyumnJamesAIAcrosticPoem a = new PradyumnJamesAIAcrosticPoem();
      a.poemGenerator();
   }
} // PradyumnJamesAIAcrosticPoem class
