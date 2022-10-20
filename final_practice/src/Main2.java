
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        try{
            File myFile = new File("shopInfo.txt");
            Scanner s = new Scanner(myFile);
//            Product p = new Product();
            while(s.hasNext()){
                products.add( new Product(s.next(), s.next(), s.next(), s.next()));
            }
        }catch (Exception e){
            System.out.println(e);
        }

        for(Product product : products){
            System.out.println(product.productId + " " + product.productName+ " "  +product.productPrice+ " "  +product.productQuantity);
        }

        // 3rd question
//        products.clear();
        System.out.println("-------------------------------------------------");
        if(products.isEmpty()){
            System.out.println("There is no product");
        }else{
            System.out.println(products.size() + " products found");
        }


        JFrame frame = new JFrame("Search Product");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);


        JLabel searchProductLabel = new JLabel("Search your product here...");
        frame.add(searchProductLabel);
        searchProductLabel.setBounds(100,30, 200, 100);

        JTextField searchProductField = new JTextField();
        frame.add(searchProductField);
        searchProductField.setBounds(50,100, 200, 50);

        JButton searchProductButton = new JButton("Search");
        frame.add(searchProductButton);
        searchProductButton.setBounds(100,200, 100, 50);



        searchProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productName = searchProductField.getText().toString();
                boolean flag = true;
                boolean isMatched = false;

                try{
                    File file = new File("shopInfo.txt");
                    Scanner s = new Scanner(file);
                    boolean searchProduct;
                    while(s.hasNextLine() && flag){
                        try{
                             searchProduct = s.next().equals(productName);
                        }catch (Exception err){continue;}

                        if(searchProduct){
                            JLabel showProduct = new JLabel("The "+productName + " is Product found!");
                            frame.add(showProduct);
                            showProduct.setBounds(100,400, 200, 100);
                            flag = false;
                            isMatched = true;
                        }
                    }

                    if(!isMatched){
                        JLabel showProduct = new JLabel("The "+productName + " is not Product found!");
                        frame.add(showProduct);
                        showProduct.setBounds(100,400, 200, 100);
                    }
                }catch (Exception err){
                    System.out.println(err);
                }

            }
        });

    }
}


class Product{
    String productName;
    String productId;
    String productPrice;
    String productQuantity;

    public Product(String productName, String productId, String productPrice, String productQuantity){
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
}

