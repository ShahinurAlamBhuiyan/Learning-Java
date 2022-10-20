package zoo.birds;

import zoo.Anima;

class Bird extends Anima{
    String color;
    Bird(){ };
    Bird(String name, int legs, String color){
        super(name, legs);
        this.color = color;
    }
    void print(){
        System.out.println(name + " " +legs + " " + color);
    }
}
