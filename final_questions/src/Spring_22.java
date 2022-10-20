import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Spring_22 {
    public static void main(String[] args) {

    }
}








/*
class QS_5{
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(10, "Deshi mal","Sabbir_pagla" ));
        players.add(new Player(50, "fenir pana","Shahin Gazipur" ));
        players.add(new Player(97,"bodna arjun","Arjun valo bodai" ));
        players.add(new Player(100, "luchha","Amran luicha" ));
        Collections.sort(players, new byjersey());

//        Collections.sort(players, new Comparator<Player>() {
//
//
//            @Override
//            public int compare(Player o1, Player o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });

        System.out.println(players);
    }



}
class byjersey implements Comparator<Player>{


    @Override
    public int compare(Player o1, Player o2) {
        return o1.jerseyNumber - o2.jerseyNumber;
    }
}
class Player{
    String name,type;
    int jerseyNumber;
    public Player(int JerseyNumber, String type,String name){
        this.name = name;
        this.type = type;
        this.jerseyNumber = JerseyNumber;
    }

    public String toString(){
        return (this.name+" "+this.jerseyNumber+"% "+this.type);

    }

}
*/




//class CreditCard{
//private double creditlimit;
//private double creditcurrent;
//public  CreditCard (double limit) throws  InvalidTxnException{
//// check and throw InvalidTxnException
//    if(limit<0) {throw new InvalidTxnException(limit + " is not a valid amount for the requested transaction.");}
//
//    creditlimit = limit;
//    creditcurrent = 0;
//}
//public void withdraw(double amount) throws InvalidTxnException{
//        if(amount < 0){
//            throw new InvalidTxnException(amount + " is not a valid amount for the requested transaction.");
//        }else if(creditcurrent+amount > creditlimit){
//            throw new InvalidTxnException(amount +
//                    " cannot be withdrawn with current credit of "+creditcurrent+" for your limit of "+ creditlimit);
//        }
//        else {
//            creditcurrent += amount;
//        }
//}
//}
//class QS_3{
//    public static void main(String args[]){
//        try{
//        CreditCard c1=new CreditCard(5000);
//
//        CreditCard c2=new CreditCard(10000);
//        c2.withdraw(7000);
//    //    c2.withdraw(7000);
//        c2.withdraw(4000);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//}
//
//class InvalidTxnException extends Exception {
//    InvalidTxnException(String message){
//        super(message);
//    }
//}



//class QS_2{
//    public static void main(String[] args) {
//        try{
////            FileWriter f1 =  new FileWriter("id.txt", true);
//            FileReader f2 =  new FileReader("id.txt");
//            FileWriter f3 =  new FileWriter("odd.txt", true);
//            FileWriter f4 =  new FileWriter("even.txt", true);
//            Scanner sc = new Scanner(f2);
//            while(sc.hasNext()){
//                String idString = sc.next(); // 011213075
//                int id = Integer.parseInt(idString); // 11213075
//
//                if(id %2 == 0){ // even
//                    f4.write(idString +"\n");
//                }else{ // odd
//                    f3.write(idString +"\n");
//                }
//            }
////            sc.close();
//            f3.close();
//            f4.close();
//        }catch (IOException e){
//            System.out.println("Exception");
//        }
//
//    }
//}





//interface vehicle{
//    void fuelType();
//}
//
//class spring {
//    public static void main(String[] args) {
//        vehicle cng=new vehicle() {
//            @Override
//            public void fuelType() {
//                System.out.println("use lpg");
//            }
//            public void fuel()  {
//                System.out.println("use done");
//            }
//        };
//        vehicle rocket=new vehicle() {
//            @Override
//            public void fuelType() {
//                System.out.println("use oil");
//            }
//        };
//        cng.fuelType();
//        cng.fuel();
//        rocket.fuelType();
//
//    }
//}





//
//class A{
//    void method1(){
//
//    }
//}
//
//class B extends A{
//     static int m= 1;
//    final void method1(){
//        System.out.println(m);
//    }
//}
//
//class C extends A{
//    void method1(){
//        System.out.println(m);
//    }
//}