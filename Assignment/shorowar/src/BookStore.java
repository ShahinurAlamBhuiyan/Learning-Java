import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {

        book[] arr = new book[100];

        book obj1 = new book("English", 200.00f);
        book obj2 = new book("Math", 234.45f);

        arr[0] = obj1;
        arr[1] = obj2;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Keyword: ");
        char operation = sc.next().charAt(0);

        if(operation == 'a')  {
            String bookname = sc.next();
            double bookprice = sc.nextFloat();

            book obj3 = new book(bookname, bookprice);
            obj3.print();
        }
        else if(operation == 'q')   {

        }
        else if(operation == 'p')   {
//            for(int i=0; i<5; i++)  {
//                arr[i].print();
//            }
            for(book i: arr){
                System.out.println(i);
            }
        }
        else{
            System.out.println("Please choose a valid option");
        }
    }
}