public class learn_Abstraction_interface {
    public static void main(String[] args) {
        Books b1 = new pen();
        b1.saySalam();

        Books b2 = new pen();
        b2.greetings();
    }
}


abstract class Books{
    void sayHi()
    {
        System.out.println("Hi there!");
    }

    abstract protected void greetings();
    abstract void saySalam();
}


abstract class page extends Books{

    public void greetings()
    {
        System.out.println("Hello!");
    }
}

class pen extends page {
    void saySalam()
    {
        System.out.println("Assalamu Alaikum.");
    }
}