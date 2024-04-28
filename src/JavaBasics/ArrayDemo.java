package JavaBasics;

public class ArrayDemo {
    public static void main(String[] args) {
//        System.out.println("1st method------------");
//        int arr[] = new int[10];
//
//        for (int i = 0; i <= 9; i++) {
//            arr[i] = i;  //setting value of array through loop
//        }
//        for (int a : arr){
//            System.out.print(a);  //accessing element of array using for each loop
//        }
//        System.out.println();

        System.out.println("2nd method------------");
        int arr[] = {10, 20, 30, 40, 50};
        for (int a : arr)
        {
            System.out.print(a);
        }

        arr[2] = 100; // setting a value in array
        System.out.println("------changed value for arr----");
        for (int a : arr)
        {
            System.out.print(a+" ");
        }

        // length
        System.out.println("Length of array = " + arr.length);
    }
}
