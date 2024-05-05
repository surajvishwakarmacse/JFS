package Multithreading;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;

        while (i<10){
            System.out.println("Thank you " + this.getName());
            i++;
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Suraj1");
        MyThr1 t2 = new MyThr1("Suraj2");
        MyThr1 t3 = new MyThr1("Suraj3");
        MyThr1 t4 = new MyThr1("Suraj4");
        MyThr1 t5 = new MyThr1("Suraj5(Most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
