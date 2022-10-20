public class Exception_handling {
    public static void main(String[] args) {
        try{
            System.out.println("Statement - 1");
            System.out.println("Statement - 2");
            int a = 5/0;
            try{
                String str = null;
                System.out.println(str.length());
            }catch(Exception err){
                System.out.println("Child catch");
            }
            finally{
                System.out.println("Printing from child finally");
            }
            int b = 6/0;
        }catch(Exception err){
            System.out.println("Parent catch");

//            System.out.println("it's working");
        }
        finally {
            System.out.println("Printing from finally");
        }
    }
}
