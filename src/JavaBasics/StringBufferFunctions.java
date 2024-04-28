package JavaBasics;

import javax.sound.midi.Soundbank;

public class StringBufferFunctions {
    public static void main(String[] args) {
        //append()
        StringBuffer sb = new StringBuffer("Suraj");
        sb.append("Vishwakarma");
        System.out.println(sb);

        //insert()
        sb.insert(1,123);
        System.out.println(sb);

        //reverse()
        sb.reverse();
        System.out.println(sb);

        //replace()
        sb.replace(6,10,"Hello");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb.capacity());
    }
}
