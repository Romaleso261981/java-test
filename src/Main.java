public class Main {
    public static void main(String[] args) {
        Box myObj = new Box(22, "John");
//        myObj.value = "John";
        System.out.println(myObj.value);
        System.out.println(myObj.age);
        Box myObj2 = new Box(37, "Steven");
//        myObj2.value = "Steven";
        System.out.println(myObj2.value);
        System.out.println(myObj2.age);

    }
}


class Box {
    String value = "";
    int age;
    public Box(int y, String name) {
        age = y;
        value = name;
    }

    public String getName() {
        return value;
    }

    public void setName(String newName) {
        this.value = newName;
    }
}


