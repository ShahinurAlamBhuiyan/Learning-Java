public class StaticInnerClass {
    public static void main(String[] args) {
        Class1.Inner ic1 = new Class1.Inner();
        ic1.sayHi();
    }
}


class Class1{
    static int a;
    int b;
    static class Inner{
        static int b;
        void sayHi(){
            System.out.println("hello");
        }
    }
}