package Multithreading;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println("I am thread");
            i++;
        }
    }
}
public class ConstructerFromThreadClass {
    public static void main(String[] args) {
        MyThr t = new MyThr("Suraj");
        t.start();
        System.out.println("The id of the thread t is: "+t.getId());
        System.out.println("The name of the thread t is: "+t.getName());
    }
}
