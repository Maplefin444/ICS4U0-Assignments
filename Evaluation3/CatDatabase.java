public class CatDatabase{
   private String[] name;
   private String[] breed;
   private int[] age;
   private double[] weight;
   private int[] length;
   private final int amt;
   
   public CatDatabase(int amt){
      this.amt = amt;
      name = new String[amt];
      breed = new String[amt];
      age = new int[amt];
      weight = new double[amt];
      length = new int[amt];
   }
   public String getName(int ind){
      if(ind >= amt){
         return "No such index!";
      }
      return name[ind];
   }
   public String getBreed(int ind){
      if(ind >= amt){
         return "No such index!";
      }
      return breed[ind];
   }
   public int getAge(int ind){
      if(ind >= amt){
         return -1;
      }
      return age[ind];
   }
   public double getWeight(int ind){
      if(ind >= amt){
         return -1;
      }
      return weight[ind];
   }
   public int getLength(int ind){
      if(ind >= amt){
         return -1;
      }
      return length[ind];
   }
   
   
   public void setName(String in, int ind){
      if(ind < amt){
         name[ind] = in;
      }
   }
   public void setBreed(String in, int ind){
      if(ind < amt){
         breed[ind] = in;
      }
   }
   public void setAge(int in, int ind){
      if(ind < amt){
         age[ind] = in;
      }
   }
   public void setWeight(Double in, int ind){
      if(ind < amt){
         weight[ind] = in;
      }
   }
   public void setLength(int in, int ind){
      if(ind < amt){
         length[ind] = in;
      }
   }
}