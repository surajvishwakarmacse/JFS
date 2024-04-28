package JavaBasics;

public class PatternDemo {
    public static void main(String[] args) {
        System.out.println("Printing Pattern");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int i =5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
