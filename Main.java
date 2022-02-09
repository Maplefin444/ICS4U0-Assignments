public class Main{
   public static void main(String[] args){
      Bank_Account a = new Bank_Account(123456,100000.0,"savings",0.9f);
      Bank_Account b = new Bank_Account(98765,50.0,"chequing",0.5f);
      System.out.println("account one has: " + a.getBalance() + " dollars and is a " + a.getType() + " account");
      System.out.println("account two has: " + b.getBalance() + " dollars and is a " + b.getType() + " account");
      a.withdrawal(100.0);
      b.deposit(100.0);
      a.applyInterest();
      b.applyInterest();
      System.out.println("account one has: " + a.getBalance() + " dollars and is a " + a.getType() + " account");
      System.out.println("account two has: " + b.getBalance() + " dollars and is a " + b.getType() + " account");
      
      Car c = new Car("ferrari","roma", 0.0, 100.0);
      Car d = new Car("toyota", "corrola", 200.0, 10000.0);
      System.out.println(c.getInfo() + " " + d.getInfo());
      c.gasUp();
      d.drive(40);
   }
}