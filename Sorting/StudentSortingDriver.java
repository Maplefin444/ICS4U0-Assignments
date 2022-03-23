public class StudentSortingDriver{
   public static void main(String[] args){
      StudentSorting a = new StudentSorting();
      System.out.println("---------- SORTED BY NAME --------------------");
      a.sortNames();
      a.printStudents();
      System.out.println("---------- SORTED BY MARK --------------------");
      a.sortByMark();
      a.printStudents();
   }
}