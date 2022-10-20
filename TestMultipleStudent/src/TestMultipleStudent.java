import java.util.Scanner;
public class TestMultipleStudent {
    public static void main(String[] args) {
        // taking input from user
        Scanner sc = new Scanner(System.in);

        String std4Name = sc.nextLine();
        String std4Id = sc.next();
        float std4Cgpa = sc.nextFloat();
        int std4CCredit = sc.nextInt();


        Student std4 = new Student();
        std4.name = std4Name;
        std4.id = std4Id;
        std4.cgpa = std4Cgpa;
        std4.completedCredit = std4CCredit;


//        Student std3 = new Student(std3Cgpa, std3CompletedCgpa);
        // Creating object.
        Student std1 = new Student(); // value null / 0;// constructor..
        std1.name = "Nafis Hossain";
        std1.id = "011213075";
        std1.completedCredit = 40;
        std1.cgpa = 3.5f;

        // second constructor

        Student std2 = new Student("Tonmay", "011213064", 3.5f, 30);




//        System.out.println("Student-1  Name: " + std1.name + "\n" +"Student-1 Id: "+std1.id + "\n");
//        System.out.println("Student-2 Cgpa: " + std2.cgpa + "\n" +"Student-2 Completed Credit: "+std2.completedCredit + "\n");
//        System.out.println("Student-3 Cgpa: " + std4.cgpa + "\n" +"Student-3 Completed Credit: "+std4.completedCredit + "\n");

        System.out.println("Student-4 Name: " + std4.name + "\n" +"Student-4 Id: "+std4.id + "\n" +"Student-4 Cgpa: " + std4.cgpa + "\n" +"Student-4 Completed Credit: "+std4.completedCredit + "\n");
        std4.updateCgpa(3, 4.0f);
        System.out.println("Student-4 Name: " + std4.name + "\n" +"Student-4 Id: "+std4.id + "\n" +"Student-4 Cgpa: " + std4.cgpa + "\n" +"Student-4 Completed Credit: "+std4.completedCredit + "\n");

    }
}