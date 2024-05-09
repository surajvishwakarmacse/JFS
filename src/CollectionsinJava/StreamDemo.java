package CollectionsinJava;

import java.util.*;
import java.util.stream.Collectors;

class Student1
{
    String name;
    Integer id;

    Integer marks;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }

    public Student1(String name, Integer id, Integer marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(400);
        list.add(50);
        list.add(600);
        list.add(87870);
        list.add(830);

        //config  --> filter map
        //processing

        list.stream().filter(i->i>100)
                .forEach(System.out::println);

        List<Integer> collect = list.stream().filter(i -> i > 400)
                .collect(Collectors.toList());
        System.out.println(collect);

        list.stream().map(i->i+1000)
                .forEach(System.out::println);

        Optional<Integer> max = list.stream().max(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(max);



        //list of students
        List<Student1> listOfStudents= Arrays.asList(
                new Student1("raj",533,0),
                new Student1("Eshan",32,344),
                new Student1("Deep",212,432),
                new Student1("rishab",43,544),
                new Student1("Nikhil",1,4567),
                new Student1("kirtidas",4,765),
                new Student1("Genie",2333,34343)
        );

        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        List<Student1> collect1 = listOfStudents.stream()
                .sorted(Comparator.comparingInt(Student1::getId)).collect(Collectors.toList());

        System.out.println(collect1);

        //HW
        // toMap, count,min marks,course

        // Question - No of occurance for subjects against student
        //raj--->math
        //kirti--->eng
        //nikhil--->math
        //math--->2
        //eng--->3

    }
}
