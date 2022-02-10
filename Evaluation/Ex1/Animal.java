public class Animal{
   private String name;
   private boolean tired;
   private boolean hungry;
   private double weight;
   /*
   This public constructor creates a new Animal object, setting its name and weight
   Variable Name      Type      Description
   n                  String    The name of the animal
   w                  double    The weight of the animal
   */
   public Animal(String n, double w){
      name = n;
      tired = true;
      hungry = true;
      weight = w;
   }
   /*
   This public method will increase the weight of the animal depending on what is inputted, and sets hungry to false
   Variable Name      Type      Description
   v                  String    The type of food it ate
   */
   public void feed(String v){
      hungry = false;
      if (v.equals("vegetables"))
         weight +=2;
      else if (v.equals("meat"))
         weight +=4;
      else
         weight +=1;

   }
   //This public method will set tired to false, and reduce weight by 3
   public void sleep(){
      tired = false;
      weight -=3;
   }
} // Animal class