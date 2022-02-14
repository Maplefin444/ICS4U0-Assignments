public class Windows_Thirteen extends Operating_System{
   private double currentBal;
   public Windows_Thirteen(long m, String uname, double vers, int bitVers, int deviceNum, String ip, double bal){
      super(m,uname,vers,bitVers,deviceNum,ip);
      currentBal = bal;
   }
   public double getBal(){
      return currentBal;
   }
   public void setBal(double bal){
      currentBal = bal;
   }
   /*
updateVersion(): void
boot(): String
runFile(name : String): String
virusCheck(): String
accessPersonalData() : String

   */
   public String addFiles(int amt){
      if(status && currentBal >= 1.0){
         if((fileAmount + amt) * 8 > getMemAmount()) 
            return "Out of memory!";
         else{
            fileAmount += amt;
            return "Files added";
         }
      }
      else if(!status){
         return "Computer is off.";
      }
      else if(currentBal < 1.0){
         return "Out of money!";
      }
      return "System is broken.";
   }
   
   public void updateVersion(){
      if(currentBal >= 10.0){
         version += 0.1;
      }
   }
   
   public String boot(){
      status = true;
      return "Welcome " + username + " to Windows Thirteen " + version + " thank you for using our system.";
   }
   
   public String runFile(String name){
      if(status){
         if(fileAmount != 0){
            return "The file with the name " + name + " has been detected to contain a virus, and as a result has not been run.";
         }
         return "No such file!";
      }
      return "Computer is off.";
   }
   
   public String virusCheck(){
      if(status){
         if(getAntiVirus() != null && !getAntiVirus().equals("")){
            return "Scan complete, " + Math.floor(Math.random()*(10000)+1) + " viruses were found, but we're not gonna tell you where they are.";
         }
         return "No antivirus installed, please purchase WindowsAV for $20.99";
      }
      return "Computer is off.";
   }
   public String accessPersonalData(){
      return "Windows Thirteen totally does not store every single piece of data related to you.";
   }
}