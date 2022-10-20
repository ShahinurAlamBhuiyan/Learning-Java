// What is ArrayList ?
// -> The ArrayList class is a resizable array, which can be found in java.util package.

// What is the difference between Array & ArrayList ?
// -> The main difference is modification. The size of an 'ARRAY' can't be modified.
//    (Like, if we need to remove/add/update an array item by not creating a new array)
//     for that we need to use 'ARRAYLIST'.

// Declaration -> ArrayList<ArrayType> arrayName = new ArrayList<ArrayType>();

import java.util.ArrayList; // importing ArrayList from package.
import java.util.Scanner;
class DeveloperArrayList {
    ArrayList<String> names = new ArrayList<String>(); // Declaring arrayList.

    // ArrayList methods.
    void addingArrayInput(){
        names.add("Shahin");
        names.add("Tonmay");
        names.add("fahad");
        names.add("Sabbir");
        names.add("Naim");
    }

    Scanner sc = new Scanner(System.in);
    void addingArrayByLoop(){
        for (int i = 1; i <= 5; i++){
            names.add(sc.next());
        }
    }

    void arraySize(){
        System.out.println(names.size());

    }

    void showArray(){
        System.out.println(names);
        for(String i : names){
            System.out.println(i);
        }
    }

    void getArrayItem(){
        System.out.println(names.get(0));
//        System.out.println(names.get(5)); -> Throwing error. Index: 5, Size: 5;
    }

    void setArrayItem(){
        names.set(0, "Shahinur Alam Bhuiyan");
    }

    void removeArrayItem(){
        names.remove(0);
    }

    void clearAllArrayItems(){
        names.clear();
    }
}
