package pack1.pack2;

import pack1.*;

public class Car extends Vehicle {
    public Car(String name, int id){
        super(name);
        this.id=id;
    }
    void print(){
        System.out.println(getName() + " " + id);
    }
}

class Main {
    public static void main(String args[]) {
        Vehicle v = new Vehicle("Cart");
        System.out.println(v.getName());
        Car c = new Car("BMW", 101);
        c.print();
        Bike b = new Bike("Pulsar", 102);
        b.print();
    }
}