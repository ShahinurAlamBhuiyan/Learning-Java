class NewCalculator extends Calculator{
    // methods
    public  void Subtraction(){
        result = num1 - num2;
    }
    public  void Multiplication(){
        result = num1 * num2;
//        prt1 = result; // it's protected. but child can use it;
//        pri1 = result; // ERROR. it's private. Only owner class can use it.
    }

    // constructor
    public  NewCalculator(int num1, int num2){
        super(num1, num2);
    }


}
