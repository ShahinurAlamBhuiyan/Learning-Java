package com.company;
import java.util.Scanner;

public class TakingInput {
    public static void main (String[] args){
        System.out.println("It's working!");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String str1 = sc.nextLine();
        String str = sc.next();

        String str2 = sc.next();

        System.out.print(a);
        System.out.print(str);
        System.out.print(str1);
        System.out.print(str2);
    }
}
