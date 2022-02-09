public class Car{
   private String brand;
   private String model;
   private int kilometres;
   private double gas;
   private double tankCapacity;
   public Car(String b, String m, double g, double tCap){
      brand = b;
      model = m;
      kilometres = 0;
      gas = g;
      tankCapacity = tCap;
   }
   public void drive(double distance){
      kilometres += distance;
      gas -= distance / 5;
   }
   public void gasUp(){
      gas = tankCapacity;
   }
   public String getInfo(){
      return brand + " " + model;
   }
} // Car class