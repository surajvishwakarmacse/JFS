package OOPs;

class Parent1{

    void display()
    {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent1{
    void display()
    {
        System.out.println("This is the Child class");
    }

}


public class UpDownCasting {

    public static void main(String[] args) {

        Parent1 p = new Parent1();
        p.display();


        p=(Parent1) new Child(); //upcasting.
        p.display();

        Child c= (Child) p;  //downcasting
        c.display();

    }
}