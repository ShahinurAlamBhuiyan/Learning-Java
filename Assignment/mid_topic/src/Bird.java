class Bird extends Animal {
    public Bird(String name, String color){
        super(name, color, 0.0);
    }

    @Override
    public void makeSound(){
        System.out.println("I can sound Chirp!");
    }
}

class Tiger extends Animal{
    public Tiger(String name, String color){
        super(name, color, 0.0);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}