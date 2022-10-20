import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SP_181 {
}

class Q2_2a{
    //we have to create local class because if we create anonymous class then we cannot add any extra class,
    // because its add

     static void meth(){
         class B extends C{
             void pagolnafis(){
                 System.out.println("arjun akta sei 100%");
             }
             @Override
             void pagla(){
                super.pagla();
               System.out.println("sabbir akta valo silicon");
            }
         }
         B b=new B();
         b.pagla();
         b.pagolnafis();
    }

    public static void main(String[] args) {
        meth();
    }

}


class C{
    void pagla(){

        System.out.println("pagla sb hala pagla halara pagol shahin akta");
    }

}

//
//class Qs_3b{
//    public static void main(String[] args) {
//        try{
//            File file = new File("numbers.txt");
//            Scanner reader = new Scanner(file);
//            FileWriter writer = new FileWriter("outputnum.txt",true);
//            while(reader.hasNextLine()) {
//                String [] num= reader.nextLine().split(",");
//                int s=0;
//                for(String n : num){
//                   s+=Integer.parseInt(n) ;
//                }
//                writer.write(s+"\n");
//            }
//            writer.close();
//        }catch(Exception e){
//
//        }
//    }
//
//}