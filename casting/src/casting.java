public class casting {
    public  static void main (String args[]){
        // Example pair about AUTO CASTING.
        // if the size of second data type is larger than first data type. then it automatically cast.
        short s1 = 129;
        int i1 = s1;
        long l1 = s1;

        int i2 = 345;
        float f1 = i2;
        double d1 = i2;



        // if the size of second data type is smaller than first data-type. Then the casting called Explicit casting.


        // Example of EXPLICIT TYPE CASTING.
        int i3 = 345;
        // short s3 = i3; // COMPILER ERROR;
        short s3 = (short) i3; // Explicit casting

        float f2 = 45.6f;
        int i4 = (int) f2; // Explicit casting

        long l2 = 100000; // int also contain this...so not type cast.
        long l3 = 10000000000l; // it's not in int. that's why we have to cast using l.
    }
}
