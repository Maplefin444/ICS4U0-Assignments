/*
James Huynh, Pradyumn Jha
Ms. Krasteva ICS4U0 Evaluation 2.3
Feb 14, 2022
This class simulates an operating system, and it is inherited by the Windows_Thirteen class.
*/

public class Operating_System{

   private long memAmount;
   public double version;
   public String username;
   public String deviceName;
   private int bitVersion;
   private int userAmount = 1;
   private String antiVirus = "";
   public int fileAmount;
   private String ipAddress;
   public boolean status;
   
   //Builds the operating system
   public Operating_System(long m, String uname, double vers, int bitVers, int deviceNum, String ip){
      memAmount = m;
      username = uname;
      version = vers;
      bitVersion = bitVers;
      ipAddress = ip;
   }
   //These methods return the corresponding values
   public long getMemAmount(){
      return memAmount;
   }
   public int getBitVersion(){
      return bitVersion;
   }
   public int getUserAmount(){
      return userAmount;
   }
   public String getAntiVirus(){
      return antiVirus;
   }
   public String getIPAddress(){
      return ipAddress;
   }
   
   //These methods set the corresponding value to the inputted value.
   public void setMemAmount(long mem){
      memAmount = mem;
   }
   public void setBitVersion(int bitV){
      bitVersion = bitV;
   }
   public void setUserAmount(int amt){
      userAmount = amt;
   }
   public void setAntiVirus(String av){
      antiVirus = av;
   }
   public void setIPAddress(String ip){
      ipAddress = ip;
   }
   //This public method adds the number of files to the file amount, unless the amount of the files would cause it to go over the memory amount
   public String addFiles(int amt){
      if((fileAmount + amt) * 8 > memAmount) 
         return "Out of memory!";
      else{
         fileAmount += amt;
         return "Files added";
      }
   }
   //This public method changes the username to the specified username
   public void changeUser(String name){
      username = name;
   }
   //This public method "updates" the version by adding 0.1 to the version.
   public void updateVersion(){
      version += 0.1;
   }
   
   //This public method creates a welcome message, and sets the OS status to true.
   public String boot(){
      status = true;
      return "Welcome " + username + " to operating system using version " + version;
   }
   
   //This public method will "run" a file, as long as there are files on the system.
   public String runFile(String name){
      if(status){
         if(fileAmount != 0){
            return "Running file " + name + "...";
         }
         return "No such file!";
      }
      return "Computer is off.";
   }
   
   //This public method will "scan" the system for viruses, 
   public String virusCheck(){
      if(status){
         if(antiVirus != null && !antiVirus.equals("")){
            return "Scan complete, no viruses were found.";
         }
         return "No antivirus installed!";
      }
      return "Computer is off.";
   }
   
}