package CollectionsinJava;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        System.out.println(vector.capacity()); //cc
        for (int i = 0; i <10 ; i++) {
            vector.addElement(i);
        }
        System.out.println("*****************");
        System.out.println(vector.capacity());//
        vector.addElement(90);
        System.out.println(vector.capacity());
        System.out.println("------------------");
        System.out.println(vector);
        //vector
        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements())
        {
            Integer integer = elements.nextElement();
            System.out.println(integer);
        }

        System.out.println("0000000000000000000000000000000");
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(250);
        list.add(30);
        list.add(40);
        Collections.sort(list);
        System.out.println("Sorted lis ="+list);
        System.out.println("111111111111111111111111111");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("2222222222222222222222");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

    }
}
