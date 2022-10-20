public class TestBankAccount {
    public static void main(String[] args) {
        // Creating object ======================>
        BankAccount account1 = new BankAccount();

        // Accessing class property...
        account1.name = "Shahin Bhutan";
        account1.id = "011213075";
        account1.balance = 5000;
        account1.number = 123456789;

        System.out.println("Balance before:" + account1.balance);

        // Calling methods...
        account1.deposit(500);

        System.out.println("Balance after:" + account1.balance);

        account1.withdraw(1500);

        System.out.println("Balance after: " + account1.balance);

    }
}


// Creating class ======================>
class BankAccount{
    // instance variable...
    public String name;
    public String id;
    public double balance;
    public int number;

    // Methods...
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount < balance){
            balance -= amount;
        }
    }
}
