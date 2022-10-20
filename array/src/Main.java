import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            users.add(sc.next());
        }
//        try {
//            FileWriter writer = new FileWriter("users.txt", true);
//            for(String str : users) {
//                writer.write(str + " ");
//            }
//            writer.write("\n");
//            writer.close();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }



        // ------------------MAXIMUM ---------------- MINIMUM ----------------
//        int max = -1;
//        int min = 100000;
//        int num;
//        try {
//            File file = new File("users.txt");
//            Scanner myFileReader = new Scanner(file);
//            while(myFileReader.hasNextLine()){
//                try {
//                  num = Integer.parseInt(myFileReader.next());
//                }catch (Exception e) {continue;}
////                System.out.println(myFileReader.nextLine());
//                if(num > max){
//                    max = num;
//                }
//                if(num < min){
//                    min = num;
//                }
//            }
//
//            FileWriter writer = new FileWriter("result.txt", true);
//            writer.write("Max: "+ max + " " +"Min: "+ min + "\n");
//            writer.close();
//
//        }catch (Exception e) {
//            System.out.println(e +"  Error");
//        }


        try {
            FileWriter writer = new FileWriter("users.txt", true);
            writer.write(String.valueOf(users) + "\n");
            writer.close();
        }catch(Exception e) {
            System.out.println(e);
        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        try {
            File file = new File("users.txt");
            Scanner myFileReader = new Scanner(file);
            while (myFileReader.hasNextLine()) {
                try{
                    numbers.add(Integer.parseInt(myFileReader.next()));
                }catch (Exception e) {continue;}
            }
            Collections.sort(numbers);
            FileWriter writer = new FileWriter("result.txt", true);
            writer.write(String.valueOf(numbers) + "\n");
            writer.close();

        }catch (Exception e) {
            System.out.println(e);
        }





        }
    }
