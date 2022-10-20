import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(480, 650);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Student Marks:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        JLabel stdIDLabel = new JLabel("Student ID: ");
        frame.add(stdIDLabel);
        stdIDLabel.setBounds(50, 120, 100, 50);

        JTextField stdIDTextField = new JTextField();
        frame.add(stdIDTextField);
        stdIDTextField.setBounds(130, 120, 100, 50);

        // CT----------------------------------------------------------------
        JLabel ctLabel = new JLabel("CT Marks:");
        frame.add(ctLabel);
        ctLabel.setBounds(50, 170, 100, 50);

        JTextField ctTextField = new JTextField();
        frame.add(ctTextField);
        ctTextField.setBounds(130, 170, 100, 50);


        // MID----------------------------------------------------------------
        JLabel midLabel = new JLabel("MID Marks:");
        frame.add(midLabel);
        midLabel.setBounds(50, 220, 100, 50);

        JTextField midTextField = new JTextField();
        frame.add(midTextField);
        midTextField.setBounds(130, 220, 100, 50);


        // FINAL----------------------------------------------------------------
        JLabel finalLabel = new JLabel("FINAL Marks:");
        frame.add(finalLabel);
        finalLabel.setBounds(40, 270, 100, 50);

        JTextField finalTextField = new JTextField();
        frame.add(finalTextField);
        finalTextField.setBounds(130, 270, 100, 50);

        JButton AddAllButton = new JButton("Add All");
        frame.add(AddAllButton);
        AddAllButton.setBounds(300, 270, 100, 50);

        JLabel straightLine = new JLabel("-------------------------------------------");
        frame.add(straightLine);
        straightLine.setBounds(30, 330, 500, 10);


        JLabel totalLabel = new JLabel("Total Marks:");
        frame.add(totalLabel);
        totalLabel.setBounds(40, 350, 100, 50);

        JTextField totalTextField = new JTextField();
        frame.add(totalTextField);
        totalTextField.setBounds(130, 350, 100, 50);

        JButton gradeButton = new JButton("show grade");
        frame.add(gradeButton);
        gradeButton.setBounds(300, 350, 100, 50);

        JLabel gradeLabel = new JLabel("Grade:");
        frame.add(gradeLabel);
        gradeLabel.setBounds(40, 400, 100, 50);

        JTextField gradeTextField = new JTextField();
        frame.add(gradeTextField);
        gradeTextField.setBounds(130, 400, 100, 50);


        AddAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ctMarks = Integer.parseInt(ctTextField.getText());
                int midMarks = Integer.parseInt(midTextField.getText());
                int finalMarks = Integer.parseInt(finalTextField.getText());

                int totalMarks = ctMarks + midMarks + finalMarks;
                totalTextField.setText(Integer.toString(totalMarks));
            }
        });

        gradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ctMarks = Integer.parseInt(ctTextField.getText());
                int midMarks = Integer.parseInt(midTextField.getText());
                int finalMarks = Integer.parseInt(finalTextField.getText());

                int totalMarks = ctMarks + midMarks + finalMarks;

                if(totalMarks>= 90 && totalMarks <= 100){
                    gradeTextField.setText("A(Plain)");
                }else if(totalMarks>= 86 && totalMarks <= 89){
                    gradeTextField.setText("A-(Minus)");
                }else if(totalMarks>= 82 && totalMarks <= 85){
                    gradeTextField.setText("B+(Plus)");
                }else if(totalMarks>= 78 && totalMarks <= 81){
                    gradeTextField.setText("B(Plain)");
                }else{
                    gradeTextField.setText("Fail");
                }


                try{
                    FileWriter stdInfo = new FileWriter("stdInfo.txt", true);
                    stdInfo.write("Student ID: " + stdIDTextField.getText()+"\n");
                    stdInfo.write("Student Grade: " + gradeTextField.getText()+"\n\n\n");
                    stdInfo.close();

                }catch(Exception err){
                    System.out.println("Error: " + err);
                }
            }
        });
//        int ctMarks = Integer.parseInt(ctTextField.getText());



    }
}
