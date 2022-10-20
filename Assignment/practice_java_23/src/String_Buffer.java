public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("hello");

        s1.append(" world");
//        System.out.println(s1);

        StringBuffer s2 = new StringBuffer("Never ");
        s2.insert(6, "give up");
        System.out.println(s2);

        StringBuffer s3 = new StringBuffer("Removing String.");
        s3.delete(8,15);
        System.out.println(s3);


        StringBuffer s16 = new StringBuffer();
        System.out.println(s16.capacity());
        s16.append("................1");
        System.out.println(s16.capacity());

    }
}

