package JavaBasics;

public class SumOfArray {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        int arr[] = {10, 20, 30, 40, 50};
//        int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
//        System.out.println("Sum is: " +sum);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
