package ExceptionHanglingPackage;


public class ThrowDemo {

    public static void main(String[] args) {

        m1();
    }
    public static void m1()
    {
        try {
            throw new ArithmeticException("Main Reason nhi dunga krna ha jo kr le");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }

    }
}