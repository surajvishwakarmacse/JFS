package OOPs;

class A {
    String city;
}

class B1 extends A {
    String city;
    void print()
    {
        super.city = "Agra";
        city = "Delhi";
        System.out.println("Parent city = "+super.city+", Child city = "+ city);
    }
}
public class SuperKeywordDemo {
    public static void main(String[] args) {
        B1 b = new B1();
        b.print();
    }
}
