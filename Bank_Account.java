public class Bank_Account{
   public long acct_num;
   private double balance;
   private String type;
   private float interest_rate;
   
   public Bank_Account(long acct, double bal, String ty, float interest){
      acct_num = acct;
      balance = bal;
      type = ty;
      interest_rate = interest;
   }
   public double getBalance(){
      return balance;
   }
   public String getType(){
      return type;
   }
   public void deposit(double amt){
      balance += amt;
   }
   public boolean withdrawal(double amt){
      if(amt > balance){
         return false;
      }
      else{
         balance -= amt;
         return true;
      }
   }
   public void applyInterest(){
      balance += balance * interest_rate;
   }
   
}