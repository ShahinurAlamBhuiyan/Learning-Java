 class Calculator {
    int num1;
    int num2;
    int result;

    // constructor
     public Calculator(){};

     public Calculator (int num1, int num2){
         this.num1 = num1;
         this.num2 = num2;
     }

     // Methods
     public  void addition(){
         this.result = num1 + num2;
     }

     public  void getResult(){
         System.out.println(result);
     }

}
