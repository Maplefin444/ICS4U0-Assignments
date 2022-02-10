public class House{
   private int street_num;
   private String street;
   private String city;
   private String province;
   private String postal_code;
   private double size;
   private boolean detached;
   private int stories;
   /*
   This public constructor initializes the House class
   Variable Name      Type      Description
   n                  int       The street#
   s                  String    The street
   c                  String    The city
   pv                 String    The province
   p                  String    The postal code
   si                 double    The size of the house
   d                  boolean   If the house is detached or not
   l                  int       The # of stories
   */
   public House(int n, String s, String c, String pv, String p, double si, boolean d, int l){
      street_num = n;
      street = s;
      city = c;
      province = pv;
      postal_code = p;
      size = si;
      detached = d;
      stories = l;
   }
   //This public method doesn't return anything and prints out the street#, street, city, province, and postal code
   public void displayAddress(){
      System.out.println(street_num + " " + street);
      System.out.println(city + ", " + province);
      System.out.println(postal_code);
   }
} // House class