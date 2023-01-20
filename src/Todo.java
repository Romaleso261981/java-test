
import java.util.Scanner;


public class Todo {

    public static void main(String[] args) {
        Number[] age = {12, 4, 5, 2, 5};
        System.out.println(Arrays.toString(age));
    }

    public static void Welcome() {

        System.out.println("Welcome to your Todo Manager!\n");
        System.out.println("Please Enter your Name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println(name);
        if (name == "Roma") {
            System.out.println("Hello " + name);
        }
        System.out.println("Name not correct");

    }

    ;



}