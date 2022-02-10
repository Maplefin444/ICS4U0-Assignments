public class Car{
   private String brand;
   private String model;
   private int kilometres;
   private double gas;
   private double tankCapacity;
   /*
   This public constructor accepts default values for the new object
   Variable Name      Type      Description
   b                  String    The name
   m                  String    The model
   g                  double    The amount of gas
   tCap               double    The maximum amount of gas
   */
   public Car(String b, String m, double g, double tCap){
      brand = b;
      model = m;
      kilometres = 0;
      gas = g;
      tankCapacity = tCap;
   }
   /*
   This public method adds the distance driven to the # of kilometers, and reduces gas by distance/5
   
   Variable Name      Type      Description
   distance           double    The distance the car drove
   */
   public void drive(double distance){
      kilometres += distance;
      gas -= distance / 5;
   }
   //This public method maxes out the car's gas capacity
   public void gasUp(){
      gas = tankCapacity;
   }
} // Car class