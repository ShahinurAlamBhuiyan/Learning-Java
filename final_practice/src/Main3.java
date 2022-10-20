import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        User user = new User(userName);
        try{
            user.coverChar();
        } catch (NameError e) {
            System.out.println(e);
        }
    }
}

class User{
    String name;
    public User(String username){
        name = username;
    }

    char capital[] = new char[10];
    public void coverChar() throws NameError{
        String[] namePart = name.split(" ");
//        if(name.charAt(name.length()-1) == 'y'){
        if(name.endsWith("y")){
            name = name.substring(0, name.length()-1) + 'e';
            System.out.println(name);

            throw new NameError();
        }else{
            for(String s: namePart){
                System.out.print(s.toUpperCase().charAt(0));
            }
        }

    }
}

class NameError extends Exception{
    public NameError(){
        super("NameError");
    }
}