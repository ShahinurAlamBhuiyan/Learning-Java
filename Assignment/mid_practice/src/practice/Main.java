package practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("The area A of a rectangle is given by the formula, A=lw, where l is the length and w is the width.");
        Area a1 = new Area(5, 6);
        System.out.println(a1.returnArea());
    }
}


class Area{
    private  int length;
    private  int width;

    Area(int length, int width){
        this.length = length;
        this.width = width;
    }

    int returnArea(){
        return length * width;
    }
}