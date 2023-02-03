import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        String some = "String";


//
//
        Boolean k = true;
        while (k) {
            log("enter the task number");
            log("press 1 to select a method that reverses a string.");
            log("press 2 to select a method returns the sum of the numbers up to the given number N");
            log("press 3 to select a method prints the square of the number to the console.");
            log("press 4 to select a method returns an array of all values stored in Enum:");
            log("press 5 to select a method returns an Enum object corresponding to the passed name:");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println(stringReverse(some));
                    break;
                case 2:
                    System.out.println(sum(100));
                    break;
                case 3:
                    System.out.println(square(3));
                    break;
                case 4:
                    System.out.println(Arrays.toString(DayOfWeek.values()));
                    break;
                case 5:
                    dayOfWeek();
                    break;
                default:
                    System.exit(0);
            }
        }


    }

    public static int square(int a) {
        int result = a * a;
        return result;
    }

    public static int sum(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        System.out.println("*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*");
        System.out.println(" " + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + " ");
        System.out.println(" " + " " + " " + " " + "*" + " " + "*" + " " + "*" + " " + " " + " " + " ");
        System.out.println(" " + " " + " " + " " + " " + " " + "*" + " " + " " + " " + " " + " " + " ");
        return total;
    }

    public static void dayOfWeek() {
        DayOfWeek sunday = DayOfWeek.valueOf("SUNDAY");
        System.out.println(sunday);
    }

    public enum DayOfWeek {

        SUNDAY ("Воскресенье"),
        MONDAY ("Понедельник"),
        TUESDAY ("Вторник"),
        WEDNESDAY ("Среда"),
        THURSDAY ("Четверг"),
        FRIDAY ("Пятница"),
        SATURDAY ("Суббота");

        private String title;

        DayOfWeek(String title) {
            this.title = title;
        }


        @Override
        public String toString() {
            return "DayOfWeek{" +
                    "title='" + title + '\'' +
                    '}';
        }
    }

    public static String stringReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }


    public static void log(String s) {
        System.out.println(s);
    }


}




