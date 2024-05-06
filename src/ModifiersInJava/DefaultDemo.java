package ModifiersInJava;

class MyDefaultDemo
{
    int a=100;
    void print()
    {
        System.out.println("Suraj Vishwakarma...");
    }
}
public class DefaultDemo {
    public static void main(String[] args) {
        MyDefaultDemo myDefaultDemo=new MyDefaultDemo();
        System.out.println(myDefaultDemo.a);
        myDefaultDemo.print();
    }
}
