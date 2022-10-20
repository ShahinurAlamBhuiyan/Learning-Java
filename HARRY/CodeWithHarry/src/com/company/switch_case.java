package com.company;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        System.out.println("Please, enter your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age){
            default -> System.out.println("default!");
            case 1 -> {
                System.out.println("case 1");
                System.out.println("case 1.1");
            }
            case 2 -> System.out.println("case 2");
            case 3 -> {
                System.out.println("case 3");
                System.out.println("case 3.1");
            }
        }


        switch (age){
            default:
                System.out.println("Enjoy!");
                break;
            case 18:
                System.out.println("Adult!");
                break;
            case 21:
                System.out.println("Marry!");
                break;
            case 26:
                System.out.println("Job!");
                break;
            case 30:
                System.out.println("Rich!");
                break;
        }
    }
}
