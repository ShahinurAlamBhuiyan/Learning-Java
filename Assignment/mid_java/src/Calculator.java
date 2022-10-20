class Calculator{
    int num1,  num2, result;
    Calculator(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }

    void addition(){
        result = num1 + num2;
    }

    void getResult(){
        System.out.println("Result: " + result);
    }
}


class NewCalculator extends Calculator{
    void Substraction(){
        result = num1 - num2;
    }
    void Multiplication(){
        result = num1 * num2;
    }
    NewCalculator(int n1, int n2){
        super(n1, n2);
    }
}

class AnotherCalculator extends NewCalculator{
    @Override
    void Substraction(){
        result = num2-num1;
    }

    AnotherCalculator(int n1, int n2){
        super(n1, n2);
    }
}