class NewCalculator extends Calculator {

    // Methods
    public void Subtraction(){
        int subtract = num1 - num2;
        result = subtract;  // result is from parent class -> Calculator
    }

    public void Multiplication(){
        int multiply = num1 * num2;
        this.result = multiply;
    }

    // Constructors.
//    public NewCalculator(){
//        // That's work as default constructor
////        super();
//    }

    // Constructor =>
    public NewCalculator(int num1, int num2){
        super(num1, num2);
    }
}
