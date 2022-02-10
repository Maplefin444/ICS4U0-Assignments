public class Student{
   public String name;
   public int mark1;
   public int mark2;
   public double average;
   /*
   This public constructor creates a new Student object, and sets the name
   Variable Name      Type      Description
   n                  String    The name of the student
   */
   public Student(String n){
      name = n;
      mark1 = 0;
      mark2 = 0;
      average = 0.0;
   }
   /*
   This public method will add the 2 marks of the student to the object
   Variable Name      Type      Description
   x                  int       The first mark
   y                  int       The second mark
   */
   public void setMarks(int x, int y){
      mark1 = x;
      mark2 = y;
   }
   //This public method calculates the average of the 2 marks
   public void calcAverage(){
      average=(mark1 + mark2)/2;
   }
   //This public method returns the average of the student, along with their name
   public String message( ){
      return name + "You got an " + average;
   }
} // Student class