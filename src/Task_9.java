import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5};

//
//
        Boolean k = true;
        while (k) {
            log("enter the task number");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println(sumAllElementsArr(age));
                    break;
                case 2:
                    System.out.println(sum(100));
                    break;
                case 3:
                    System.out.println(recursions(100));
                    break;
                case 4:
                    starOutput(100);
                    break;
                case 5:
                    log("5 - Recursive method of exponentiation");
                    break;
                default:
                    System.exit(0);
            }
        }


    }

    public static int recursions(int k) {
        if (k > 0) {
            return k + recursions(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        System.out.println("*"+" "+"*"+" "+"*"+" "+"*"+" "+"*"+" "+"*"+" "+"*");
        System.out.println(" "+" "+"*"+" "+"*"+" "+"*"+" "+"*"+" "+"*"+" "+" ");
        System.out.println(" "+" "+" "+" "+"*"+" "+"*"+" "+"*"+" "+" "+" "+" ");
        System.out.println(" "+" "+" "+" "+" "+" "+"*"+" "+" "+" "+" "+" "+" ");
        return total;
    }
    public static void starOutput(int n) {
        String s = "*"+" ";
         for (int i = 0; i <= n; i++) {
             s = s + "*"+" ";
             System.out.println(s);
        }

    }

    public static int sumAllElementsArr(int[] arr) {
        log("sumAllElementsArr");
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }


    public static void log(String s) {
        System.out.println(s);
    }


}




