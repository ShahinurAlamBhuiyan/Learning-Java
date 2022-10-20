package practice;

public class FruitShop {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple", 3.5, 110); Fruit fruit2 = new Fruit("Mango", 5, 90);
        fruit1.reducePricePerKG(10); fruit2.increasePricePerKG(20);
        fruit1.printDetails();
        fruit2.printDetails(); }
}

class Fruit{
    String name;
    double weight;
    double price;

    Fruit(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    void reducePricePerKG(int a){
        price -= a;
    }
    void increasePricePerKG(int a){
        price += a;
    }
    void printDetails(){
        System.out.println("Fruit Details:");
        System.out.println("Name: "+name);
        System.out.println("Weight: "+weight);
        System.out.println("Price per kg: "+price);
        System.out.println("Total price: "+price*weight);

    }

}
