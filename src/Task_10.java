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
            log("String objects contain the same data ---- write 2");
            log("compares the given string with another string, ignoring the case ---- write 3");
            log("determines whether the period begins with a sub-period ---- write 4");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            switch (num) {
                case 1:
                    endsWithTheSpecifiedSubstring();
                    break;
                case 2:
                    stringObjectsContainTheSameData();
                    break;
                case 3:
                    comparesTheGivenStringWithAnotherStringIgnoringTheCase();
                    break;
                case 4:
                    determinesWhetherPeriodBeginsWithSubPeriod();
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

    public static void stringObjectsContainTheSameData() {
        String s = "Recursive method";
        String suffix = "tid";
        boolean bool1 = s.endsWith(suffix);

        System.out.println(bool1);
    }

    public static void comparesTheGivenStringWithAnotherStringIgnoringTheCase() {
        String s = "Stephen Edwin King";
        String s2 = "Walter Winchell";
        boolean bool1 = s.equalsIgnoreCase(s2);

        System.out.println(bool1);
    }

    public static void determinesWhetherPeriodBeginsWithSubPeriod() {
        String s = "Stephen Edwin King";
        String subPeriod = "Ste";

        boolean bool1 = s.startsWith(subPeriod);
        System.out.println(bool1);
    }

    public static void log(String s) {
        System.out.println(s);
    }
}
