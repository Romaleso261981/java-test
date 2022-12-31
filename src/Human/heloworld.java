package Human;

class Human {
    int age;

    public static void main(String[] args) {
        Human human = new Human();
        human.buyBread();
        human.buyMilk();
        human.accessToAlcohol();
        System.out.println("helloWorld");
    }

    void buyMilk() {
        System.out.println("buyMilk");
    }

    void buyBread() {
        System.out.println("buyBread");
    }

    void accessToAlcohol() {
        int age = 19;
        if (age > 18) {
            System.out.println("access is open");
        } else {
            System.out.println("access is not open");
        }
    }
}
