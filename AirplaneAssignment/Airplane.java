/*
Pradyumn Jha, James Huynh
Ms. Krasteva ICS4U0 OOP Assignment 2
Feb 10 2022
This class simulates an airplane
*/
public class Airplane
{
   private int gasLevel;
   private String landingGear;
   private String doorStatus;
   private int passengers;
   //constructor for airplane class, takes gas level, landing gear status, door status, and # of passengers
   public Airplane(int gLev, String lGear, String dStat, int p)
   {
      gasLevel = gLev;
      landingGear = lGear;
      doorStatus = dStat;
      passengers = p;
   }
   //This public method sets doorStatus to "Open."
   public void openDoor()
   {
      doorStatus = "Open.";
   }
   //This public method sets doorStatus to "Closed."
   public void closeDoor()
   {
      doorStatus = "Closed.";
   }
   //This public method sets gasLevel to 100
   public void fillUp()
   {
      gasLevel = 100;
   }
   //This public method subtracts 30 from gasLevel
   public void takeOff()
   {
      gasLevel -= 30;
   }
   //This public method sets landingGear to "Up."
   public void doneTakeOff()
   {
      landingGear = "Up.";
   }
   //This public method subtracts percent from gasLevel
   public void normalFlight(double percent)
   {      
      gasLevel -= percent;     
   }
   //This public method sets landingGear to "Down."
   public void prepLanding()
   {
      landingGear = "Down.";
      
   }
   //This public method subtracts 15 from gasLevel
   public void land()
   {
      gasLevel -= 15;
   }
   //This public method adds passengerNum to the amount of passengers.
   public void loadPass(int passengerNum)
   {
   
      passengers += passengerNum;
      
   }
   //This public method sets the # of passengers to 0
   public void unloadPass()
   {
      passengers = 0;
      
   }
   //This public method returns the gas level
   public int getGasLevel()
   {
      return gasLevel;
   }
   //This public method returns the door's status
   public String getDoorStatus()
   {
      return doorStatus;
   }
   //This public method returns the # of passengers
   public int getPassengers()
   {
      return passengers;
   }
   //This public method returns the landing gear's status
   public String getLandingGear()
   {
      return landingGear;
   }
}
