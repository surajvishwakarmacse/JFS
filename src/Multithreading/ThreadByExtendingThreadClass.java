package Multithreading;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println("One");
            System.out.println("Two");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println("Three");
            System.out.println("Four");
            i++;
        }
    }
}
public class ThreadByExtendingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
