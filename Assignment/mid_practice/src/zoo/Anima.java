package zoo;

public class Anima {
    public String name;
    protected int legs;
    public Anima(){};
    public Anima(String name, int legs)
    { this.name = name;
        this.legs = legs;
    }
     void print(){
        System.out.println(name + " " + legs);
    }
}