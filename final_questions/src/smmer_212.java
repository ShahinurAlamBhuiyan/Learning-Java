import javax.swing.*;
import java.awt.*;

public class smmer_212 {

}


//
//class DemoClass{
//    static private final double PI = 3.1416;
//    static void calculateArea (double radius) {
//        double area = PI * radius * radius;
//        System.out.println("Area: " + area);
//    }
//
//    public static void main(String []args) {
//        calculateArea(5.0);
//    }
//}


//class BankAccount {
//    double balance;
//
//    BankAccount(double balance) {
//        this.balance = balance;
//    }
//
//    void updateBalance(double newBalance) {
//        balance += newBalance;
//        System.out.println(balance);
//    }
//}
//
//
//     class MainClass{
//        public static void main(String[] args){
//            BankAccount account = new BankAccount(0){
//                void updateBalance(){
//                    System.out.println("The balance has been updated") ;
//                }
//
//                void sabbir(){
//                    System.out.println("hello boy");
//                }
//            };
//            account.updateBalance(5);
//            account. updateBalance(0);
//            account.updateBalance(0);
////            account.sabbir();
//        }
//    }


 class GUIApp{
    public GUIApp(){
        JFrame frame= new JFrame ("MyApplication");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 150);
        frame.setLayout(new BorderLayout());
        JButton upButton = new JButton() ;
        //upButton.setSize(400,50);
        upButton.setText("UP");
        JLabel middleLabel = new JLabel();
        middleLabel.setText("A Label object can display either text, an image, or both.");
        JTextField downTextField = new JTextField(100);
        frame.add(upButton,BorderLayout.NORTH);
        frame.add(middleLabel,BorderLayout.CENTER);
        frame.add(downTextField,BorderLayout.SOUTH);
        frame.setVisible(true);
}

    public static void main(String[] args) {
        new GUIApp();}}