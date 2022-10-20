package pack1;
public class Bike extends Vehicle {
    public Bike(String name, int id) {
        super(name);
        this.id = id;
    }

    public void print() {
        System.out.println(name + " " + id);
    }
}