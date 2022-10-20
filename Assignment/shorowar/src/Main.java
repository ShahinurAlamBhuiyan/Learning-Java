import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
//        int b[] = new int[10];
//        int a =
//        b[50] =  5/0;;
        // ArrayOutOfBoundsException || ArithmeticException
        try{
            System.out.println("Working");
            int b = 5/0;
            try {
                System.out.println("inner try");
                int c = 5/0;
            }
            finally {
                System.out.println("inner finally");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
        }
        catch (ArithmeticException e){
            System.out.println("Exception: " + e);
        }
        catch (Exception e){
            System.out.println("hello");
        }
        finally{
            System.out.println("finally");
        }
    }
}


//class MyClass {
//
//}