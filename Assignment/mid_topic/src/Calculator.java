 class Calculator {
    public int num1;
    public int num2;
    public int result;

     // Encapsulation.
     private int pri1 = 10;
     protected int prt1 = 12;

     // Using private with getter and setter.
     public int getPri1(){
         return pri1;
     }
     public void setPri1(int pr){
         pri1 = pr;
     }

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
