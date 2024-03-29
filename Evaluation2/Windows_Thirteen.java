/*
James Huynh, Pradyumn Jha
Ms. Krasteva ICS4U0 Evaluation 2.3
Feb 14, 2022
This class inherits the Operating_System class, and simulates a fictional operating system named Windows_Thirteen
*/

public class Windows_Thirteen extends Operating_System{
   private double currentBal;
   public int date = 0;
   public String browser;
   public String IDE;
   private int connectedDevices;
   private int currPerms;
   private int desktopNum;
   public int pictures;
   private String password;
   public String time;
   //Builds the class, uses super() to access the superclass's constructor
   public Windows_Thirteen(long m, String uname, double vers, int bitVers, int deviceNum, String ip, double bal, int dev, int pe, int dn, String pw){
      super(m,uname,vers,bitVers,deviceNum,ip);
      currentBal = bal;
      connectedDevices = dev;
      currPerms = pe;
      desktopNum = dn;
      password = pw;
   }
   //These methods return the specified variable
   public double getBal(){
      return currentBal;
   }
   public int getDevices(){
      return connectedDevices;
   }
   public int getPerms(){
      return currPerms;
   }
   public int getDNum(){
      return desktopNum;
   }
   public String getPass(){
      return password;
   }

   //These methods set the specified variable to the inputted value
   public void setBal(double bal){
      currentBal = bal;
   }
   public void setDevices(int num){
      connectedDevices = num;
   }
   public void setPerms(int p){
      currPerms = p;
   }
   public void setDNum(int num){
      desktopNum = num;
   }
   public void setPass(String p){
      password = p;
   }

   //Adds a certain number of files if you have the memory and the money to do so
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
   //Increases the version by 0.1 if you have more than $10
   public void updateVersion(){
      if(currentBal >= 10.0){
         version += 0.1;
      }
   }
   //Creates a welcome message
   public String boot(){
      status = true;
      return "Welcome " + username + " to Windows Thirteen " + version + " thank you for using our system.";
   }
   //Runs the file, and will always detect a virus in the file :)
   public String runFile(String name){
      if(status){
         if(fileAmount != 0){
            return "The file with the name " + name + " has been detected to contain a virus, and as a result has not been run.";
         }
         return "No such file!";
      }
      return "Computer is off.";
   }
   //Randomizes the amount of viruses on your system
   public String virusCheck(){
      if(status){
         if(currentBal >= 10 && getAntiVirus() != null && !getAntiVirus().equals("")){
            return "Scan complete, " + (int) Math.random()*(10000)+1 + " viruses were found, but we're not gonna tell you where they are.";
         }
         else if(currentBal < 10){
            return "Out of money, please purchase WindowsAV for $20.99";
         }
         return "No antivirus installed, please purchase WindowsAV for $20.99";
      }
      return "Computer is off.";
   }
   //Sets browser to microsoft edge, and IDE to vscode, and sends back a message
   public String checkSoftware(){
      browser = "Microsoft Edge";
      IDE = "Visual Studio Code";
      return "Your browser has been set to Edge, and your IDE has been set to VSCode :)";
   }
   
   //Checks if the input = pass, if not, still lets you in :)
   public String logIn(String pass){
      if(pass.equals(password)){
         return "Log-in was successful!";
      }
      return "Log-in didn't work, but you seem nice, so we'll let you in.";
   }
   
   //Just returns that all your drivers are out of date
   public String downloadDrivers(){
      return "All drivers are out of date, but you don't need to worry about that.";
   }
   //Increases pictures by 1, and sends a sound effect
   public String takePicture(){
      pictures++;
      return "Click!";
   }
   //Increases day by 1
   public void nextDay(){
      date++;
   }
}