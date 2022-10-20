// Anonymous Inner Class;

public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("show is from main");
            }

            @Override
            public void sayHi() {
                System.out.println("Hello from main");
            }
        };

        obj.show();
        obj.sayHi();


        ABS abs = new ABS() {
            @Override
            public void show() {
                System.out.println("show is from ABS --> main");
            }
        };
        abs.show();

        ABI abInterface = new ABI() {
            @Override
            public void show() {
                System.out.println("show is from ABS --> ABS");
            }

            @Override
            public void sayHi() {
                System.out.println("Hello from ABS --> ABS");
            }


        };
    }
}

//class OuterClass{
//    public int size = 0;
//     class InnerClass{
//        public int num = 5;
//        void sayHi(){
//            System.out.println("Hello World");
//        }
//    }
//    InnerClass inClass = new InnerClass();
////     inClass.num = 5;
//    inClass.sayHi();
//}

class A{
    public void show(){
        System.out.println("In a show");
    }
    public void sayHi(){
        System.out.println("Hi");
    }
}

abstract class ABS{
    abstract void show();
    public void sayHi(){
        System.out.println("Hi");
    }
}

interface ABI {
    void show();
    void sayHi();
}