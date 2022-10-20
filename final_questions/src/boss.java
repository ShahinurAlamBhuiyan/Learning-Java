public class boss {
}
interface human{
   default void study(){
      System.out.println("Solving");

   }
    void work();

}
class Doctor implements human {
   public void study(){
      System.out.println("doctor");
   }
    public void work(){
      System.out.println("body");
   }
}
interface Engineer extends human{
}
class  Civil implements Engineer{
  public void work(){
     System.out.println("Civil");

  }
}
class cs implements Engineer{

  public void work(){
     System.out.println("CS");
   }
}
class Main{

   public static void main(String[] args) {
      human d=new Doctor();
      d.study();
      d.work();
      human w=new human(){
      public void work(){
            System.out.println("vaiya");
         }

      };
   }

}