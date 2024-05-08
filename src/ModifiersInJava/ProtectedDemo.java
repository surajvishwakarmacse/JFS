package ModifiersInJava;

class MyProtectedClass
{
    protected int a=199;
    protected void display()
    { 
        System.out.println("Protected Modifier");
    }
}
public class ProtectedDemo {
    public static void main(String[] args) {
        MyProtectedClass myProtectedClass=new MyProtectedClass();
        System.out.println(myProtectedClass.a);
        myProtectedClass.display();
    }
}