package OOPs;

class Parent {

    String name;

    Parent(String n)
    {
        name=n;
    }

}

public class Constructoredemo extends Parent{

    String name;

    Constructoredemo(String n1,String n2) {
        super(n1);
        this.name=n2;
    }
    void print()
    {
        System.out.println(super.name+"  " +name);
    }

    public static void main(String[] args) {
        Constructoredemo child=new Constructoredemo("Parent","Child");
        child.print();
    }
}
