public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator(5,3);
        calc.addition();
        calc.getResult();

        NewCalculator calc1 = new NewCalculator(5, 3);
        calc1.Subtraction();
        calc1.getResult();
        calc1.Multiplication();
//        calc1.getResult();
//calc1.

        AnotherCalculator calc2 = new AnotherCalculator(5,3);
        calc2.Subtraction();
        calc2.getResult();
        calc2.Multiplication();
        calc2.getResult();


    }
}
