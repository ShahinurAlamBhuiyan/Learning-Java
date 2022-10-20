public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Jon", 70, "medium", "brave");
        Human human2 = new Human("San.", 100, "high", "not brave");

        CookieMonster coo = new CookieMonster(100);
        coo.scare(human1);
        coo.scare(human2);
        coo.eat();
        System.out.println(coo);

        ScaryMonster doggo = new ScaryMonster(500);
        doggo.eat(human1);
        doggo.eat(human2);
        System.out.println(doggo);
    }
}



abstract class Monster{
    int weight;
    int scareCount;
    public Monster(int weight) {
        this.weight = weight;
    }
    abstract void scare(Human h);
    void eat(){
        weight++;
    }

     void eat(Human h){
        weight++;
     }

     public String toString(){
        return (weight +" "+ scareCount);
     }
}



class CookieMonster extends Monster{
    public CookieMonster(int weight){
        super(weight);
    }

    public void scare(Human h){
        if((h.bravery).equals("not brave")){
            scareCount++;
            System.out.println("Kamor dilo reee");
        }
    }
}


class ScaryMonster extends Monster{
    public ScaryMonster(int weight){
        super(weight);
    }

    public void scare(Human h){
        if(!h.isIntelligent()){
            scareCount++;
            System.out.println(h.name);
        }
    }
}

interface Animal{

     boolean isIntelligent();
     void expectedHeight();

}

class Human implements  Animal{
    int weight;
    String name;
    String intelligence;
    String bravery;

    public Human(String name,int weight, String intelligence, String bravery){
        this.weight = weight;
        this.name = name;
        this.intelligence = intelligence;
        this.bravery = bravery;
    }

    public boolean isIntelligent(){
        if(intelligence.equals("high"))
            return true;
        else
            return false;

    }
    public void expectedHeight(){
        System.out.println("hello");
    }
}

// void aboutHuman(int weight){
    // height = weight / 2;
//}