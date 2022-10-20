package com.company;

public class LearnString {
    public static void main (String[] args) {
        String name = "Shahin";
        String nonTrimmed = "    shahin    ";
        // 1. System.out.println(name.length()); // 6
        // 2. System.out.println(name.toLowerCase()); // shahin -> lowercase
        // 3. System.out.println(name.toUpperCase()); // SHAHIN -> uppercase

        // 4. System.out.println(nonTrimmed.trim()); // shahin -> remove all extra spaces.

        // 5.1 System.out.println(name.substring(1)); // hahin -> start without 1st (S) position
        // 5.2 System.out.println(name.substring(1, 5)); // hahi  -> start without 1st position & end with last.

        // 6.1 System.out.println(name.replace('h', 'k'));
        // 6.2 System.out.println(name.replace("hin", "kin")); // hin will replace kin

        // 7. System.out.println(name.charAt(4)); // shahin -> i -> 4 index is i;

       // 8.1 System.out.println(name.indexOf("ah")); // shahin -> ah start in 2 position -> 2
       // 8.2 System.out.println(name.indexOf("h", 2)); // shahin -> searching from string 2 -> output: 3

       // buji ny System.out.println(name.lastIndexOf("h", 5)); // shahin

        // 10.1 System.out.println(name.equals("ShAhin")); // false -> case sensative
        // 10.2 System.out.println(name.equalsIgnoreCase("sHAhIN")); // true -> ignore case









    }
}
