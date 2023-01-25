
public class Task_9 {

    public static void main(String[] args) {
        Number[] age = {12, 4, 5, 2, 5};

       System.out.println( recursions(100));

    }

    public static int recursions(int k) {
        if (k > 0) {
            return k + recursions(k - 1);
        } else {
            return 0;
        }
    }

}




