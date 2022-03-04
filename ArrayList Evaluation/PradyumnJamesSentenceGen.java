/*
   Programmers: Pradyumn Jha and James Huynh
   Teacher: Ms. Krasteva
   Date: March 2nd, 2022 (2022-03-02)
   Purpose: This program will randomly generate a sentence
 */

// Import statements
import java.util.ArrayList;

// The "PradyumnJamesSentenceGen" class.
public class PradyumnJamesSentenceGen
{

   // This method has Array Lists for word categories and assembles five sentences using random indices for each construct of language
   public void sentenceGenerator()
   {
      
      ArrayList<String> articles = new ArrayList<String>(); // Array List for articles
      articles.add("a");
      articles.add("an");
      articles.add("the");
      
      ArrayList<String> nouns = new ArrayList<String>(); // Array List for nouns
      nouns.add("one");
      nouns.add("someone");
      nouns.add("anyone");
      nouns.add("boy");
      nouns.add("girl");
      nouns.add("car");
      nouns.add("bridge");
      
      ArrayList<String> verbs = new ArrayList<String>(); // Array List for verbs
      verbs.add("jump");
      verbs.add("scatter");
      verbs.add("fly");
      verbs.add("sleep");
      verbs.add("walk");
      
      ArrayList<String> prepositions = new ArrayList<String>(); // Array List for prepositions
      prepositions.add("at");
      prepositions.add("by");
      prepositions.add("for");
      prepositions.add("from");
      prepositions.add("in");
      prepositions.add("of");
      prepositions.add("on");
      prepositions.add("to");
      prepositions.add("with");
      prepositions.add("about");
      prepositions.add("above");
      prepositions.add("across");
      prepositions.add("after");
      prepositions.add("against");
      prepositions.add("along");
      prepositions.add("among");
      prepositions.add("around");
      prepositions.add("because of");
      prepositions.add("before");
      prepositions.add("behind");
      prepositions.add("below");
      prepositions.add("beneath");
      prepositions.add("beside");
      prepositions.add("between");
      prepositions.add("close to");
      prepositions.add("down");
      prepositions.add("during");
      prepositions.add("excecpt");
      prepositions.add("inside");
      prepositions.add("instead of");
      prepositions.add("into");
      prepositions.add("like");
      prepositions.add("near");
      prepositions.add("off");
      prepositions.add("on top of");
      prepositions.add("onto");
      prepositions.add("out of");
      prepositions.add("outside");
      prepositions.add("over");
      prepositions.add("past");
      prepositions.add("since");
      prepositions.add("through");
      prepositions.add("toward");
      prepositions.add("under");
      prepositions.add("until");
      prepositions.add("up");
      prepositions.add("upon");
      prepositions.add("within");
      prepositions.add("without");
     
      ArrayList<String> adverbs = new ArrayList<String>(); // Array List for adverbs
      adverbs.add("happily");
      adverbs.add("briefly");
      adverbs.add("merrily");
      adverbs.add("unnecessarily");
      adverbs.add("boldly");
      
      ArrayList<String> adjectives = new ArrayList<String>(); // Array List for adjectives
      adjectives.add("beautiful");
      adjectives.add("merciful");
      adjectives.add("grown");
      
      // For-loop to print five randomly generated sentences
      for(int i = 0; i < 5; i++)
      {
         String bword = articles.get((int)(Math.random() * 3));
         bword = bword.substring(0,1).toUpperCase() + bword.substring(1);
         System.out.print(bword + " ");
         System.out.print(adjectives.get((int)(Math.random() * 3)) + " ");
         System.out.print(nouns.get((int)(Math.random() * 7)) + " ");
         System.out.print(adverbs.get((int)(Math.random() * 5)) + " ");
         System.out.print(verbs.get((int)(Math.random() * 5)) + " ");
         System.out.print(prepositions.get((int)(Math.random() * 49)) + " ");
         System.out.print(articles.get((int)(Math.random() * 3)) + " ");
         System.out.print(adjectives.get((int)(Math.random() * 3)) + " ");
         System.out.println(nouns.get((int)(Math.random() * 7)) + ".");
      }
   }
} // PradyumnJamesSentenceGen class