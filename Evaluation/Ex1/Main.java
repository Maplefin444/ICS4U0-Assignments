/*
James Huynh
Ms. Krasteva ICS4U0 Evaluation Exercise 1
Feb 9, 2022
This program creates 3 instances of the classes Animal, Car, House, and Student, and runs all the methods in them.
*/
public class Main{
   public static void main(String[] args){
      Animal hippo = new Animal("Ursa", 1000.0);
      Animal cat = new Animal("Oscar", 10.0);
      cat.feed("meat");
      cat.sleep();
      hippo.feed("vegetables");
      hippo.sleep();
      
      
      House small = new House(123, "Cat Street", "Toronto", "Ontario", "A1A1A1", 1400.0, false, 1);
      House mansion = new House(444, "Luxury Avenue", "Toronto", "Ontario", "B2B2B2", 9999999.0, true, 7);
      small.displayAddress();
      mansion.displayAddress();
      
      Car smal = new Car("Toyota", "Corrola", 0.0, 240.0);
      Car big = new Car("Tesla","CyberTruck",523.0,10000.0);
      smal.drive(100.0);
      big.drive(1000.0);
      smal.gasUp();
      big.gasUp();
      
      Student jim = new Student("Jim");
      Student cas = new Student("Cassandra");
      cas.setMarks(70,95);
      jim.setMarks(80,90);
      cas.calcAverage();
      jim.calcAverage();
      System.out.println(cas.message());
      System.out.println(jim.message());
   }
}