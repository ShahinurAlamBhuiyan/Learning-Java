abstract class Animal {
    // Instance variables.
    String name;
    String color;
    double weight;

    // Constructors.
    Animal(){};
    Animal(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    };
    Animal(String name, String color){
        this(name, color, 0.0);
    }


    // Methods.
    void sayHi(){
        System.out.println("Hello beautiful " + name +", How are you?, your color is " + color);
    };

    // Abstract method.
    public abstract void makeSound();

}
