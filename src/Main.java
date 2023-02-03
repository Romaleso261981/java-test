public class Main {
    public static void main(String[] args) {
        Box myObj = new Box(22);
        myObj.value = "John";
        System.out.println(myObj.value);
        System.out.println(myObj.age);
        Box myObj2 = new Box(37);
        myObj2.value = "Steven";
        System.out.println(myObj2.value);
        System.out.println(myObj2.age);

    }
}


class Box {
    String value = "";
    int age;
    public Box(int y) {
        age = y;
    }

    public String getName() {
        return value;
    }

    public void setName(String newName) {
        this.value = newName;
    }
}


