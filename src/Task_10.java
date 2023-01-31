import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5};

//
//
        Boolean k = true;
        while (k) {
            log("enter the task number");
            log("check whether the given term ends with the specified substring ---- write 1");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            switch (num) {
                case 1:
                    endsWithTheSpecifiedSubstring();
                    break;
                case 2:
                    sum();
                    break;
                case 3:
                    recursions();
                    break;
                case 4:
                    starOutput();
                    break;
                case 5:
                    log("5 - Recursive method of exponentiation");
                    break;
                default:
                    System.exit(0);
            }
        }


    }

    public static void endsWithTheSpecifiedSubstring() {
        String s = "Recursive method";
        String suffix = "tid";
        boolean bool1 = s.endsWith(suffix);

        System.out.println(bool1);
    }

    public static void sum() {
    }

    public static void recursions() {

    }

    public static void starOutput() {
    }

    public static void log(String s) {
        System.out.println(s);
    }
}
