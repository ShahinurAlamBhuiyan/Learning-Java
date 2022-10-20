import org.omg.CORBA.INTERNAL;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class sp_192 {

}



class Tricky {
    public static void main(String args[])
    {

    ArrayList<String> list = new ArrayList<String>();
list.add("C");
        list.add(null);
        list.add("A");
        list.add(null);
        System.out.println("ArrayList: " + list);
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "A");
        hm.put(3, "B");
        hm.put(null, "C");
        //hm.put(null, null);
        hm.put(2, null);
        System.out.println("HasMap: " + hm);
        }
}



//class Book_QS_4{
//   class Cover{
//        public void foo(){
//            System.out.println("Inside foo");
//        } }
//    void bar(){
//        System.out.println("Inside bar");
//    }
//    public static void main(String args []){
//        Book_QS_4 book = new Book_QS_4();
//        Cover a= book.new Cover();
//        a.foo();
//        book.bar();
//    } }




//class Q_2 extends JFrame{
////    public static void main(String[] args) {
//        private JTextField both;
//        private JButton upCounter , downCounter , reset;
//        private Container c;
//        public JTextField getboth() {
//            return both;
//        }
//        public Q_2(){
//
//            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            setTitle("Counter");
//            setBounds(0,0,500,250);
//            c = getContentPane();
//            c.setLayout(null);
//            both = new JTextField("0");
//            both.setBounds(200,5,100,50);
//            c.add(both);
//            upCounter = new JButton("UP");
//            upCounter.setBounds(90,60,100,50);
//            c.add(upCounter);
//            downCounter = new JButton("Down");
//            downCounter.setBounds(200,60,100,50);
//            c.add(downCounter);
//            reset = new JButton("Reset");
//            reset.setBounds(310,60,100,50);
//            c.add(reset);
//            setVisible(true);
//
//
//            upCounter.addActionListener(new actionHandler());
//            downCounter.addActionListener(new actionHandler());
//            reset.addActionListener(new actionHandler());

            // add necessary code here.
      //  }
////    }
//}
//class actionHandler implements ActionListener {
//   // Q_2 O=new Q_2();
//
//    public void actionPerformed(ActionEvent e){
//        if(e.getSource().equals("upCounter")){
//            String up= O.both.getText();
//            JTextField b=e.getboth();
//            b.setText(Integer.parseInt(b.getText())+1+"");
//        }
//    }
//    public static void main(String[] args) {
//        // add necessary code here.
//        new Q_2();
//    }
//}


//class QS_1b{
//
//    int FZS=100;
//    int R15_V3=100;
//    int FREEZER=100;
//    int R15_V2=100;
//    void FZSsold(int n) throws bikeException{
//        if(FZS < 30){
//            FZS = 100;
//            throw new bikeException();
//        }else{
//            FZS=FZS-n;
//        }
//    }
//
//    void R15_V3(int n) throws bikeException{
//        if(R15_V3 < 40){
//            R15_V3 = 100;
//            throw new bikeException();
//        }else{
//            R15_V3=R15_V3-n;
//        }
//    }
//    void FREEZER(int n) throws bikeException{
//        if(FREEZER < 34){
//            FREEZER = 100;
//            throw new bikeException();
//        }else{
//            FREEZER=FREEZER-n;
//        }
//    }
//    void R15_V2(int n) throws bikeException{
//        if(R15_V2 < 50){
//            R15_V2 = 100;
//            throw new bikeException();
//        }else{
//            R15_V2=R15_V2-n;
//        }
//    }
//
//    public static void main(String[] args) {
//        QS_1b o=new QS_1b();
//        try {
//            o.FZSsold(80);
//            o.FZSsold(20);
//        }catch (bikeException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}
//class bikeException extends Exception{
//    public bikeException(){
//        super("Arenal running dry");
//
//    }
//}