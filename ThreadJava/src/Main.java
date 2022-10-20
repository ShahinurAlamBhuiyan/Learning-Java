// Java Program for sleeping the custom thread.

import java.io.*;
import java.lang.Thread;

import static java.lang.Thread.*;

class GFG extends Thread {

    public void run()
    {
        // thread 0

        // we can also use throws keyword followed by
        // exception name for throwing the exception
        try {
            for (int i = 0; i < 100; i++) {

                // it will sleep the main thread for 1 sec
                // ,each time the for loop runs
                //Thread.sleep(100);

                // This Thread.sleep() method will sleep the
                // thread 0.
                // printing the value of the variable
                System.out.println(i);
            }
        }
        catch (Exception e) {

            // catching the exception
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // main thread
        GFG obj = new GFG();
        obj.start();
        obj.sleep(1000);


        GFG obj2 = new GFG();
       obj2.start();
        obj2.sleep(1000);

        GFG obj3 = new GFG();
       obj3.start();
       // obj.sleep(1000);



    }
}
