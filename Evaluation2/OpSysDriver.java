public class OpSysDriver
{

   public static void main (String[] args)
   {
   
      Operating_System os = new Operating_System(32000, "Prady", 1.0, 32, 1, "20.184.17.216");
      System.out.println("The memory of this Operating System at purchase is " + os.getMemAmount() + ".");  
      System.out.println("The bit version of this Operating System at purchase is " + os.getBitVersion() + ".");
      System.out.println("There are " + os.getUserAmount() + " users using your Operating System.");
      System.out.println("The antivirus currently on this system at purchase is " + os.getAntiVirus() + ".");
      System.out.println("The ip address you are using this Operating System at is " + os.getIPAddress() + ".");
      os.setMemAmount(64000);
      os.setBitVersion(64);
      os.setUserAmount(2);
      os.setAntiVirus("Norton");
      os.setIPAddress("1.1.1.1");
      System.out.println("The memory has increased to " + os.getMemAmount() + ".");  
      System.out.println("The bit version of this Operating System is now " + os.getBitVersion() + ".");
      System.out.println("There are now" + os.getUserAmount() + " users using your Operating System.");
      System.out.println("The antivirus currently on this system has been updated to " + os.getAntiVirus() + ".");
      System.out.println("The ip address you are using this Operating System at has somehow changed to " + os.getIPAddress() + ".");
      os.addFiles(4);
      os.changeUser("James");
      os.updateVersion();
      os.boot();
      os.runFile("Do Not Open");
      os.virusCheck();
      }

}