public class practice {
    public static void main (String args[]){
        boolean b1 = true; // 1 bit
        System.out.println("The boolean result is: ");
        System.out.println(b1);

        byte by1 = 127; // 8 bits => 1 bytes
        short s1 = 12345; // 16 bits => 2 bytes
        int i1 = 1233455; // 32 bits => 4 bytes
        long l1 = 4567893456784567l; // 64 bits => 8 bytes
        System.out.println("The integer data-types are: ");
        System.out.println(by1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        float f1  = 10.5f; // 32 bits => 4 bytes
        double d1 = 12.5; // 64 bits => 8 bytes
        System.out.println("The floating data-types are: ");
        System.out.println(f1);
        System.out.println(d1);

        char ch1 = 'a'; // 16 bits => 2 bytes
        String S1 = "Hello"; //
        System.out.println("The textual data-types are: ");
        System.out.println(ch1);
        System.out.println(S1);

        System.out.println("----------AutoCasting-----------");
        short s2 = by1; // auto casting
        int i2 = s2; // auto casting
        long l2 = i2; // auto casting
        float f2 = i2; // auto casting
        System.out.println(f2);

        System.out.println("----------ExplicitCasting-----------");
        short s3 = (short) i2;
        int i5 = (int) f2;
        System.out.println(i5);

        System.out.println("-----------------Array------------");
        int arr1[] = new int[10];
        float arr2[];
        arr2 = new float[20];
        int arr3[] = {1, 2 , 3, 4};
        int sum = 0;

        arr1[0] = 6;
        arr1[7] = 9;
        arr1[8] = 6;

        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

        for (int x: arr3){
            System.out.println(x);
            sum += x;
            System.out.println(sum);
        }
    }
}
