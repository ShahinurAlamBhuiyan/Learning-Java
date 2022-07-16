class Calculator {
    public int num1;
    public int num2;
    public int result;

    // Creating custom constructor =>
    public Calculator(){
        // That's work as default constructor
    }

    // Constructor =>
    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // Methods =>
    public void addition(){
        int sum = this.num1 + this.num2;
        this.result = sum;
    }

    public void getResult(){
        System.out.println("Result: "+result);
    }
}





