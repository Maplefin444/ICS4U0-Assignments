public class Airplane
{
   private int gasLevel;
   private String landingGear;
   private String doorStatus;
   private int passengers;
      
   public Airplane(int gLev, String lGear, String dStat, int p)
   {
      gasLevel = gLev;
      landingGear = lGear;
      doorStatus = dStat;
      passengers = p;
   }

   public void openDoor()
   {
      doorStatus = "Open.";
   }

   public void closeDoor()
   {
      doorStatus = "Closed.";
   }
   
   public void fillUp()
   {
      gasLevel = 100;
   }
   
   public void takeOff()
   {
      gasLevel -= 30;
   }
   
   public void doneTakeOff()
   {
      landingGear = "Up.";
   }
   
   public void normalFlight(double percent)
   {      
      gasLevel - percent;     
   }
   
   public void prepLanding()
   {
      landingGear = "Down.";
      
   }
   
   public void land()
   {
      gasLevel -= 15;
   }
   
   public void loadPass(int passengerNum)
   {
      int numOfPassengers = passengerNum;
      
      passengers += numOfPassengers;
      
   }

   public void unloadPass()
   {
      passengers = 0;
      
   }
   
   public int getGasLevel()
   {
      return gasLevel;
   }
   
   public String getDoorStatus()
   {
      return doorStatus;
   }
   
   public int getPassengers()
   {
      return passengers;
   }
   
   public String getLandingGear()
   {
      return landingGear;
   }
}
