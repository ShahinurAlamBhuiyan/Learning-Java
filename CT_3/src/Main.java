import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        Class1 c1 = new Class1();
//        System.out.println(c1.camelCase());
//        Class2 c2 = new Class2();
//        System.out.println(c2.camelCase());
         Class3 c3 = new Class3();
         try{
             c3.concatenatedString(str);
         }catch (Exception e){
             System.out.println(e);
         }


    }
}


interface myInterface{
   public String camelCase(String str);
}

class Class1 implements myInterface{
    @Override
    public String camelCase(String str){
//        String str = new String("ABCDE");
        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(i % 2 == 0){
                ch[i] = Character.toLowerCase(ch[i]);
            }else{
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        str = new String(ch);

        return str;
    }
}

class Class2 implements myInterface{
    @Override
    public String camelCase(String str){
//        String str = new String("ABCDE");
        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(i % 2 != 0){
                ch[i] = Character.toLowerCase(ch[i]);
            }else{
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        str = new String(ch);

        return str;
    }
}


class Class3 {

   public int distinctVowelCount(String str){
        int vowelCounter = 0;
//        String str = new String("ABCDEF");
        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'A' && ch[i] == 'a'){
                vowelCounter++;
            }else if(ch[i] == 'E' && ch[i] == 'e'){
                vowelCounter++;
            }else if(ch[i] == 'I' && ch[i] == 'i'){
                vowelCounter++;
            }else if(ch[i] == 'O'&& ch[i] == 'o'){
                vowelCounter++;
            }else if(ch[i] == 'U' && ch[i] == 'u' ){
                vowelCounter++;
            }
        }
        return vowelCounter;
    }

    void concatenatedString (String str) throws Exception{

//        String str = new String("abdd");
         int halfLength = str.length()/2;
         str = str.concat("Horray");

        System.out.println(str.length());
        if(str.length() % 2 != 0){
            throw new Exception("It's Odd");
        }
    }
}