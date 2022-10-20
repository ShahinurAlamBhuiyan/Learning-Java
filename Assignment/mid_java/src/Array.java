import java.util.Scanner;
class Array {
    Scanner sc = new Scanner(System.in);
    String[] names = new String[5];
    public void takingInput(){
        names[0] = "Hello";
        for(int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }
    }
    public void showArray(){
        for(String s: names){
            System.out.println(s);
        }
    }

    int[] numbers = new int[]{1, 2, 33, 4, 5};
    public void showInt(){
        String[] students;
        students = new String[5];
        for(int s: numbers){
            System.out.println(s);
        }
        for(String s1: students){
            System.out.println(s1);
        }
    }



}
