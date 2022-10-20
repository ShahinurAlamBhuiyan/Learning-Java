public class Main {
    public static void main(String[] args) {
        Practice_string p = new Practice_string();
//        p.print();
        String s1 = new String("Hello");
        String s2 = "Hello";

        if(s1 == s2){ // check only reference...
            System.out.println("it's working");
        }else{
            System.out.println("not work");
        }


        if(s1.equals(s2)){ // check only content...
            System.out.println("it's working");
        }else{
            System.out.println("not work");
        }


        System.out.println(s1.isEmpty()); // check the string is empty or not.
        System.out.println(s1.concat(" World!")); // concat prev string with given string
        System.out.println(s1);

        String s5 = "helLO";
        if(s1.equalsIgnoreCase(s5)){
            System.out.println("String same.");
        }

        System.out.println(s1.intern());

        String s7 = "  Hello      from uiu library.     ";
        System.out.println(s7.trim());



//        System.out.println(s1.charAt(1)); // return character in that index.
//        System.out.println(s1.length()); // return length of the String.
//        System.out.println(s1.substring(2)); // return string in that range.
//        System.out.println(s1.s);


    }
}


class Practice_string {
    char ch[] = {'a', 'b', 'c', 'd'};
    String s = new String(ch);


    String s1 = "It's String.";

    String s2 = new String("Hello world!");
     void print(){
        System.out.println(s2);
    }



}
