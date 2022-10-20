package practice;

public class Zoo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Magpie();
        Magpie c = (Magpie) b;
        a.fly();
        b.fly();
        ((Magpie)b).fly(15);
        c.fly();
        a.eat();
        b.eat();
        c.eat();
    }
}

class Animal{
    Animal() {
    System.out.println( "An animal is created."); }
    void fly(){
        System.out.println("Don't know if I can fly!");
    }
    void eat(){
        System.out.println("Eating..."); }
}

class Bird extends Animal{ Bird(){
    System.out.println("A bird is created."); }
    void fly(){ System.out.println("Flying...");
    }
}

class Magpie extends Bird{ Magpie(){
    System.out.println("A magpie is created."); }
    void fly(){
        System.out.println("Magpie is flying...");
    }
    void fly(int speed){
        System.out.println( "Magpie is flying at speed: " + speed);
    }
    void eat(){
        System.out.println( "Magpie is eating."); }
}