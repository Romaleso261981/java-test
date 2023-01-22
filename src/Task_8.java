
import java.util.Arrays;

import static java.util.Collections.binarySearch;

public class Task_8 {

    public static void main(String[] args) {
        Number[] age = {12, 4, 5, 2, 5};
        int a = 5;

        calculate(age, a);
    };

//    private static Number[] calculate(Number[] age, int a) {
//        Number[] ageNew = new Number[age.length];
//        for (int i = 0; i < age.length; i++) {
//            if (age[i] % a == 0) {
//                ageNew[i] = age[i];
//            }
//        }
//        return ageNew;
//    }

    private static Number[] calculate(Number[] age, int a) {
        Number[] ageNew = new Number[age.length];
        for (int i = 0; i < age.length; i++) {
            if (age[i] % a == 0) {
                ageNew[i] = age[i];
            }
        }
        return ageNew;
    }


}




