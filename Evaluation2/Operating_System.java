public class Operating_System{

   private long memAmount;
   public double version;
   public String username;
   public String deviceName;
   private int bitVersion;
   public int numOfConnectedDevices;
   private int userAmount = 1;
   private String antiVirus = "";
   public int fileAmount;
   private String ipAddress;
   public boolean status;
   
   public Operating_System(long m, String uname, double vers, int bitVers, int deviceNum, String ip){
      memAmount = m;
      username = uname;
      version = vers;
      bitVersion = bitVers;
      numOfConnectedDevices = deviceNum;
      ipAddress = ip;
   }
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
   
   public String addFiles(int amt){
      if(status){
         if((fileAmount + amt) * 8 > memAmount) 
            return "Out of memory!";
         else{
            fileAmount += amt;
            return "Files added";
         }
      }
      else{
         return "Computer is off.";
      }
   }
   
   public void changeUser(String name){
      username = name;
   }
   
   public void updateVersion(){
      version += 0.1;
   }
   
   public String boot(){
      status = true;
      return "Welcome " + username + " to operating system using version " + version;
   }
   
   public String runFile(String name){
      if(status){
         if(fileAmount != 0){
            return "Running file " + name + "...";
         }
         return "No such file!";
      }
      return "Computer is off.";
   }
   
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