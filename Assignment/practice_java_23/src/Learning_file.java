import java.io.*;
public class Learning_file {
    public static void main(String[] args) {
        try{
            File file = new File("shahin.txt");
        }catch(Exception err){
            System.out.println(err);
        }
    }
}
