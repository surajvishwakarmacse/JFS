package JavaBasics;

import java.util.Arrays;

public class StringFunctions {
    public static void main(String[] args) {
        //length
        String s = "Suraj Vishwakarma";
        System.out.println(s.length());

        //concatenation
        String s1 =  "suraj";
        String s2 = "Vishwakarma";
        String s3 = s1+s2;
        System.out.println(s3);

        //toCharArray()
        String s4 = "suraj";
        char arr[] = s4.toCharArray();
        System.out.println("to char array = "+ Arrays.toString(arr));

        //charAt()
        String s11 = "suraj";
        System.out.println("char at = "+s11.charAt(1));

        //compareTo()
        String s12 = "Suraj";
        String s13 = "Suraj";

        int res = s12.compareTo(s13);
        System.out.println(res);

        //== reference com equals()

        System.out.println(s12.equals(s13));

        //contains()
        String s15 = "Hello Suraj, Welcome to the Java Full Stack Batch";
        System.out.println(s15.contains("Suraj"));
        System.out.println(s15.contains("Axis"));

        //indexOf()
        System.out.println(s15.indexOf('S'));

        //replace()
        String ss = "Hello Suraj";
        String updt = ss.replace("Suraj","Prakriti");
        System.out.println(updt);

        //substring()
        String r1 = "Hello Suraj, Welcome to the Java Full Stack Batch";
        String r2 = r1.substring(0,11);
        String r3 = r1.substring(6);
        System.out.println(r2);
        System.out.println(r3);
    }
}
