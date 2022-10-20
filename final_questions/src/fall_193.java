//import java.io.FileReader;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class fall_193 {
    public static void main(String[] args) {

    }
}

//class Q5_b{
//
//}

// class ExceptionOutput_1 {
//    static int p_method(int x , int y){ int div = 0 ;
//        try{
//            div = x / y ; }catch(NumberFormatException e){
//            System.out.println("Catch inside p method"); }
//        return div; }
//
//    static int q_method(int x , int y){ int z = 0;
//        try{
//            z = p_method(x,y); }catch(NumberFormatException e){System.out.println("Catch inside q method"); }return z; }
//    public static void main(String[] args) { int a = 10 , b = 0;
//        try{
//            System.out.println("Exception created..");
//            int i = q_method(a,b); }catch(ArithmeticException e){
//            System.out.println("Exception: " + "Divide by 0");
//        } }
//}
// class ExceptionOutput_2 { public static void main(String[] args) {
//    int[] arr = new int[10];
//    try{
//        System.out.println("Start Change");
//        arr[10] = 11 / 0; System.out.println("Exception might be created");
//    }catch(ArithmeticException e){ System.out.println("Inner Catch 1");
//    }catch(ArrayIndexOutOfBoundsException e){ System.out.println("Inner Catch 2");
//    } finally {
//        System.out.println("Inside finally block"); }
//    System.out.println("End Change"); }
//}




//class Q5_a{
//    public static void main(String[] args) {
//        try{
////            new StudentDemo("", 23);
////            new StudentDemo("Rahim",-17);
//            new StudentDemo("Karim",27);
//        }catch(ValidationException e){
//            System.out.println(e.getMessage());
//
//        }
//    }
//}
//class ValidationException extends Exception{
//    ValidationException(String customExceptionName){
//        super(customExceptionName);
//    }
//}
//class StudentDemo{
//    int age;
//    String name;
//    StudentDemo(String name , int age) throws ValidationException{
//        if(age < 0 || age > 100){
//            throw new ValidationException("Invalid age value");
//        }else if(name.equals("")){
//            throw new ValidationException("Name can not be empty");
//        }else{
//            this.name = name;
//            this.age = age;
//        }
//    }
//}





//class Q4{
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.study();
//        Student adnan = new Student(){
//            public void study(){
//                System.out.println("Adnan is studying");
//            }
//        };
//        adnan.study();
//    }
//}
//
//class Student {
//    public void study(){
//        System.out.println("Student is studying");
//    }
//}





//
//class Q3{
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Application");
//        frame.setSize(600, 600);
//        JButton button1 = new JButton("header");
//        JButton button2 = new JButton("links");
//        JButton button3 = new JButton("contents");
//        JButton button4 = new JButton("ads");
//        JButton button5 = new JButton("footer");
//        frame.add(button1, BorderLayout.NORTH);
//        frame.add(button2, BorderLayout.WEST);
//        frame.add(button3, BorderLayout.CENTER);
//        frame.add(button4, BorderLayout.EAST);
//        frame.add(button5, BorderLayout.SOUTH);
//
//        frame.setVisible(true);
//    }
//}




//class Q2{
//    public static void main(String[] args) {
//        ArrayList<Employee> employees = new ArrayList<>(5);
//        try{
//            FileReader reader = new FileReader("employeeDirectory.txt");
//            Scanner sc = new Scanner(reader);
//            while(sc.hasNext()){
//                employees.add(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
//            }
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{
//            String emNm=null;
//            double emSalary = -1;
//            int Id = 0;
//            for(Employee employee : employees){
//                if(employee.salary > emSalary){
//                    emNm = employee.name;
//                    Id = employee.ID;
//                    emSalary = employee.salary;
//                }
//            }
//
//            FileWriter writer = new FileWriter("output.txt", true);
//            writer.write(Id + " " + emNm + " " + emSalary + "\n");
//            writer.close();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println();
//
//    }
//}
//
//
//class Employee{
//    public int ID;
//    public String name;
//    public double salary;
// public Employee(int id, String name, double salary){
//     this.name = name;
//     this.ID = id;
//     this.salary = salary;
// }
//}








//
//class Q1 {
//    public static void main(String args[]) {
//        Player p1 = new Player(7, 9.2);
//        Player p2 = new Player(9, 8.5);
//        Player p3 = new Player(10, 9.0);
//        ArrayList<Player> players = new ArrayList<>();
//        players.add(p1);
//        players.add(p2);
//        players.add(1, p3);
//        players.add(2, new Player(5, 6.7));
//        players.set(3, p3);
//        HashSet<Player> hset=new HashSet();
//        for(Player p : players) {
//            hset.add(p);
//        }
//        Collections.sort(players,new myComparator());
//        System.out.println(players);


//        for(Player p : hset) {
//            System.out.println(p);
//        Player pp = new Player(5, 6.7);
//            if(hset.contains(p1)){
//                System.out.println("contain");
//            }else{
//                System.out.println("no contain");
//            }
//        }

//
//
//    }
//}



//class Player{
//    int jerseyNo;
//    double rating;
//    String name = "arjun";
//
//    public Player(int number, double rating){
//        this.rating=rating;
//        jerseyNo=number;
//    }
//    public String toString (){
//        return this.jerseyNo+" "+this.rating;
//    }
//}
//
//class myComparator implements Comparator<Player>{
//    @Override
//    public int compare(Player o1, Player o2) {
//        return  (int)(o2.rating-o1.rating); // 5 4 ...
////        return o2.jerseyNo-o1.jerseyNo; // 5 4 ...
//
////        if(o2.jerseyNo>o1.jerseyNo){
////            return 1;
////        }else if(o2.jerseyNo<o1.jerseyNo){
////            return -1;
////        }
//        //return 0;
//    }
//}
//
//class myComparator2 implements Comparator<Player> {
//    @Override
//    public int compare(Player o1, Player o2) {
//        return o1.name.compareTo(o2.name);
//    }
//}
