class AnotherCalculator extends NewCalculator{

    @Override
    public  void Subtraction(){
        result = num2 - num1;
    }

    public  AnotherCalculator(int num1, int num2){
        super(num1, num2);
    }

}
