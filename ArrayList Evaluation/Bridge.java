import java.util.*;

public class Bridge{
   ArrayList<String> deck = new ArrayList<String>();
   String[] suits = {"S", "H", "D", "C"};
   String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
   String[][] hands = new String[4][13];
   int[] scores = new int[4];
   
   public void addCards(){
      for(String val : values){
         for(String suit : suits){
            deck.add(val + suit);
         }
      }
   }
   public void dealCards(){
      Collections.shuffle(deck);
      for(int i = 0; i < hands.length; i ++){
         System.out.print("Player " + (i+1) + " has a hand of: ");
         for(int j = 0; j < hands[0].length; j++){
            hands[i][j] = deck.get(deck.size() - 1);
            deck.remove(deck.size() - 1);
            System.out.print(hands[i][j] + " ");
         }
         System.out.println();
      }
   }
   public void pointsEval(){
      for(int i = 0; i < hands.length; i ++){
         for(int j = 0; j < hands[0].length; j++){
            if(hands[i][j].charAt(0) == 'A'){
               scores[i] += 4;
            }
            else if(hands[i][j].charAt(0) == 'K'){
               scores[i] += 3;
            }
            else if(hands[i][j].charAt(0) == 'Q'){
               scores[i] += 2;
            }
            else if(hands[i][j].charAt(0) == 'J'){
               scores[i] += 1;
            }
         }
      }
      for(int i = 0; i < hands.length; i ++){
         int s = 0;
         int h = 0;
         int d = 0;
         int c = 0;
         for(int j = 0; j < hands[0].length; j++){
            if(hands[i][j].charAt(1) == 'S'){
               s++;
            }
            else if(hands[i][j].charAt(1) == 'H'){
               h++;
            }
            else if(hands[i][j].charAt(1) == 'D'){
               d++;
            }
            else if(hands[i][j].charAt(1) == 'C'){
               c++;
            }
         }
         if(s == 0){
            scores[i] += 3;
         }
         if(h == 0){
            scores[i] += 3;
         }
         if(d == 0){
            scores[i] += 3;
         }
         if(c == 0){
            scores[i] += 3;
         }
         
         if(s == 1){
            scores[i] += 2;
         }
         if(h == 1){
            scores[i] += 2;
         }
         if(d == 1){
            scores[i] += 2;
         }
         if(c == 1){
            scores[i] += 2;
         }
         
         if(s == 2){
            scores[i] += 1;
         }
         if(h == 2){
            scores[i] += 1;
         }
         if(d == 2){
            scores[i] += 1;
         }
         if(c == 2){
            scores[i] += 1;
         }
      }
   }
   public void printPoints(){
      System.out.println();
      int user = 1;
      for(int i : scores){
         System.out.println("Player " + user + " has a score of " + i);
         user++;
      }
   }
   
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
   public static void main(String[] args){
      Bridge a = new Bridge();
      a.addCards();
      a.dealCards();
      a.pointsEval();
      a.printPoints();
      a.getWinner();
   }
}