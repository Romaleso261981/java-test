
import java.util.*;

public class Task_7 {
    public static void main(String args[]) {
//        printNum(10);
//        sumOdd(25);
//        ollSumNum(10);
        ascendingArr();
//        descendingArr();
    }

    public static void printNum(int N) {
        int i;

        for (i = 0; i <= N; i++) {
            System.out.println(i);
        }

    }

    public static void ollSumNum(int N) {
        int sum = 0;

        for (int i = 0; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum of all numbers between 0 to "
                + N + " = " + sum);
    }


    public static void sumOdd(int N) {
        int sum = 0;

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number");
//        N = in.nextInt();

        for (int i = 0; i <= N; i++) {
            if ((i % 2) == 1) {
                sum += i;
            }
        }

        System.out.println("Sum of all odd numbers between 0 to "
                + N + " = " + sum);
    }

    public static void ascendingArr() {
        int [] arr = new int [] {5, 2, 8, 7, 1};
        int temp = 0;

        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void descendingArr() {
        int [] arr = new int [] {5, 2, 8, 7, 1};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}