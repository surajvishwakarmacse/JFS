package JavaBasics;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Suraj";
        System.out.println(s1);
        String s2 = "Vishwakarma";
        System.out.println(s2);
        String s3 = "Suraj";
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode()) ;
    }
}
