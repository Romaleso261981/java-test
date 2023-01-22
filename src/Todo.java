
import java.util.Scanner;
import java.util.Arrays;

public class Todo {

    public static void main(String[] args) {
//        Number[] age = {12, 4, 5, 2, 5};
//        System.out.println(Arrays.toString(age));
        Welcome();


    }

    public static void Welcome() {

        System.out.println("Welcome to your Todo Manager!\n");
        System.out.println("Please write any number from 1 to 10 ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number < 10) {
                System.out.println("your number " + number + " is within the given limits");

            } else {
                System.out.println("your number is out of range");
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

        System.out.println(calculate(3, 4));
        System.out.println(calculate(7, 9));
        System.out.println(calculate(11, 26));

    }

    private static int calculate(int a, int b) {
        System.out.println(myMethod(10));
        return a + b;

    }

    static int myMethod(int x) {
        return 5 + x;
    }
}




