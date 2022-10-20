public class TestAnimal {
    public static void main(String[] args){
        Animal a = new Animal("Rat");
        Dinosaur d = new TRex();
        a.display();
        d.display();
        a=d;
        a.display();
        d =(Dinosaur)a;
        d.display();
    } }

class Animal{
    String name;
    float weight;
    Animal(String n){ name = n; }
    public void display(){
        System.out.println("Animal can be Omnivorous.");
    } }


class Dinosaur extends Animal{ Dinosaur(String n) {
    super(n); }
    public void display(){
        System.out.println("Dinosaur mostly Herbivorous");
    } }
class TRex extends Dinosaur{
    TRex(){ super("TRex");
    }
    public void display(){
        super.display();
        System.out.println("but "+name+" is carnivorous");
    } }