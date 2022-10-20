public class Shahin {
    public static void main(String[] args) {
        try {
            int a = 5/0;
            try {
                String s[] = new String[10];

            }finally{
                System.out.println("helllo");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
