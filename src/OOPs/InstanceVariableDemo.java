package OOPs;

public class InstanceVariableDemo {

    int a = 10; //instance
    int b;
    public static void main(String[] args) {
        InstanceVariableDemo instance = new InstanceVariableDemo();
        System.out.println(instance.a);
        System.out.println(instance.b);
    }
    public void Demo()
    {
        System.out.println(a);
    }
}
