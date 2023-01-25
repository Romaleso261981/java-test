
public class Task_8 {

    public static void main(String[] args) {
        Number[] age = {12, 4, 5, 2, 5};


        calculate(age);
    }

//    private static Number[] calculate(Number[] age, int a) {
//        Number[] ageNew = new Number[age.length];
//        for (int i = 0; i < age.length; i++) {
//            if (age[i] % a == 0) {
//                ageNew[i] = age[i];
//            }
//        }
//        return ageNew;
//    }

    private static void calculate(Number[] age) {
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }


}




