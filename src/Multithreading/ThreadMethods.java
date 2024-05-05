package Multithreading;

class MyNewThr1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("Thank you " + this.getName());
            i++;
        }
    }
}
class MyNewThr2 extends Thread {
    public void run() {
        int i = 0;
        while (i <3) {
            System.out.println("My Thank you " + this.getName());
            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
