
public class Task_9 {

    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5};

//        System.out.println(recursions(100));
//        System.out.println(sum(100));
        System.out.println(sumAllElementsArr(age));



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
        return total;
    }

    public static int sumAllElementsArr(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }


}




