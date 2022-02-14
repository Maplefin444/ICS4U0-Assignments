public class OpSysDriver
{

   public static void main (String[] args)
   {
      System.out.println("A regular operating system:");
      System.out.println();
      Operating_System os = new Operating_System(32000, "Prady", 1.0, 32, 1, "20.184.17.216");
      System.out.println("Post Purchase: ");
      System.out.println("The memory of this Operating System at purchase is " + os.getMemAmount() + " mb.");  
      System.out.println("The bit version of this Operating System at purchase is " + os.getBitVersion() + ".");
      System.out.println("There are " + os.getUserAmount() + " user(s) using your Operating System.");
      System.out.println("The antivirus currently on this system at purchase is " + os.getAntiVirus() + ".");
      System.out.println("The ip address you are using this Operating System at is " + os.getIPAddress() + ".");
      try{Thread.sleep(5000);} catch(Exception e){}
      System.out.println();
      System.out.println("During setup: ");
      os.setMemAmount(64000);
      os.setBitVersion(64);
      os.setUserAmount(2);
      os.setAntiVirus("Norton");
      os.setIPAddress("1.1.1.1");
      System.out.println("The memory has increased to " + os.getMemAmount() + " mb.");  
      System.out.println("The bit version of this Operating System is now " + os.getBitVersion() + ".");
      System.out.println("There are now " + os.getUserAmount() + " user(s) using your Operating System.");
      System.out.println("The antivirus currently on this system has been updated to " + os.getAntiVirus() + ".");
      System.out.println("The ip address you are using this Operating System at has somehow changed to " + os.getIPAddress() + ".");
      System.out.println(os.addFiles(4));
      System.out.println("There are now " + os.fileAmount + " files on your system.");
      try{Thread.sleep(5000);} catch(Exception e){}
      System.out.println();
      System.out.println("Starting it up for the first time:");
      os.changeUser("James");
      System.out.println("User has been changed to " + os.username + ".");
      os.updateVersion();
      System.out.println("The version of your Operating System is now " + os.version + ".");
      try{Thread.sleep(5000);} catch(Exception e){}
      System.out.println();
      System.out.println("Booting up the system...");
      System.out.println(os.boot() + ".");
      System.out.println(os.runFile("Do Not Open"));
      System.out.println(os.virusCheck());
      try{Thread.sleep(5000);} catch(Exception e){}
      
      System.out.println();
      System.out.println();
      
      System.out.println("With Windows Thirteen:");
      System.out.println();
      Windows_Thirteen wt = new Windows_Thirteen(128000, "Prady", 1.0, 128, 1, "127.1.1.1",100.0);
      System.out.println("Post Purchase: ");
      System.out.println("The memory of this system at purchase is " + wt.getMemAmount() + " mb.");  
      System.out.println("The bit version of this system at purchase is " + wt.getBitVersion() + ".");
      System.out.println("There are " + wt.getUserAmount() + " user(s) using your system.");
      System.out.println("The antivirus currently on this system at purchase is " + wt.getAntiVirus() + ".");
      System.out.println("The ip address you are using this system at is " + wt.getIPAddress() + ".");
      System.out.println("The balance of the account is currently: $" + wt.getBal());
      try{Thread.sleep(5000);} catch(Exception e){}
      System.out.println();
      
      System.out.println("During setup: ");
      wt.setMemAmount(64000);
      wt.setBitVersion(64);
      wt.setUserAmount(2);
      wt.setAntiVirus("Windows Defender");
      wt.setIPAddress("1.127.1.1");
      System.out.println("The memory has increased to " + wt.getMemAmount() + " mb.");  
      System.out.println("The bit version of this Operating System is now " + wt.getBitVersion() + ".");
      System.out.println("There are now " + wt.getUserAmount() + " user(s) using your Operating System.");
      System.out.println("The antivirus currently on this system has been updated to " + wt.getAntiVirus() + ".");
      System.out.println("The ip address you are using this Operating System at has somehow changed to " + wt.getIPAddress() + ".");
      System.out.println(wt.addFiles(4));
      System.out.println("There are now " + wt.fileAmount + " files on your system.");
      
      try{Thread.sleep(5000);} catch(Exception e){}
      System.out.println();
      System.out.println("Starting it up for the first time:");
      wt.changeUser("James");
      System.out.println("User has been changed to " + wt.username + ".");
      wt.updateVersion();
      System.out.println("The version of your Operating System is now " + wt.version + ".");
      try{Thread.sleep(5000);} catch(Exception e){}
      System.out.println();
      System.out.println("Booting up the system...");
      System.out.println(wt.boot() + ".");
      System.out.println(wt.runFile("Do Not Open"));
      System.out.println(wt.virusCheck());
      try{Thread.sleep(5000);} catch(Exception e){}
      System.out.println();
      System.out.println("Balance is now: $" + wt.getBal());
      System.out.println("If you have no more money:");
      wt.setBal(0);
      System.out.println(wt.addFiles(4));
      System.out.println("There are now " + wt.fileAmount + " files on your system.");
      System.out.println(wt.runFile("Do Not Open"));
      System.out.println(wt.virusCheck());
      try{Thread.sleep(5000);} catch(Exception e){}
      System.out.println();
      System.out.println("Overall, this is what we have to say about Windows Thirteen:");
      System.out.println(wt.accessPersonalData());
      }

}