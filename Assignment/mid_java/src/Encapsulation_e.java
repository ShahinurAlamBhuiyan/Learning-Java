 class Encapsulation_e {
    public int p1 = 5;
    private int p2 = 6;
    protected int p3 = 7;
    int p4 = 8;

    static int p9 = 4;

     public void setter(int p){
        p2 = p;
    }

    public int getter(){
        return p2;
    }
}

final class Child_e extends Encapsulation_e{
    void print(){
        System.out.println(p1);
//        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}

