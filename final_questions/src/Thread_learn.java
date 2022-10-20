
public class Thread_learn {
}

class MyStack{
    private int idx = 0;
    private char[] data = new char[6];

    public synchronized void push(char c){
        this.notify();
        if(idx != 5){
            data[idx] = c;
            idx++;
        }
        if(idx==5){

            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public synchronized char pop(){
        try{
            if(idx == 0){
                wait();
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        idx--;
        return data[idx];
    }
}

class StackTest{
    public static void main(String[] args) {
        MyStack s = new MyStack();
        Producer p = new Producer(s);
        Consumer c = new Consumer(s);
        Thread t= new Thread(p);
        Thread t1= new Thread(c);
        t.start();
        t1.start();
    }
}


class Producer implements Runnable{
    private MyStack stack;
    public Producer(MyStack s){
        stack = s;
    }

    @Override
    public void run() {
        char c;
        for(int i = 0; i <50; i++){

            c = (char)(Math.random() * 26 + 'A');
            stack.push(c);
            System.out.println("Producer: " + c);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }



class Consumer implements Runnable{
    private MyStack stack;
    public Consumer(MyStack s){
        stack = s;
    }

    @Override
    public void run() {
        char c;
        for(int i = 0; i <50; i++){
            c = stack.pop();
            System.out.println("Consumer: " + c);
            try {

            Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}