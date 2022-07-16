//import java.lang.Override;x
class AnotherCalculator extends NewCalculator{
    // Override parent method..

//    @Override
    public void Subtraction(){
        int subtract = num2 - num1;
        this.result  = subtract;
    }

//    public AnotherCalculator(){
//        // default constructor...
//        super();
//    }

    public AnotherCalculator(int num1, int num2){

        super(num1, num2);
    }

}
