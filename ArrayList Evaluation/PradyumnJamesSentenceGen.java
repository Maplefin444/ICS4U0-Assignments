/*
   Programmers: Pradyumn Jha and James Huynh
   Teacher: Ms. Krasteva
   Date: March 2nd, 2022 (2022-03-02)
   Purpose: This program will randomly generate a sentence
 */

// Import statements
import java.util.*;

// The "PradyumnJamesSentenceGen" class.
public class PradyumnJamesSentenceGen
{

   // This method has Array Lists for word categories and assembles five sentences using random indices for each construct of language
   public void sentenceGenerator()
   {
      
      ArrayList<String> articles = new ArrayList<String>(); // Array List for articles
      articles.add("a");
      articles.add("the");
      
      ArrayList<String> nouns = new ArrayList<String>(); // Array List for nouns
      nouns.add("one");
      nouns.add("someone");
      nouns.add("anyone");
      nouns.add("boy");
      nouns.add("girl");
      nouns.add("car");
      nouns.add("bridge");
      nouns.add("coal");
      nouns.add("sheep");
      nouns.add("linen");
      nouns.add("bed");
      nouns.add("horse");
      nouns.add("cow");
      nouns.add("money");
      
      ArrayList<String> verbs = new ArrayList<String>(); // Array List for verbs
      verbs.add("jump");
      verbs.add("scatter");
      verbs.add("fly");
      verbs.add("sleep");
      verbs.add("walk");
      verbs.add("talk");
      verbs.add("dance");
      verbs.add("eat");
      verbs.add("evade");
      
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
      adverbs.add("amazingly");
      adverbs.add("heavily");
      adverbs.add("unnaturally");
      adverbs.add("occasionally");
      
      ArrayList<String> adjectives = new ArrayList<String>(); // Array List for adjectives
      adjectives.add("beautiful");
      adjectives.add("merciful");
      adjectives.add("grown");
      adjectives.add("breakable");
      adjectives.add("thick");
      adjectives.add("young");
      adjectives.add("tan");
      adjectives.add("enchanted");
      adjectives.add("groovy");
      adjectives.add("unequaled");
      adjectives.add("unrivaled");
      adjectives.add("bizarre");
      adjectives.add("royal");
      adjectives.add("blunt");
      adjectives.add("smart");
      adjectives.add("dull");
      adjectives.add("explosive");
      adjectives.add("energetic");
      adjectives.add("violent");
      
      // For-loop to print five randomly generated sentences
      // The random methods were retrieved from https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
      // Random is used along with collections for even better random generation
      Random a = new Random();
      for(int i = 0; i < 5; i++)
      {
         a = new Random();
         Collections.shuffle(articles);
         String bword = articles.get(a.nextInt(articles.size()));
         bword = bword.substring(0,1).toUpperCase() + bword.substring(1);
         System.out.print(bword + " ");
         Collections.shuffle(adjectives);
         System.out.print(adjectives.get(a.nextInt(adjectives.size())) + " ");
         Collections.shuffle(nouns);
         System.out.print(nouns.get(a.nextInt(nouns.size())) + " ");
         Collections.shuffle(adverbs);
         System.out.print(adverbs.get(a.nextInt(adverbs.size())) + " ");
         Collections.shuffle(verbs);
         System.out.print(verbs.get(a.nextInt(verbs.size())) + " ");
         Collections.shuffle(prepositions);
         System.out.print(prepositions.get(a.nextInt(prepositions.size())) + " ");
         Collections.shuffle(articles);
         System.out.print(articles.get(a.nextInt(articles.size())) + " ");
         Collections.shuffle(adjectives);
         System.out.print(adjectives.get(a.nextInt(adjectives.size())) + " ");
         Collections.shuffle(nouns);
         System.out.println(nouns.get(a.nextInt(nouns.size())) + ".");
      }
   }
} // PradyumnJamesSentenceGen class