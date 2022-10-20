public class NewMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        String b="boss shahin";
        String []c;
        c=b.split(" ",10);
        System.out.println(c);
        try{
            //myClass.ageCheck(17);
            String me="";
          // b[0]='t';
           //me+=b[0];//charAt(10);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
//        try {
////            myClass.ageCheck(16);
//            System.out.println("hello try -1");
//
//            try {
//                System.out.println("hello try -2");
//                int b = 5/0;
//            }finally {
//                System.out.println("hello finally -1");
//            }
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("hello");
//        }

    }
}

// Throws // Throw

class MyClass{
    void ageCheck(int age) throws AdultException {
        if (age > 18){
            System.out.println("Age verified");
        }else{
            throw new AdultException("Your");
        }
    }
}

class AdultException extends Exception {
    public AdultException() {
        super("You are not allowed for adultException");
    }

    public AdultException(String mssg) {
        super(mssg);
    }
}