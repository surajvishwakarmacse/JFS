package ExceptionHanglingPackage;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        m1();
    }

    public static void m1()
    {
        System.out.println("Hello M1");
        m2();
        System.out.println("Bye M1");

    }

    public static void m2()
    {
        System.out.println("Hello M2");
        try{
            System.out.println("In try block");
            System.out.println(10/0);
            System.out.println("try block"); // line 22
        }
        catch (Exception e)
        {
            System.out.println("aao bhai exception");
            //e.printStackTrace(); // location + description + error name
            //e.toString(); //error name + description
            // System.out.println(e.toString());
            //e.getMessage(); //description
            //System.out.println(e.getMessage());

        }
        finally {
            System.out.println("Mai hu done");
        }
        System.out.println("Bye M2");

    }
}

