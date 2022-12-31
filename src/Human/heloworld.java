package Human;

class Human {
    int[] marks = new int[] {11, 3, 5, 12, 8, 4, 7, 2, 15, 10};
    int age = 10;

    public static void main(String[] args) {
        Human human = new Human();
        human.accessToAlcohol();
        human.evenNumber();
        human.buyBread();
    }

    void evenNumber() {
        for (int i = 0; i < marks.length; i += 1) {
            System.out.println(marks[i]);
            if(marks[i] % 2 == 0){
                System.out.println("the number is even");
        }else{
                System.out.println("the number is not even");
            }

    }
    }

    void buyBread() {
        System.out.println("buyBread");
    }

    void accessToAlcohol() {
        if (age > 18) {
            System.out.println("access is open");
        } else {
            System.out.println("access is not open");
        }
    }
}
