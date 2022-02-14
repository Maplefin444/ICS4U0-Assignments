/*
Pradyumn Jha, James Huynh
Ms. Krasteva ICS4U0 OOP Assignment 2
Feb 10 2022
This program will run all the methods in the class Airplane, and simulate an airplane.
*/
public class AirplaneDriver
{

   // The main method responsible for executing other methods
   public static void main (String[] args)
   {
      Airplane airplane1 = new Airplane(20, "Down.", "Open.", 0);
      
      System.out.println("Pre-Flight:");
      System.out.println("The gas level is at " + airplane1.getGasLevel() + " capacity.");
      System.out.println("The door is " + airplane1.getDoorStatus());
      System.out.println("There are " + airplane1.getPassengers() + " passengers.");
      System.out.println("The landing gear is " + airplane1.getLandingGear());
      
      airplane1.loadPass(850);
      airplane1.fillUp();
      airplane1.closeDoor();
      airplane1.takeOff();
      airplane1.doneTakeOff();
      
      System.out.println();
      System.out.println("During Flight:");
      System.out.println("The gas level is at " + airplane1.getGasLevel() + " capacity.");
      System.out.println("The door is " + airplane1.getDoorStatus());
      System.out.println("There are " + airplane1.getPassengers() + " passengers.");
      System.out.println("The landing gear is " + airplane1.getLandingGear());
      
      airplane1.normalFlight(20);
      airplane1.prepLanding();
      airplane1.land();
      airplane1.openDoor();
      airplane1.unloadPass();
      
      System.out.println();
      System.out.println("In The Hangar: ");
      System.out.println("The gas level is at " + airplane1.getGasLevel() + " capacity.");
      System.out.println("The door is " + airplane1.getDoorStatus());
      System.out.println("There are " + airplane1.getPassengers() + " passengers.");
      System.out.println("The landing gear is " + airplane1.getLandingGear());
   }


}
