public class StudentAccount {
    public static void main (String args[]){
        // create object
        StudentInformation student = new StudentInformation();

        // accessing object
        student.name = "Shahinur Alam Bhuiyan";
        student.id = "011213075";

        System.out.println("Got befor Scholarship: " + student.scholarShipAmount);

        student.cgpaCalculator(50);

        System.out.println("Student name is : " + student.name);
        System.out.println("Student id is : " + student.id);
        System.out.println("Got after result Scholarship: " + student.scholarShipAmount);

    }
}
class StudentInformation {

    // instance
    public String name;
    public String id;
    public int scholarShipAmount;

    // method
    public void cgpaCalculator(int marks){
         if(marks  > 55){
             scholarShipAmount = 5000;
             System.out.println("Pass.");
         }else {
             scholarShipAmount = 1000;
             System.out.println("Fail.");
         }
    }
}