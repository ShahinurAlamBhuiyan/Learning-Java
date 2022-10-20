import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("fileTwo.txt");
//        try{
//           boolean value = file1.createNewFile();
//        }catch (IOException e){
//            System.out.println(e);
//        }finally {
//
//        }

        try{
            FileWriter myWriter = new FileWriter("fileTwo.txt", true);
            myWriter.write("\nHard");
            myWriter.close();
        }catch (IOException e){
            System.out.println(e);
        }


        // Reading File in java
//        try{
//            Scanner myReader = new Scanner(file1);
//            while(myReader.hasNextLine()){
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        // Deleting File in java
//        if(file1.delete()){
//            System.out.println("Deleted the file: "+file1.getName());
//        }else{
//            System.out.println("Failed to delete the file.");
//        }

        // File methods
        //System.out.println(file1.canRead());// Tests whether the file is readable or not
        //System.out.println(file1.canWrite()); // Tests whether the file is writable or not
        //System.out.println(file1.canExecute()); // Tests whether the file is executable or not
        //System.out.println(file1.getName()); // Return the file name
        //System.out.println(file1.getAbsolutePath()); // Return the absolute path of th efile
        //System.out.println(file1.exists());// check file exist or not
        //System.out.println(file1.length()); // return the file size
    }
}
