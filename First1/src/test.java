public class test {
    public static void main(String[] args) {
        java o=new java();
        o.update(o);
        System.out.println(o.b);
       // opp o1= new opp();
       // System.out.println(o1.b);
       // o1.b=99;
       // o1.update(o1);
        //System.out.println(o1.b);

    }
}
class opp{

    int b=0;
    void update(opp o){
       // System.out.println(b);
        System.out.println(o.b);
        System.out.println(this.b);
        b=100;
    }
}
class java extends opp{
   //@Override
    void update(java o){
       b++;
       // super.update(o);

    }
}