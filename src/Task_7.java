
import java.util.*;

public class Task_7 {
    public static void main(String args[]) {
        printNum(10);
        sumOdd(25);
    }

    public static void printNum(int N) {
        int i;

        for (i = 0; i <= N; i++) {
            System.out.println(i);
        }

    }public static void sumOdd(int N) {
        int i, sum = 0;

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number");
//        N = in.nextInt();

        for (i = 0; i <= N; i++) {
            if ((i % 2) == 1) {
                sum += i;
            }
        }

        System.out.print("Sum of all odd numbers between 0 to "
                + N + " = " + sum);
    }
}