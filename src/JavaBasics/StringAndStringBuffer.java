package JavaBasics;

public class StringAndStringBuffer {
    public static void main(String[] args) {

        //String
        String s1 = "Hello";
        String s2 = s1.concat("World");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        //StringBuffer
        StringBuffer sb = new StringBuffer("Suraj");
        sb.append("Vishwakarma");
        System.out.println(sb);
    }
}
