class NewCalculator extends Calculator{
    // methods
    public  void Subtraction(){
        result = num1 - num2;
    }
    public  void Multiplication(){
        result = num1 * num2;
    }

    // constructor
    public  NewCalculator(int num1, int num2){
        super(num1, num2);
    }
}
