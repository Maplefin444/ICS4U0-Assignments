public class AirplaneDriver
{


   public static void main (String[] args)
   {
      Airplane airplane1 = new Airplane(75, "Down.", "Open.", 850);
      
      airplane1.normalFlight(25);
      
      
      System.out.println("The gas level is at " + airplane1.getGasLevel() + " capacity.");
      System.out.println("The door is " + airplane1.getDoorStatus());
      System.out.println("There are " + airplane1.getPassengers() + " passengers.");
      System.out.println("The landing gear is " + airplane1.getLandingGear());
   }


}