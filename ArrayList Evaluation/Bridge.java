/*
James Huynh, Pradyumn Jha
Ms. Krasteva ArrayList Evaluation ICS4U0
Mar 7 2022
This program simulates the game Bridge, by randomizing the deck and calculating points.
*/

import java.util.*;

public class Bridge{
   ArrayList<String> deck = new ArrayList<String>();
   String[] suits = {"S", "H", "D", "C"};
   String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
   String[] hands = new String[4];
   int[] scores = new int[4];
   
   //This public method initializes the deck by combining all possible values with their suits
   public void addCards(){
      for(String val : values){
         for(String suit : suits){
            deck.add(val + suit);
         }
      }
   }
   //This public method will shuffle the cards, and for every player will give them 13 cards
   public void dealCards(){
      Collections.shuffle(deck);
      for(int i = 0; i < hands.length; i ++){
         String hand = "";
         for(int j = 0; j < 13; j++){
            hand += deck.get(deck.size() - 1) + " ";
            deck.remove(deck.size() - 1);
         }
         hand.trim();
         hands[i] = hand;
      }
   }
   //This public method sets the corresponding player's score, based on multiple criteria
   public void pointsEval(){
      for(int i = 0; i < hands.length; i ++){
         String[] currhand = hands[i].split(" ");
         for(int j = 0; j < 13; j++){
            if(currhand[j].charAt(0) == 'A'){
               scores[i] += 4;
            }
            else if(currhand[j].charAt(0) == 'K'){
               scores[i] += 3;
            }
            else if(currhand[j].charAt(0) == 'Q'){
               scores[i] += 2;
            }
            else if(currhand[j].charAt(0) == 'J'){
               scores[i] += 1;
            }
         }
         System.out.println("Player " + (i+1) + "'s hand: ");
         int s = 0;
         int h = 0;
         int d = 0;
         int c = 0;
         for(int j = 0; j < 13; j++){
            if(currhand[j].charAt(1) == 'S'){
               System.out.print(currhand[j] + " ");
               s++;
            }
            else if(currhand[j].charAt(1) == 'H'){
               h++;
            }
            else if(currhand[j].charAt(1) == 'D'){
               d++;
            }
            else if(currhand[j].charAt(1) == 'C'){
               c++;
            }
         }
         System.out.println();
         for(int j = 0; j < 13; j++){
            if(currhand[j].charAt(1) == 'H'){
               System.out.print(currhand[j] + " ");
            }
         }
         System.out.println();
         for(int j = 0; j < 13; j++){
            if(currhand[j].charAt(1) == 'D'){
               System.out.print(currhand[j] + " ");
            }
         }
         System.out.println();
         for(int j = 0; j < 13; j++){
            if(currhand[j].charAt(1) == 'C'){
               System.out.print(currhand[j] + " ");
            }
         }
      
         if(s == 0) scores[i] += 3;
         if(h == 0) scores[i] += 3;
         if(d == 0) scores[i] += 3;
         if(c == 0) scores[i] += 3;
         
         if(s == 1) scores[i] += 2;
         if(h == 1) scores[i] += 2;
         if(d == 1) scores[i] += 2;
         if(c == 1) scores[i] += 2;
         
         if(s == 2) scores[i] += 1;
         if(h == 2) scores[i] += 1;
         if(d == 2) scores[i] += 1;
         if(c == 2) scores[i] += 1;
         System.out.println();
         System.out.println();
      }
         
   
   }
   //This public method prints the point values
   public void printPoints(){
      System.out.println();
      int user = 1;
      for(int i : scores){
         System.out.println("Player " + user + " has a score of " + i);
         user++;
      }
   }
   //This public method will get who is the winner, and if there is a tie, will print all the players who had that score
   public void getWinner(){
      System.out.println();
      int max = 0;
      for(int score : scores){
         if(score > max){
            max = score;
         }
      }
      for(int i = 0; i < scores.length; i++){
         if(scores[i] == max){
            System.out.println("Player " + (i+1) + " has won!");
         }
      }
   }
   //The main method, runs the whole program
   public static void main(String[] args){
      Bridge a = new Bridge();
      a.addCards();
      a.dealCards();
      a.pointsEval();
      a.printPoints();
      a.getWinner();
   }
}