public class Main {
    public static void main(String[] args) {
        Box myObj = new Box();
        myObj.value = "John";
        System.out.println(myObj.value);
        Box myObj2 = new Box();
        myObj2.value = "Steven";
        System.out.println(myObj2.value);
    }
}


class Box {
    String value = "";

    public String getName() {
        return value;
    }

    public void setName(String newName) {
        this.value = newName;
    }
}

